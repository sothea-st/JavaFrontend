package Print;

import Color.WindowColor;
import Constant.JavaConnection;
import Constant.JavaConstant;
import Constant.JavaRoute;
import Model.Reprint.DataSuccessModel;
import Receipt.Receipt;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import okhttp3.Response;

public class ReprintJdailog extends javax.swing.JDialog {

    public ReprintJdailog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        panelReprint.setBackground(WindowColor.mediumGreen);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelReprint = new javax.swing.JPanel();
        btnPrintByLast = new Button.Button();
        btnPrintByInvoice = new Button.Button();
        labelPopUpTitle1 = new Components.LabelPopUpTitle();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelReprint.setForeground(new java.awt.Color(0, 0, 0));

        btnPrintByLast.setButtonName("Reprint by Last");
        btnPrintByLast.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintByLastMouseClicked(evt);
            }
        });

        btnPrintByInvoice.setBackground(new java.awt.Color(47, 155, 70));
        btnPrintByInvoice.setButtonName("Reprint by Invoice №");
        btnPrintByInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintByInvoiceMouseClicked(evt);
            }
        });

        labelPopUpTitle1.setLabelTitle("Reprint Invoice");

        javax.swing.GroupLayout panelReprintLayout = new javax.swing.GroupLayout(panelReprint);
        panelReprint.setLayout(panelReprintLayout);
        panelReprintLayout.setHorizontalGroup(
            panelReprintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReprintLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnPrintByLast, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrintByInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addComponent(labelPopUpTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelReprintLayout.setVerticalGroup(
            panelReprintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReprintLayout.createSequentialGroup()
                .addComponent(labelPopUpTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(panelReprintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelReprintLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPrintByLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPrintByInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelReprint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelReprint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintByLastMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintByLastMouseClicked
        Receipt rec = new Receipt(new JFrame(), true);
        Response response = JavaConnection.get(JavaRoute.reprintByLast + JavaConstant.cashierId);
     
        try {
            String myObject = response.body().string();
            ObjectMapper objMap = new ObjectMapper();
            DataSuccessModel d = objMap.readValue(myObject, DataSuccessModel.class);
            rec.setDataSuccess(d);

            rec.setVisible(true);
        } catch (Exception e) {
            System.err.println("err while loding = " + e);
        }


    }//GEN-LAST:event_btnPrintByLastMouseClicked

    private void btnPrintByInvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintByInvoiceMouseClicked
        ReprintByInvoicenumber rep = new ReprintByInvoicenumber(new JFrame(), true);
        rep.setVisible(true);
    }//GEN-LAST:event_btnPrintByInvoiceMouseClicked

    public static void main(String args[]) {

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ReprintJdailog dialog = new ReprintJdailog(new javax.swing.JFrame(), true);
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
    private Button.Button btnPrintByInvoice;
    private Button.Button btnPrintByLast;
    private Components.LabelPopUpTitle labelPopUpTitle1;
    private javax.swing.JPanel panelReprint;
    // End of variables declaration//GEN-END:variables
}
