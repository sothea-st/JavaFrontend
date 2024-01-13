package View.MainPage;

import Color.WindowColor;
import Components.BackgroundImage;
import DeleteAndCancel.CancelDialog;
import Event.ButtonEvent;
import LoginAndLogoutForm.LoginFormJdailog;
import OpenAndCloseShift.CloseShift;
import OpenAndCloseShift.OpenShiftJdailog;
import Payment.PaymentOption;
import Print.ReprintJdailog;
import Products.ProductPanel;
import Receipt.CashierReport;
import Return.ApprovalCode;
import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author FRONT-END.06
 */

public class MainPage extends javax.swing.JFrame {

    public Color getActiveColor() {
        return activeColor;
    }

    public void setActiveColor(Color activeColor) {
        this.activeColor = activeColor;
        menuNewItem.setBackground(activeColor);
    }

    private Color bgColor = new Color(204, 204, 204);
    private Color activeColor = new Color(56, 56, 56);
    
    public JPanel getDetailProduct() {
        return detailProduct;
    }

    public void setDetailProduct(JPanel detailProduct) {
        this.detailProduct = detailProduct;    
    }

    
    private JPanel detailProduct;
    
    public MainPage() {
        initComponents();
        event();
        setBackground();
        currenDateTime();
        jScrollPaneDetail.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        BackgroundImage bgimg = new BackgroundImage();
        PanelProduct.removeAll();
        PanelProduct.add(bgimg);
        PanelProduct.revalidate();
        PanelProduct.repaint();
    }

    private void setBackground(){
        mainPanel.setBackground(WindowColor.slightGreen);
        menuBar.setBackground(WindowColor.darkGreen);
        day.setBackground(WindowColor.slightGreen);
        panelprocessing.setBackground(WindowColor.slightGreen);
        PanelProduct.setBackground(WindowColor.slightGreen);
        boxOne.setBackground(WindowColor.slightGreen);
        detailItem.setBackground(WindowColor.slightGreen);
    }
    
    private void currenDateTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy hh:mm:ss a");  
        LocalDateTime date = LocalDateTime.now();  
        currentDate.setText(dtf.format(date));
    }
    
    //Function call Placeholder
    void event(){
        ButtonEvent btnevent = new ButtonEvent() {
            @Override
            public void onFocusGain() {
               
            }
           
        };
        searchBox.initEvent(btnevent);
        textField.initEvent(btnevent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        menuBar = new javax.swing.JPanel();
        textField = new Components.TextField();
        labelTitle1 = new Components.LabelTitle();
        menuNewItem = new Components.LabelTitle();
        labelTitle3 = new Components.LabelTitle();
        labelTitle4 = new Components.LabelTitle();
        labelTitle5 = new Components.LabelTitle();
        labelTitle6 = new Components.LabelTitle();
        labelTitle7 = new Components.LabelTitle();
        jLabel2 = new javax.swing.JLabel();
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
        button9 = new Button.Button();
        button10 = new Button.Button();
        buttonCancel1 = new Button.ButtonCancel();
        searchBox = new Components.SearchField();
        currentDate = new javax.swing.JLabel();
        PanelProduct = new javax.swing.JPanel();
        lbPOSId = new javax.swing.JLabel();
        jScrollPaneDetail = new javax.swing.JScrollPane();
        boxOne = new javax.swing.JPanel();
        detailItem = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textField.setLabelTextField("Scan or input barcode");

        labelTitle1.setLabelTitle("PROMOTION");

        menuNewItem.setLabelTitle("NEW ITEMS");
        menuNewItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuNewItemMouseClicked(evt);
            }
        });

        labelTitle3.setLabelTitle("GROCERY");

        labelTitle4.setLabelTitle("DAIRY&FROZEN");

        labelTitle5.setLabelTitle("FRESH");

        labelTitle6.setLabelTitle("HEALTH&BEAUTY");

        labelTitle7.setLabelTitle("NONFOODS");

        javax.swing.GroupLayout menuBarLayout = new javax.swing.GroupLayout(menuBar);
        menuBar.setLayout(menuBarLayout);
        menuBarLayout.setHorizontalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuNewItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitle4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitle5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitle6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitle7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuBarLayout.setVerticalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
            .addComponent(menuNewItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelTitle3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelTitle4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelTitle5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelTitle6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelTitle7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\front-end.06\\Documents\\NetBeansProjects\\tt_pos_window-danin\\src\\main\\resources\\image\\King Mart Small Logo.png")); // NOI18N

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

        button9.setBackground(new java.awt.Color(47, 155, 70));
        button9.setButtonName("Cashier Report");
        button9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button9MouseClicked(evt);
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
                                .addGap(7, 7, 7)
                                .addGroup(panelprocessingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnOpenShift, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnReturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(button9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelprocessingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelprocessingLayout.createSequentialGroup()
                                .addGroup(panelprocessingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnReprint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelprocessingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelprocessingLayout.createSequentialGroup()
                                        .addComponent(btnPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(2, 2, 2))
                                    .addGroup(panelprocessingLayout.createSequentialGroup()
                                        .addComponent(button8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(3, 3, 3)))
                                .addGap(1, 1, 1))
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
                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        searchBox.setPlaceholder("Search by name or barcode");

        currentDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        currentDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        currentDate.setText("Tuesday, 02 January 2024 03:50:00 PM");

        PanelProduct.setLayout(new java.awt.BorderLayout());

        lbPOSId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbPOSId.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbPOSId.setText("POS ID : 01");

        jScrollPaneDetail.setBorder(null);

        boxOne.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout detailItemLayout = new javax.swing.GroupLayout(detailItem);
        detailItem.setLayout(detailItemLayout);
        detailItemLayout.setHorizontalGroup(
            detailItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        detailItemLayout.setVerticalGroup(
            detailItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        boxOne.add(detailItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 550, -1));

        jScrollPaneDetail.setViewportView(boxOne);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imgUser, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPOSId, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(currentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(PanelProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 1042, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPaneDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addComponent(panelprocessing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
            .addComponent(menuBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(imgUser, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43))))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbPOSId, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(currentDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(menuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPaneDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelprocessing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addComponent(PanelProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
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
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        LoginFormJdailog jdFormLogin = new LoginFormJdailog(new JFrame(),true);
        jdFormLogin.setVisible(true);
        
//        LogoutDialog logout = new LogoutDialog(new JFrame(),true);
//        logout.setVisible(true);
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnOpenShiftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpenShiftMouseClicked
        OpenShiftJdailog jdOpenShift = new OpenShiftJdailog(new JFrame(),true);
        jdOpenShift.setVisible(true);

//        CloseShift jdCloseShift = new CloseShift(new JFrame(),true);
//        jdCloseShift.setVisible(true);
    }//GEN-LAST:event_btnOpenShiftMouseClicked

    private void btnReprintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReprintMouseClicked
        ReprintJdailog rep = new ReprintJdailog(new JFrame(),true);
        rep.setVisible(true);
    }//GEN-LAST:event_btnReprintMouseClicked

    private void btnPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPaymentMouseClicked

        PaymentOption pay = new PaymentOption(new JFrame(),true);
        pay.setVisible(true);
    }//GEN-LAST:event_btnPaymentMouseClicked

    private void btnReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseClicked
        ApprovalCode approval = new ApprovalCode(new JFrame(),true);
        approval.setVisible(true);
    }//GEN-LAST:event_btnReturnMouseClicked

    private void buttonCancel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancel1MouseClicked
        CancelDialog cancel = new CancelDialog(new JFrame(),true);
        cancel.setVisible(true);
    }//GEN-LAST:event_buttonCancel1MouseClicked

    private void menuNewItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuNewItemMouseClicked
        ProductPanel pdPanel = new ProductPanel(detailItem,totalPanel,btnPayment);
        PanelProduct.removeAll();
        PanelProduct.add(pdPanel);
        PanelProduct.revalidate();
        PanelProduct.repaint();
        menuNewItem.setBackground(getActiveColor());
    }//GEN-LAST:event_menuNewItemMouseClicked

    private void button9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button9MouseClicked
        CashierReport cashier = new CashierReport(new JFrame(),true);
        cashier.setVisible(true);
    }//GEN-LAST:event_button9MouseClicked

    /**
     * @param args the command line arguments
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
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelProduct;
    private javax.swing.JPanel boxOne;
    private Button.Button btnLogin;
    private Button.Button btnOpenShift;
    private Button.Button btnPayment;
    private Button.Button btnReprint;
    private Button.Button btnReturn;
    private Button.Button button10;
    private Button.Button button3;
    private Button.Button button8;
    private Button.Button button9;
    private Button.ButtonCancel buttonCancel1;
    private javax.swing.JLabel currentDate;
    private javax.swing.JPanel day;
    private javax.swing.JPanel detailItem;
    private javax.swing.JLabel imgUser;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPaneDetail;
    private Components.LabelTitle labelTitle1;
    private Components.LabelTitle labelTitle3;
    private Components.LabelTitle labelTitle4;
    private Components.LabelTitle labelTitle5;
    private Components.LabelTitle labelTitle6;
    private Components.LabelTitle labelTitle7;
    private javax.swing.JLabel lbPOSId;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuBar;
    private Components.LabelTitle menuNewItem;
    private javax.swing.JPanel panelprocessing;
    private Components.SearchField searchBox;
    private Components.TextField textField;
    private Components.SubtotalPanel totalPanel;
    // End of variables declaration//GEN-END:variables
}
