package View.MainPage;

import Color.WindowColor;
import Components.BackgroundImage;
import Components.LabelTitle;
import Constant.JavaConnection;
import Constant.JavaConstant;
import Constant.JavaRoute;
import DeleteAndCancel.CancelDialog;
import Event.ButtonEvent;
import LoginAndLogoutForm.LoginFormJdailog;
import LoginAndLogoutForm.LogoutDialog;
// import Model.Category.CategoryModel;
import OpenAndCloseShift.CloseShift;
import OpenAndCloseShift.OpenShiftJdailog;
import Payment.PaymentOption;
import Print.ReprintJdailog;
import Products.ProductPanel;
import Receipt.CashierReport;
import Return.ApprovalCode;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author FRONT-END.06
 */
public class MainPage extends javax.swing.JFrame {

    private Color bgColor = new Color(204, 204, 204);
    private Color activeColor = new Color(56, 56, 56);
    private JPanel detailProduct;

    public MainPage(String data) {
        initComponents();
        event();
        setBackground();
        currenDateTime();
        jScrollPaneDetail.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneCategory.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        BackgroundImage bgimg = new BackgroundImage();
        PanelProduct.removeAll();
        PanelProduct.add(bgimg);
        PanelProduct.revalidate();
        PanelProduct.repaint();
        jScrollPaneCategory.setVisible(false);
        
    }


    private void setBackground() {
        mainPanel.setBackground(WindowColor.slightGreen);
        panelCategory.setBackground(WindowColor.darkGreen);
        category.setBackground(WindowColor.darkGreen);
        menuBar.setBackground(WindowColor.darkGreen);
        jScrollPaneCategory.setBackground(WindowColor.darkGreen);
        day.setBackground(WindowColor.slightGreen);
        panelprocessing.setBackground(WindowColor.slightGreen);
        PanelProduct.setBackground(WindowColor.slightGreen);
        boxOne.setBackground(WindowColor.slightGreen);
        detailItem.setBackground(WindowColor.slightGreen);
    }

    private void currenDateTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy hh:mm:ss a");
        LocalDateTime date = LocalDateTime.now();
        currentDate.setText(dtf.format(date));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        menuBar = new javax.swing.JPanel();
        panelCategory = new javax.swing.JPanel();
        jScrollPaneCategory = new javax.swing.JScrollPane();
        category = new javax.swing.JPanel();
        textField = new Components.TextField();
        lbLogo = new javax.swing.JLabel();
        imgUser = new javax.swing.JLabel();
        day = new javax.swing.JPanel();
        panelprocessing = new javax.swing.JPanel();
        totalPanel = new Components.SubtotalPanel();
        btnReturn = new Button.Button();
        button3 = new Button.Button();
        btnPayment = new Button.Button();
        btnLogin = new Button.Button();
        btnOpenShift = new Button.Button();
        btnReprint = new Button.Button();
        button8 = new Button.Button();
        buttonCashier = new Button.Button();
        button10 = new Button.Button();
        buttonCancel1 = new ButtonPackage.ButtonCancel();
        searchBox = new Components.SearchField();
        currentDate = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PanelProduct = new javax.swing.JPanel();
        lbPOSId = new javax.swing.JLabel();
        jScrollPaneDetail = new javax.swing.JScrollPane();
        boxOne = new javax.swing.JPanel();
        detailItem = new javax.swing.JPanel();
        boxUserName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPaneCategory.setBorder(null);

        javax.swing.GroupLayout categoryLayout = new javax.swing.GroupLayout(category);
        category.setLayout(categoryLayout);
        categoryLayout.setHorizontalGroup(
            categoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1101, Short.MAX_VALUE)
        );
        categoryLayout.setVerticalGroup(
            categoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jScrollPaneCategory.setViewportView(category);

        javax.swing.GroupLayout panelCategoryLayout = new javax.swing.GroupLayout(panelCategory);
        panelCategory.setLayout(panelCategoryLayout);
        panelCategoryLayout.setHorizontalGroup(
            panelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1074, Short.MAX_VALUE)
            .addGroup(panelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCategoryLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPaneCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 1062, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelCategoryLayout.setVerticalGroup(
            panelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPaneCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
        );

        textField.setLabelTextField("Scan or input barcode");

        javax.swing.GroupLayout menuBarLayout = new javax.swing.GroupLayout(menuBar);
        menuBar.setLayout(menuBarLayout);
        menuBarLayout.setHorizontalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBarLayout.createSequentialGroup()
                .addComponent(panelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuBarLayout.setVerticalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBarLayout.createSequentialGroup()
                .addGroup(menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textField, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\front-end.06\\Documents\\NetBeansProjects\\tt_pos_window-danin\\src\\main\\resources\\image\\King Mart Small Logo.png")); // NOI18N

        imgUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\front-end.06\\Documents\\NetBeansProjects\\tt_pos_window-danin\\src\\main\\resources\\image\\UserIcon.png")); // NOI18N

        javax.swing.GroupLayout dayLayout = new javax.swing.GroupLayout(day);
        day.setLayout(dayLayout);
        dayLayout.setHorizontalGroup(
            dayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );
        dayLayout.setVerticalGroup(
            dayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        btnReturn.setBackground(new java.awt.Color(153, 102, 0));
        btnReturn.setButtonName("Return");
        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnMouseClicked(evt);
            }
        });

        button3.setBackground(new java.awt.Color(255, 204, 0));
        button3.setButtonName("Hold Order");
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3MouseClicked(evt);
            }
        });

        btnPayment.setBackground(new java.awt.Color(204, 204, 204));
        btnPayment.setButtonName("Payment");
        btnPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPaymentMouseClicked(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(47, 155, 70));
        btnLogin.setButtonName("Login");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        btnOpenShift.setBackground(new java.awt.Color(47, 155, 70));
        btnOpenShift.setButtonName("Open Shift");
        btnOpenShift.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOpenShiftMouseClicked(evt);
            }
        });

        btnReprint.setBackground(new java.awt.Color(47, 155, 70));
        btnReprint.setButtonName("Reprint");
        btnReprint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReprintMouseClicked(evt);
            }
        });

        button8.setBackground(new java.awt.Color(47, 155, 70));
        button8.setButtonName("Discount");

        buttonCashier.setBackground(new java.awt.Color(47, 155, 70));
        buttonCashier.setButtonName("Cashier Report");
        buttonCashier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCashierMouseClicked(evt);
            }
        });

        button10.setBackground(new java.awt.Color(47, 155, 70));
        button10.setButtonName("Customer ");

        buttonCancel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCancel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelprocessingLayout = new javax.swing.GroupLayout(panelprocessing);
        panelprocessing.setLayout(panelprocessingLayout);
        panelprocessingLayout.setHorizontalGroup(
            panelprocessingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprocessingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelprocessingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelprocessingLayout.createSequentialGroup()
                        .addGroup(panelprocessingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelprocessingLayout.createSequentialGroup()
                                .addGroup(panelprocessingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonCancel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(panelprocessingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnReturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnOpenShift, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(buttonCashier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelprocessingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelprocessingLayout.createSequentialGroup()
                                .addGroup(panelprocessingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnReprint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelprocessingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(button10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelprocessingLayout.setVerticalGroup(
            panelprocessingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprocessingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelprocessingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelprocessingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpenShift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReprint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelprocessingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonCashier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        searchBox.setPlaceholder("Search by name or barcode");

        currentDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        currentDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        currentDate.setText("Tuesday, 02 January 2024 03:50:00 PM");

        jScrollPane2.setBorder(null);

        PanelProduct.setLayout(new java.awt.BorderLayout());
        jScrollPane2.setViewportView(PanelProduct);

        lbPOSId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbPOSId.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbPOSId.setText("POS ID : 01");

        jScrollPaneDetail.setBorder(null);

        boxOne.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout detailItemLayout = new javax.swing.GroupLayout(detailItem);
        detailItem.setLayout(detailItemLayout);
        detailItemLayout.setHorizontalGroup(
            detailItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        detailItemLayout.setVerticalGroup(
            detailItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        boxOne.add(detailItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 450, -1));

        jScrollPaneDetail.setViewportView(boxOne);

        boxUserName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(imgUser, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boxUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(lbPOSId, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(currentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addGap(38, 38, 38))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 968, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelprocessing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPaneDetail))
                .addContainerGap())
            .addComponent(menuBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(imgUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbPOSId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(currentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(boxUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addComponent(menuBar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPaneDetail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelprocessing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        String buttonName = btnLogin.getButtonName().toLowerCase();
        if (buttonName.equals("login")) {
            LoginFormJdailog jdFormLogin = new LoginFormJdailog(new JFrame(), true);
            jdFormLogin.setBoxUserName(boxUserName);
            jdFormLogin.setBtnLogin(btnLogin);
            jdFormLogin.setCategory(category);
            jdFormLogin.setPanelProduct(PanelProduct);
            jdFormLogin.setjScrollPaneCategory(jScrollPaneCategory);
            jdFormLogin.setVisible(true);
        } else if (buttonName.equals("logout")) {
            LogoutDialog logout = new LogoutDialog(new JFrame(), true);
            logout.setVisible(true);
        }
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnOpenShiftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpenShiftMouseClicked
        String buttonName = btnOpenShift.getButtonName().toLowerCase();
        if ( JavaConstant.token != null) {
            if (buttonName.equals("open shift")) {
               OpenShiftJdailog jdOpenShift = new OpenShiftJdailog(new JFrame(), true,btnOpenShift);
               jdOpenShift.setVisible(true);
            }
            else if (buttonName.equals("close shift")) {
                CloseShift close = new CloseShift(new JFrame(), true);
                close.setVisible(true);
            }
        } else {
            System.err.println("System Cannot Open Shift");
        }
    }//GEN-LAST:event_btnOpenShiftMouseClicked

    //Action Button Reprint
    private void btnReprintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReprintMouseClicked

        if ( JavaConstant.token != null) {
            ReprintJdailog rep = new ReprintJdailog(new JFrame(), true);
            rep.setVisible(true);
        }else {
             System.err.println("System cannot open reprint option");
        }
    }//GEN-LAST:event_btnReprintMouseClicked

    //Action Button payment
    private void btnPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPaymentMouseClicked
        if ( JavaConstant.token != null) {
            PaymentOption pay = new PaymentOption(new JFrame(), true);
            pay.setVisible(true);
        }else {
            System.err.println("System cannot open payment option");
        }
    }//GEN-LAST:event_btnPaymentMouseClicked

    //Action Button Return
    private void btnReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseClicked
        if ( JavaConstant.token != null) {
            ApprovalCode approval = new ApprovalCode(new JFrame(), true);
            approval.setVisible(true);
        }else {
            System.err.println("System cannot open return option");
        }
    }//GEN-LAST:event_btnReturnMouseClicked

    //Action Button Cancel
    private void buttonCancel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancel1MouseClicked

        if ( JavaConstant.token != null) {
            CancelDialog cancel = new CancelDialog(new JFrame(), true);
            cancel.setVisible(true);
        }else {
            System.err.println("System cannot open cancel option");
        }
    }//GEN-LAST:event_buttonCancel1MouseClicked

    private void buttonCashierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCashierMouseClicked
       
        if ( JavaConstant.token != null) {
            CashierReport cashier = new CashierReport(new JFrame(), true);
            cashier.setVisible(true);
        }else {
            System.err.println("System cannot oprn Cashier Report");
        }
        
    }//GEN-LAST:event_buttonCashierMouseClicked

     private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
        // TODO add your handling code here:
        System.err.println("333333333333333");
        this.setBackground(Color.red);
        revalidate();
        repaint();
        validate();
     }//GEN-LAST:event_button3MouseClicked

    //Function call Placeholder
    void event() {
        ButtonEvent btnevent = new ButtonEvent() {
             @Override
             public void onFocusGain() {

             }
        };
        searchBox.initEvent(btnevent);
        textField.initEvent(btnevent);
    }

    public JPanel getDetailProduct() {
        return detailProduct;
    }

    public void setDetailProduct(JPanel detailProduct) {
        this.detailProduct = detailProduct;
    }

    public Color getActiveColor() {
        return activeColor;
    }

    public void setActiveColor(Color activeColor) {
        this.activeColor = activeColor;
//        menuNewItem.setBackground(activeColor);
    }

    /**
     * @param args the command line
     * arguments
     */
    public static void main(String args[]) {
         /* Set the Nimbus look and feel */
         //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
         /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
        * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
          */
         try {
              for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                   if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                   }
              }
         } catch (ClassNotFoundException ex) {
              java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
              java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
              java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
              java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }
         //</editor-fold>

         /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
              public void run() {
                   MainPage obj = new MainPage(null);
                   obj.setVisible(true);
              }
         });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelProduct;
    private javax.swing.JPanel boxOne;
    private javax.swing.JLabel boxUserName;
    private Button.Button btnLogin;
    private Button.Button btnOpenShift;
    private Button.Button btnPayment;
    private Button.Button btnReprint;
    private Button.Button btnReturn;
    private Button.Button button10;
    private Button.Button button3;
    private Button.Button button8;
    private ButtonPackage.ButtonCancel buttonCancel1;
    private Button.Button buttonCashier;
    private javax.swing.JPanel category;
    private javax.swing.JLabel currentDate;
    private javax.swing.JPanel day;
    private javax.swing.JPanel detailItem;
    private javax.swing.JLabel imgUser;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneCategory;
    private javax.swing.JScrollPane jScrollPaneDetail;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbPOSId;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuBar;
    private javax.swing.JPanel panelCategory;
    private javax.swing.JPanel panelprocessing;
    private Components.SearchField searchBox;
    private Components.TextField textField;
    private Components.SubtotalPanel totalPanel;
    // End of variables declaration//GEN-END:variables
}
