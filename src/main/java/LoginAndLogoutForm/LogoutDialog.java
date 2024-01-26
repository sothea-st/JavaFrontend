package LoginAndLogoutForm;

import Button.Button;
import Color.WindowColor;
import Components.SubtotalPanel;
import Constant.JavaConstant;
import Fonts.WindowFonts;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class LogoutDialog extends javax.swing.JDialog {

    public LogoutDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        txtLabel.setFont(WindowFonts.timeNewRomanBold14);
        panelLogout.setBackground(WindowColor.mediumGreen);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        txtId = new Components.TextField();
        txtPassword = new Components.PasswordField();
        labelPopUpTitle2 = new Components.LabelPopUpTitle();
        lbUserId = new Components.Label();
        lbPassword = new Components.Label();
        buttonLogin = new ButtonPackage.ButtonLogin();
        buttonCancel = new ButtonPackage.ButtonCancel();
        panelLogout = new javax.swing.JPanel();
        labelPopUpTitle = new Components.LabelPopUpTitle();
        txtLabel = new javax.swing.JLabel();
        buttonYes = new ButtonPackage.ButtonYes();
        buttonNo = new ButtonPackage.ButtonNo();

        panelLogin.setForeground(new java.awt.Color(0, 0, 0));

        labelPopUpTitle2.setLabelTitle("Login");

        lbUserId.setLabelName("User ID");

        lbPassword.setLabelName("Password");

        buttonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPopUpTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addComponent(labelPopUpTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbUserId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelLogout.setForeground(new java.awt.Color(0, 0, 0));

        labelPopUpTitle.setLabelTitle("Logout");

        txtLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLabel.setText("Are you sure to logout ?");

        buttonYes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonYesMouseClicked(evt);
            }
        });

        buttonNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonNoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLogoutLayout = new javax.swing.GroupLayout(panelLogout);
        panelLogout.setLayout(panelLogoutLayout);
        panelLogoutLayout.setHorizontalGroup(
            panelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPopUpTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLogoutLayout.createSequentialGroup()
                .addGroup(panelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLogoutLayout.createSequentialGroup()
                        .addComponent(buttonNo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonYes, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        panelLogoutLayout.setVerticalGroup(
            panelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoutLayout.createSequentialGroup()
                .addComponent(labelPopUpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(txtLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonYes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_buttonCancelMouseClicked

    private void buttonYesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonYesMouseClicked
        lbPOSId.setText("POS ID :");
        boxUserName.setText("");
//        category.setBackground(WindowColor.darkGreen);
        category.removeAll();
        category.revalidate();
        category.repaint();
        subtotalPanel.setLabelSubTitleToZero();
        detailItem.removeAll();
        detailItem.revalidate();
        detailItem.repaint();
        panelProduct.removeAll();
        panelProduct.revalidate();
        panelProduct.repaint();
        btnLogin.setButtonName("Login");
        panelPagination.setVisible(false);

        //Session
        JavaConstant.token = null;
        JavaConstant.fullName = null;
        JavaConstant.userCode = null;
        JavaConstant.posId = null;
        JavaConstant.cashierId = null;
        dispose();
    }//GEN-LAST:event_buttonYesMouseClicked

    private void buttonNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNoMouseClicked
        this.dispose();
    }//GEN-LAST:event_buttonNoMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LogoutDialog dialog = new LogoutDialog(new javax.swing.JFrame(), true);
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

    private JLabel lbPOSId;
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

    public SubtotalPanel getSubtotalPanel() {
        return subtotalPanel;
    }

    public void setSubtotalPanel(SubtotalPanel subtotalPanel) {
        this.subtotalPanel = subtotalPanel;
    }

    public JLabel getLbPOSId() {
        return lbPOSId;
    }

    public void setLbPOSId(JLabel lbPOSId) {
        this.lbPOSId = lbPOSId;
    }

    public Button getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(Button btnLogin) {
        this.btnLogin = btnLogin;
    }

    public JLabel getBoxUserName() {
        return boxUserName;
    }

    public void setBoxUserName(JLabel boxUserName) {
        this.boxUserName = boxUserName;
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ButtonPackage.ButtonCancel buttonCancel;
    private ButtonPackage.ButtonLogin buttonLogin;
    private ButtonPackage.ButtonNo buttonNo;
    private ButtonPackage.ButtonYes buttonYes;
    private Components.LabelPopUpTitle labelPopUpTitle;
    private Components.LabelPopUpTitle labelPopUpTitle2;
    private Components.Label lbPassword;
    private Components.Label lbUserId;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelLogout;
    private Components.TextField txtId;
    private javax.swing.JLabel txtLabel;
    private Components.PasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
