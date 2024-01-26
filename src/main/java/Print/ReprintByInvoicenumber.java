package Print;

import Color.WindowColor;
import Components.JavaAlertMessage;
import Constant.JavaConnection;
import Constant.JavaConstant;
import Constant.JavaRoute;
import Event.ButtonEvent;
import Fonts.WindowFonts;
import Model.Reprint.DataSuccessModel;
import Receipt.Receipt;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import okhttp3.Response;

/**
 *
 * @author FRONT-END.06
 */
public class ReprintByInvoicenumber extends javax.swing.JDialog {

     public ReprintByInvoicenumber(java.awt.Frame parent, boolean modal) {
          super(parent, modal);
          initComponents();
          panelReprint.setBackground(WindowColor.mediumGreen);
          setDefaultCloseOperation(DISPOSE_ON_CLOSE);
          setResizable(false);
          event();
     }

     //Action call function placeholder
     void event() {
          ButtonEvent btnevent = new ButtonEvent() {
               @Override
               public void onFocusGain() {

               }
          };
          txtInvoiceNumber.initEvent(btnevent);
     }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelReprint = new javax.swing.JPanel();
        btnBack = new Button.Button();
        btnPreview = new Button.Button();
        txtInvoiceNumber = new Components.TextField();
        labelPopUpTitle1 = new Components.LabelPopUpTitle();
        lbInvoice = new Components.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelReprint.setForeground(new java.awt.Color(0, 0, 0));

        btnBack.setButtonName("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        btnPreview.setBackground(new java.awt.Color(47, 155, 70));
        btnPreview.setButtonName("Review");
        btnPreview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPreviewMouseClicked(evt);
            }
        });

        txtInvoiceNumber.setLabelTextField("Scan or input");

        labelPopUpTitle1.setLabelTitle("Reprint by Invoice №");

        lbInvoice.setLabelName("Invoice №");

        javax.swing.GroupLayout panelReprintLayout = new javax.swing.GroupLayout(panelReprint);
        panelReprint.setLayout(panelReprintLayout);
        panelReprintLayout.setHorizontalGroup(
            panelReprintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReprintLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(panelReprintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReprintLayout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReprintLayout.createSequentialGroup()
                        .addComponent(lbInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInvoiceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addComponent(labelPopUpTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelReprintLayout.setVerticalGroup(
            panelReprintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReprintLayout.createSequentialGroup()
                .addComponent(labelPopUpTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(panelReprintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtInvoiceNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelReprintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelReprintLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelReprint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
         this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnPreviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPreviewMouseClicked

         String paymentNo = txtInvoiceNumber.getValueTextField();
         JavaAlertMessage j = new JavaAlertMessage(new JFrame(), true);
         if (paymentNo == null) {
              j.setMessage("Invoice № can not be empty!");
              j.setVisible(true);
              return;
         }

         try {

              Receipt rec = new Receipt(new JFrame(), true);
              Response response = JavaConnection.get(JavaRoute.reprintByLast + JavaConstant.cashierId + "/" + paymentNo);

              if (response.isSuccessful()) {
                   String myObject = response.body().string();
                   ObjectMapper objMap = new ObjectMapper();
                   DataSuccessModel d = objMap.readValue(myObject, DataSuccessModel.class);
                   rec.setDataSuccess(d);
                   rec.setVisible(true);
              } else {
                   j.setMessage("Wrong Invoice №!");
                   j.setVisible(true);
              }

         } catch (Exception e) {
              System.err.println("error = " + e);
         }

    }//GEN-LAST:event_btnPreviewMouseClicked

     public static void main(String args[]) {

          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    ReprintByInvoicenumber dialog = new ReprintByInvoicenumber(new javax.swing.JFrame(), true);
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
    private Button.Button btnBack;
    private Button.Button btnPreview;
    private Components.LabelPopUpTitle labelPopUpTitle1;
    private Components.Label lbInvoice;
    private javax.swing.JPanel panelReprint;
    private Components.TextField txtInvoiceNumber;
    // End of variables declaration//GEN-END:variables
}
