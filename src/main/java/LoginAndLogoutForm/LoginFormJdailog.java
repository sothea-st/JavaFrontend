package LoginAndLogoutForm;

import Button.Button;
import Color.WindowColor;
import Components.BoxItem;
import Components.LabelTitle;
import Constant.JavaBaseUrl;
import Constant.JavaConnection;
import Constant.JavaConstant;
import Constant.JavaRoute;
import Event.ButtonEvent;
import Model.PackageProduct.CategoryModel;
import Model.PackageProduct.ProductModel;
import Products.ProductBox;
//import View.MainPage.MainPage;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import javax.swing.border.BevelBorder;
import okhttp3.FormBody;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author FRONT-END.06
 */
public class LoginFormJdailog extends javax.swing.JDialog {

    //private Button.Button btnLogin;
    private Button btnLogin;
    private JLabel boxUserName;
    private JPanel panelCategory;
    private JPanel panelProduct;

    public JPanel getPanelProduct() {
        return panelProduct;
    }

    public void setPanelProduct(JPanel panelProduct) {
        this.panelProduct = panelProduct;
    }

    public LoginFormJdailog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        panelLogin.setBackground(WindowColor.mediumGreen);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        event();
    }

    //Function call Placeholder
    void event() {
        ButtonEvent btnevent = new ButtonEvent() {
            @Override
            public void onFocusGain() {

            }

        };
        txtUserId.initEvent(btnevent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        txtUserId = new Components.TextField();
        txtPassword = new Components.PasswordField();
        labelPopUpTitle2 = new Components.LabelPopUpTitle();
        lbUserId = new Components.Label();
        lbPassword = new Components.Label();
        buttonCancel1 = new ButtonPackage.ButtonCancel();
        buttonLogin1 = new ButtonPackage.ButtonLogin();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelLogin.setForeground(new java.awt.Color(0, 0, 0));

        txtUserId.setLabelTextField("");

        labelPopUpTitle2.setLabelTitle("Login");

        lbUserId.setLabelName("User ID");

        lbPassword.setLabelName("Password");

        buttonLogin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLogin1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPopUpTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addComponent(buttonCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addComponent(labelPopUpTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUserId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbUserId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonCancel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLogin1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLogin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLogin1MouseClicked
        String userId = txtUserId.getValueTextField();
        String password = txtPassword.getValuePassword();
        System.out.println(userId + " " + password);

        OkHttpClient client = new OkHttpClient();
        RequestBody formBody = new FormBody.Builder()
                .add("userCode", userId)
                .add("password", password)
                .build();

        Request request = new Request.Builder()
                .url(new JavaBaseUrl().getBaseUrl() + JavaRoute.login)
                .post(formBody)
                .build();

        try {
            Response response = client.newCall(request).execute();

            if (response.isSuccessful()) {
                String responseData = response.body().string();
                JSONObject jsonObject = new JSONObject(responseData);
                JavaConstant.token = jsonObject.getString("token");
                dispose();
                getBtnLogin().setButtonName("Logout");
                String userName = jsonObject.getString("fullName");
                String userCode = jsonObject.getString("userCode");
                getBoxUserName().setText(userName + " USER ID : " + userCode);
                category();
            } else {
                System.err.println("fail");
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_buttonLogin1MouseClicked

    private void category() {
        try {
            ArrayList<CategoryModel> listCategory = new ArrayList<>();
            Response response = JavaConnection.get(JavaRoute.category);
            if (response.isSuccessful()) {
                String strData = response.body().string(); // convert response to string 
                JSONObject jsonObject = new JSONObject(strData); // conver string to jsonobject
                JSONArray data = jsonObject.getJSONArray("data");

                for (int i = 0; i < data.length(); i++) {
                    var objData = data.getJSONObject(i);
                    CategoryModel c = new CategoryModel(
                            objData.getInt("id"),
                            objData.getString("catNameEn"),
                            objData.getInt("parentId"),
                            objData.getInt("parentId")
                    );
                    listCategory.add(c);
                }

                for (int i = 0; i < listCategory.size(); i++) {
                    int id = listCategory.get(i).getId();
                    LabelTitle categoryTitle = new LabelTitle();
                    panelCategory.add(categoryTitle);
                    String catName = listCategory.get(i).getCatNameEn();
                    categoryTitle.setLabelTitle(catName);
                    ButtonEvent event = new ButtonEvent() {
                        @Override
                        public void onMouseClick() {

                            // click on category actice background color
                            Component[] listCom = panelCategory.getComponents();
                            for (int i = 0; i < listCom.length; i++) {
                                String title = ((LabelTitle) listCom[i]).getLabelTitle();
                                if (catName.equals(title)) {
                                    listCom[i].setBackground(Color.red);
                                } else {
                                    listCom[i].setBackground(WindowColor.darkGreen);
                                }
                            }

                            panelProduct.removeAll();
                            product(id);
                            panelProduct.revalidate();
                            panelProduct.repaint();
                        }
                    };
                    categoryTitle.initEvent(event);
                }
                panelCategory.setLayout(new GridLayout());

            } else {
                System.err.println("fail load category");
            }
        } catch (Exception e) {
            System.err.println("error " + e);
        }

    }

    private void product(int id) {
        try {
            ArrayList<ProductModel> listProduct = new ArrayList<>();
            Response response = JavaConnection.get(JavaRoute.getProductByCatId + id);
            if (response.isSuccessful()) {
                String responseData = response.body().string();
                JSONObject jsonObject = new JSONObject(responseData);
                JSONArray data = jsonObject.getJSONArray("data");
                System.err.println("data item = ");
                for (int i = 0; i < data.length(); i++) {
                    JSONObject obj = data.getJSONObject(i);
                    ProductModel product = new ProductModel(
                            obj.getInt("id"),
                            obj.getInt("catId"),
                            obj.getString("flag"),
                            obj.getString("weight"),
                            obj.getBigDecimal("cost"),
                            obj.getString("proImageName"),
                            obj.getBigDecimal("price"),
                            obj.getString("barcode"),
                            obj.getString("proNameKh"),
                            obj.getString("proNameEn"),
                            obj.getString("productStatus"),
                            obj.getInt("discount")
                    );
                    listProduct.add(product);
                }
                appendProduct(listProduct);
            } else {
                System.err.println("fail loading data");
            }
        } catch (Exception e) {
            System.err.println("error = " + e);
        }

    }

    void appendProduct(ArrayList<ProductModel> listProduct) {

//        scrollItem.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
//        File f = new File("C:\\Users\\USER\\Pictures\\food");
//        File[] list = f.listFiles();
        // set panel to GridBagLayout
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

            int qty = 1;
            Random rd = new Random();
            double weight = rd.nextDouble(5, 20);
            double price = rd.nextDouble(5, 20);
            double barcode = rd.nextDouble(100, 200);
            double amountUsd = price * qty;
            double amountKhr = price * qty * 4200;

            DecimalFormat df = new DecimalFormat("#,##0.00 kg");
            DecimalFormat dm = new DecimalFormat("$ #,##0.00");
            DecimalFormat bar = new DecimalFormat("########00000000");
            DecimalFormat kh = new DecimalFormat("#,##0.00");

            ButtonEvent event = new ButtonEvent() {
                @Override
                public void onMouseClick() {

//                    int id = arrInt.size();
//                    BoxItem box = new BoxItem();
//                         box.setLabelProductName("" + name);
//                         box.setIconImage(image);
//                    box.setLabelWeight(df.format(weight));
//                    box.setLabelPrice(dm.format(price));
//                    box.setLabelBarcode(bar.format(barcode));
//                    box.setLabelAmountUsd(dm.format(amountUsd));
//                    box.setLabelAmountKh(kh.format(amountKhr));
//                    arrInt.add(box);
//
//                    double sum = 0;
//                    for (int j = 0; j < arrInt.size(); j++) {
//                        sum = sum + amountUsd;
//                    }
//
//                    double sumKh = 0;
//                    for (int j = 0; j < arrInt.size(); j++) {
//                        sumKh = sumKh + amountKhr;
//                    }
//                        ButtonEvent event = new ButtonEvent() {
//                            @Override
//                            public void onMouseClick() {
//
//                                panelItem.remove(box);
//                                panelItem.remove(Box.createRigidArea(new Dimension(10, 10)));
//
//                                panelItem.revalidate();
//                            }
//                        };                  
//                        box.initEvent(event);  
//                    panelItem.add(box);
//                    panelItem.add(Box.createRigidArea(new Dimension(2, 2)));
//                    panelItem.revalidate();
//
//                    panelItem.setBorder(new BevelBorder(BevelBorder.RAISED));
//                    panelItem.setLayout(new BoxLayout(panelItem, BoxLayout.PAGE_AXIS));
//
//                    totalPanel.setLabelSubtotalUsd(dm.format(sum));
//                    totalPanel.setLabelSubtotalKhr(kh.format(sumKh));
//
//                    btnPayment.setBackground(WindowColor.lightBlue);
//                    panelItem.setBackground(WindowColor.white);
                }
            };

            ProductBox product = new ProductBox();
            product.initEvent(event);
            String productName;
//               if (listData.getProductNameEn().length() > 15) {
//                    productName = listData.getProductNameEn().substring(0, 14) + "...";
//               } else {
//                    productName = listData.getProductNameEn();
//               }
//               
//               System.err.println(listData.getProductNameEn());
            product.setProductName("<html>" + listData.getProductNameEn() + "</html>");

            product.setWeight(df.format(weight));

            product.setPrice(dm.format(price));

            product.setBarcode(bar.format(barcode));

            // read image from api 
            try {
                Response response = JavaConnection.get(JavaRoute.readImage + listData.getProImageName());
                byte[] image = response.body().bytes();
        
                product.setImage(new ImageIcon(image));
            } catch (Exception e) {
                System.err.println("error read image = " + e);
            }

            panelProduct.add(product, gbc);
        }
    }

    public JLabel getBoxUserName() {
        return boxUserName;
    }

    public void setBoxUserName(JLabel boxUserName) {
        this.boxUserName = boxUserName;
    }

    public Button getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(Button btnLogin) {
        this.btnLogin = btnLogin;
    }

    public void setPanelCategory(JPanel panelCategory) {
        this.panelCategory = panelCategory;
    }

    public JPanel getPanelCategory() {
        return panelCategory;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginFormJdailog dialog = new LoginFormJdailog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ButtonPackage.ButtonCancel buttonCancel1;
    private ButtonPackage.ButtonLogin buttonLogin1;
    private Components.LabelPopUpTitle labelPopUpTitle2;
    private Components.Label lbPassword;
    private Components.Label lbUserId;
    private javax.swing.JPanel panelLogin;
    private Components.PasswordField txtPassword;
    private Components.TextField txtUserId;
    // End of variables declaration//GEN-END:variables

}
