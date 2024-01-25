package Controller.ActionProduct;

import Button.Button;
import Color.WindowColor;
import Components.BoxItem;
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

     public ActionProduct() {
     }

     public void product(int catId) {
          try {
               Response response = JavaConnection.get(JavaRoute.getProductByCatId + catId);
               if (response.isSuccessful()) {
                    String responseData = response.body().string();
                    ObjectMapper objMap = new ObjectMapper();
                    ProductSuccessData data = objMap.readValue(responseData, ProductSuccessData.class);
                    ProductDataModel[] listData = data.getData();
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
                    obj.getDiscount()
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

               var listData = listProduct.get(i);

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

               double price = listData.getPrice();
               double discount = (listData.getDiscount() * price) / 100;

               // event button buy
               ButtonEvent event = new ButtonEvent() {
                    @Override
                    public void onMouseClick() {

                         BoxItem box = new BoxItem();

                         try {
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
                                             total(0, listCom, 0);
                                             return;
                                        }
                                   }
                              }

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
                              total(price, listCom, discount);

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
               };

               ProductBox product = new ProductBox();
               product.initEvent(event);

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

     void total(double price, Component[] listCom, double discountProduct) {
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
