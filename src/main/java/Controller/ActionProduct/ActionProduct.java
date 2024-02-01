package Controller.ActionProduct;

import Button.Button;
import Color.WindowColor;
import Components.BoxItem;
import Components.JavaAlertMessage;
import Components.SubtotalPanel;
import Constant.JavaConnection;
import Constant.JavaConstant;
import Constant.JavaRoute;
import Event.ButtonEvent;
import Model.PackageProduct.ProductModel;
import Model.ProductModel.ProductDataModel;
import Model.ProductModel.ProductSuccessData;
import Products.ProductBox;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

public class ActionProduct {

     DecimalFormat df = new DecimalFormat("#,##0.00 kg");
     DecimalFormat dm = new DecimalFormat("$ #,##0.00");
     DecimalFormat bar = new DecimalFormat("########00000000");
     DecimalFormat kh = new DecimalFormat("#,##0");

     private Button btnLogin;
     private JLabel boxUserName;
     private JPanel category;
     private JPanel panelProduct;
     private JScrollPane jScrollPaneCategory;
     private JPanel detailItem;
     private JPanel boxOne;
     private SubtotalPanel subtotalPanel;
     private Button btnPayment;
     private JPanel panelPagination;
     private int count;

     public ActionProduct() {
     }

     public void product(int catId, int limit) {
          try {
               Response response = JavaConnection.get(JavaRoute.getProductByCatId + "?catId=" + catId + "&limit=" + limit + "");

               if (response.isSuccessful()) {
                    String responseData = response.body().string();

                    ObjectMapper objMap = new ObjectMapper();
                    ProductSuccessData data = objMap.readValue(responseData, ProductSuccessData.class);
                    ProductDataModel[] listData = data.getData();
                    setCount(data.getCount());
                    assignProduct(listData);
               } else {
                    System.err.println("fail loading product");
               }
          } catch (Exception e) {
               System.err.println("error getting product " + e);
          }
     }

     public void assignProduct(ProductDataModel[] listData) {
          ArrayList<ProductModel> listProduct = new ArrayList<>();
          for (int i = 0; i < listData.length; i++) {
               var obj = listData[i];
               ProductModel product = new ProductModel(
                    obj.getID(),
                    obj.getCatID(),
                    obj.getFlag(),
                    obj.getWeight(),
                    obj.getCost(),
                    obj.getProImageName(),
                    obj.getPrice(),
                    obj.getBarcode(),
                    obj.getProNameKh(),
                    obj.getProNameEn(),
                    obj.getProductStatus(),
                    obj.getDiscount(),
                    obj.getQty()
               );
               listProduct.add(product);

          }
          appendProduct(listProduct);
     }

     void appendProduct(ArrayList<ProductModel> listProduct) {

          GridBagLayout gridBagLayout = new GridBagLayout();
          gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0}; // one row has 5 column
          gridBagLayout.rowWeights = new double[]{0, 0, 0, 0, 1};
          gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
          gridBagLayout.columnWeights = new double[]{0, 0, 0, 0, 1};

          panelProduct.setLayout(gridBagLayout);

          int x = 0;
          int y = 0;

          for (int i = 0; i < listProduct.size(); i++) {

               GridBagConstraints gbc = new GridBagConstraints();
               gbc.gridx = x;
               gbc.gridy = y;
               gbc.gridwidth = 1;
               gbc.anchor = gbc.NORTH;
               gbc.insets = new Insets(5, 0, 5, 10);
               x++;
               if (x == 5) {
                    x = 0;
                    y++;
               }
               var listData = listProduct.get(i);
               double price = listData.getPrice();
               double discount = (listData.getDiscount() * price) / 100;
               ProductBox product = new ProductBox();
               // event button buy
               ButtonEvent event = new ButtonEvent() {
                    @Override
                    public void onMouseClick() {
                         int qty = Integer.valueOf(product.getQty());
                         if (qty == 0) {
                              JavaAlertMessage j = new JavaAlertMessage(new JFrame(), true);
                              j.setMessage("No Qty");
                              j.setVisible(true);
                              return;
                         }
                         qty--;
                         product.setQty("" + qty);

                         if (!listData.getProductStatus().isEmpty()) {
                              if (JavaConstant.checkOpenShift) {
                                   eventBtnBuy(listData);
                              } else {
                                   System.out.println("Open shift to processing sale!");
                              }
                         } else {
                              JavaAlertMessage j = new JavaAlertMessage(new JFrame(), true);
                              j.setMessage("Product not avalible for sale!");
                              j.setVisible(true);
                         }
                    }
               };

               product.setQty("" + listData.getQty());
               product.initEvent(event);
               product.setProductStatus(listData.getProductStatus());
               product.setDiscountPercentag(listData.getDiscount(), price);
               String productName;
               if (listData.getProductNameEn().length() > 35) {
                    productName = listData.getProductNameEn().substring(0, 34) + "...";
               } else {
                    productName = listData.getProductNameEn();
               }

               product.setProductName("<html>" + productName + "</html>");
               product.setWeight(listData.getWeight());

               if (listData.getDiscount() > 0) {
                    double discountPrice = price - (listData.getDiscount() * price) / 100;
                    product.setPrice(dm.format(discountPrice));
               } else {
                    product.setPrice(dm.format(price));
               }

               product.setBarcode(listData.getBarcode());
               // read image from api 
               try {
                    Response responseProductImg = JavaConnection.get(JavaRoute.readImage + listData.getProImageName());
                    byte[] imagePro = responseProductImg.body().bytes();
                    product.setProductImage(new ImageIcon(imagePro));

                    Response img = JavaConnection.get(JavaRoute.readImage + listData.getFlag());
                    byte[] imgs = img.body().bytes();
                    product.setFlagImage(new ImageIcon(imgs));

               } catch (Exception e) {
                    System.err.println("error read image = " + e);
               }

               panelProduct.add(product, gbc);
          }
     }

     // method total is same but they do action different
     public void total(double price, Component[] listCom, double discountProduct, SubtotalPanel subtotalPanel) {
          double sumAmountUsd = price;
          double sumDiscount = discountProduct;
          if (listCom.length != 0) {
               for (int i = 0; i < listCom.length; i++) {
                    var data = ((BoxItem) listCom[i]);
                    // sub total usd
                    sumAmountUsd += JavaConstant.getReplace(data.getLabelAmountUsd());

                    // discont usd
                    int qty = data.getQty();
                    double discount = JavaConstant.getReplace(data.getDiscountAmount()) * qty;
                    sumDiscount += Double.valueOf(discount);
               }
          }
          subtotalPanel.setLabelSubtotalUsd(dm.format(sumAmountUsd));
          subtotalPanel.setLabelSubtotalKhr(kh.format(sumAmountUsd * JavaConstant.exchangeRate));
          subtotalPanel.setLableDiscountUsd(dm.format(sumDiscount));
          subtotalPanel.setLableDiscountKhr(kh.format(sumDiscount * JavaConstant.exchangeRate));
          // total
          double total = sumAmountUsd - sumDiscount;
          subtotalPanel.setLableTotalUsd(dm.format(total));
          subtotalPanel.setLableTotalKhr(kh.format(total * JavaConstant.exchangeRate));
          String khValue = kh.format(total * JavaConstant.exchangeRate);
          khValue = khValue.replaceAll(",", "");
          khValue = "1950";
          int l = khValue.length();
          int begin = l - 2;
          String last2Number = khValue.substring(begin, l);
          if (!last2Number.equals("00")) {
               String[] listStr = khValue.split("");
               // 150 ===> 200
               // 950 ===> 1000

               // 1542 ===> 1600
               // 1965 ===> 2000
               // 9965 ===> 10000
               // 12543 ===> 12600
               // 12955 ===> 13000
               // 19953 ===> 20000
               // 99932 ===> 100000
               // 145265 ===> 145300
               // 144965 ===> 145000
               // 149965 ===> 150000
               // 199965 ===> 200000
               // 999965 ===> 1000000
               // 1235465 ===> 1235500
               // 1235965 ===> 1236000
               // 1239965 ===> 1240000
               // 1299965 ===> 1300000
               // 1999965 ===> 2000000
               // 9999965 ===> 10000000
               int lengthChar = listStr.length;
               for (int i = 0; i < listStr.length; i++) {
                    if (!listStr[lengthChar - 2].equals("0") || !listStr[lengthChar - 1].equals("0")) {
                         int num = Integer.parseInt(listStr[lengthChar - 3]) + 1;
                         System.err.println("dddddddddddd = " + num);
                         String numStr = "";
//                         if( num < 10 ) {
//                              numStr = "0";
//                         } else if ( num == 10 ) {
//                         
//                         }
                         listStr[lengthChar - 3] = "" + num;
                         listStr[lengthChar - 2] = "0";
                         listStr[lengthChar - 1] = "0";
                         String valueData = "";
                         for (int j = 0; j < listStr.length; j++) {
                              valueData += listStr[j];
                         }
                         System.err.println("valuedata = " + valueData);
                    }
               }

          }
     }

     public static long roundUp(long num, long divisor) {
          return (num + divisor - 1) / divisor;
     }

     public void eventBtnBuy(ProductModel listData) {
          double price = listData.getPrice();
          double discount = (listData.getDiscount() * price) / 100;

          try {

               BoxItem box = new BoxItem();
               Component[] listCom = detailItem.getComponents();
               if (listCom.length != 0) {
                    for (int i = 0; i < listCom.length; i++) {
                         var obj = ((BoxItem) listCom[i]);
                         int proId = obj.getProductId();
                         int qty = obj.getQty();
                         if (proId == listData.getId()) {
                              qty++;
                              obj.setQty(qty);
                              double newAmountUsd = qty * price;
                              if (listData.getDiscount() > 0) {
                                   double discountPrice = price - (listData.getDiscount() * price) / 100;
                                   newAmountUsd = discountPrice * qty;
                              }
                              obj.setLabelAmountUsd(dm.format(newAmountUsd));
                              obj.setLabelAmountKh(kh.format(newAmountUsd * JavaConstant.exchangeRate));
                              box.setSubtotalPanel(subtotalPanel);
                              box.setListCom(listCom);
                              box.setDetailItem(detailItem);
                              total(0, listCom, 0, subtotalPanel);
                              return;
                         }
                    }
               }
               box.setDiscountDigit(listData.getDiscount());
               box.setLabelProductName(listData.getProductNameEn());
               box.setLabelWeight(listData.getWeight());
               box.setLabelBarcode(listData.getBarcode());

               if (listData.getDiscount() > 0) {
                    double discountPrice = price - (listData.getDiscount() * price) / 100;
                    box.setLabelPrice(dm.format(discountPrice));
                    box.setLabelAmountUsd(dm.format(discountPrice));
                    box.setLabelAmountKh(kh.format(discountPrice * JavaConstant.exchangeRate));
               } else {
                    box.setLabelPrice(dm.format(price));
                    box.setLabelAmountUsd(dm.format(price));
                    box.setLabelAmountKh(kh.format(price * JavaConstant.exchangeRate));
               }

               box.setDiscountAmount(dm.format(discount));
               box.setQty(1);
               Response responseProductImage = JavaConnection.get(JavaRoute.readImage + listData.getProImageName());
               byte[] images = responseProductImage.body().bytes();
               box.setIconImage(new ImageIcon(images));
               box.setProductId(listData.getId());

               detailItem.add(box);
               // detailItem.add(Box.createRigidArea(new Dimension(2, 2)));
               detailItem.revalidate();
               detailItem.repaint();
               detailItem.setBorder(new BevelBorder(BevelBorder.RAISED));
               detailItem.setLayout(new BoxLayout(detailItem, BoxLayout.PAGE_AXIS));
               detailItem.setBackground(WindowColor.white);
               total(price, listCom, discount, subtotalPanel);

               // add list has one box to BoxItem (note: must be add)
               Component[] listCom1 = detailItem.getComponents();
               box.setDetailItem(detailItem);
               box.setSubtotalPanel(subtotalPanel);
               box.setListCom(listCom1);

               btnPayment.setBackground(WindowColor.lightBlue);

          } catch (Exception e) {
               System.out.println("err get product image " + e);
          }
     }

     public int getCount() {
          return count;
     }

     public void setCount(int count) {
          this.count = count;
     }

     public Button getBtnLogin() {
          return btnLogin;
     }

     public void setBtnLogin(Button btnLogin) {
          this.btnLogin = btnLogin;
     }

     public JPanel getCategory() {
          return category;
     }

     public void setCategory(JPanel category) {
          this.category = category;
     }

     public JPanel getPanelProduct() {
          return panelProduct;
     }

     public void setPanelProduct(JPanel panelProduct) {
          this.panelProduct = panelProduct;
     }

     public JScrollPane getjScrollPaneCategory() {
          return jScrollPaneCategory;
     }

     public void setjScrollPaneCategory(JScrollPane jScrollPaneCategory) {
          this.jScrollPaneCategory = jScrollPaneCategory;
     }

     public JPanel getDetailItem() {
          return detailItem;
     }

     public void setDetailItem(JPanel detailItem) {
          this.detailItem = detailItem;
     }

     public JPanel getBoxOne() {
          return boxOne;
     }

     public void setBoxOne(JPanel boxOne) {
          this.boxOne = boxOne;
     }

     public SubtotalPanel getSubtotalPanel() {
          return subtotalPanel;
     }

     public void setSubtotalPanel(SubtotalPanel subtotalPanel) {
          this.subtotalPanel = subtotalPanel;
     }

     public Button getBtnPayment() {
          return btnPayment;
     }

     public void setBtnPayment(Button btnPayment) {
          this.btnPayment = btnPayment;
     }

     public JPanel getPanelPagination() {
          return panelPagination;
     }

     public void setPanelPagination(JPanel panelPagination) {
          this.panelPagination = panelPagination;
     }

     public JLabel getBoxUserName() {
          return boxUserName;
     }

     public void setBoxUserName(JLabel boxUserName) {
          this.boxUserName = boxUserName;
     }

}
