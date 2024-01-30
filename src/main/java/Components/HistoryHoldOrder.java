/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Components;

import Color.WindowColor;
import Constant.JavaConstant;
import Event.ButtonEvent;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author MOBILE-APP.02
 */
public class HistoryHoldOrder extends javax.swing.JDialog {

     /**
      * Creates new form HoldOrder
      */
     public HistoryHoldOrder(java.awt.Frame parent, boolean modal) {
          super(parent, modal);
          initComponents();
          setDefaultCloseOperation(DISPOSE_ON_CLOSE);
          body.setBackground(WindowColor.mediumGreen);
          panelHold.setBackground(WindowColor.mediumGreen);
          setResizable(false);
          buttonCancel.setButtonName("Close");

          for (int i = 0; i < JavaConstant.listHoldData.size(); i++) {
               String name = JavaConstant.listHoldData.get(i).getCustomerName();
               int qty = JavaConstant.listHoldData.get(i).getQty();
               HoldItem h = new HoldItem();
               
               ButtonEvent events = new ButtonEvent() {
                    @Override
                    public void onSelect(String key) {
                         System.err.println("ffff hhhhhhh + " + key);
                    }     
               };
               
               h.initEvent(events);
               h.setName(name);
               h.setQty("" + qty);
               panelHold.add(h);
               panelHold.revalidate();
               panelHold.repaint();
               panelHold.add(Box.createRigidArea(new Dimension(2, 2)));
          }
          panelHold.setLayout(new BoxLayout(panelHold, BoxLayout.Y_AXIS));
          panelHold.setBorder(new EmptyBorder(2, 2, 2, 2));

     }

     /**
      * This method is called from
      * within the constructor to
      * initialize the form. WARNING: Do
      * NOT modify this code. The
      * content of this method is always
      * regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          lbTitle = new Components.LabelPopUpTitle();
          body = new javax.swing.JPanel();
          buttonCancel = new ButtonPackage.ButtonCancel();
          panelHold = new javax.swing.JPanel();
          jPanel1 = new javax.swing.JPanel();
          jLabel1 = new javax.swing.JLabel();
          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();

          setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

          lbTitle.setLabelTitle("History Hold Order");

          buttonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    buttonCancelMouseClicked(evt);
               }
          });

          javax.swing.GroupLayout panelHoldLayout = new javax.swing.GroupLayout(panelHold);
          panelHold.setLayout(panelHoldLayout);
          panelHoldLayout.setHorizontalGroup(
               panelHoldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGap(0, 0, Short.MAX_VALUE)
          );
          panelHoldLayout.setVerticalGroup(
               panelHoldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGap(0, 138, Short.MAX_VALUE)
          );

          jLabel1.setText("Customer Name");

          jLabel2.setText("QTY");

          jLabel3.setText("Action");

          javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
          jPanel1.setLayout(jPanel1Layout);
          jPanel1Layout.setHorizontalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(142, 142, 142)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(56, 56, 56))
          );
          jPanel1Layout.setVerticalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel1)
                         .addComponent(jLabel2)
                         .addComponent(jLabel3))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          );

          javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
          body.setLayout(bodyLayout);
          bodyLayout.setHorizontalGroup(
               bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                    .addContainerGap(516, Short.MAX_VALUE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
               .addComponent(panelHold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          );
          bodyLayout.setVerticalGroup(
               bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panelHold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 385, Short.MAX_VALUE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
          );

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
               .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          );

          pack();
          setLocationRelativeTo(null);
     }// </editor-fold>//GEN-END:initComponents

     private void buttonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelMouseClicked
          this.dispose();
     }//GEN-LAST:event_buttonCancelMouseClicked

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
               java.util.logging.Logger.getLogger(HistoryHoldOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(HistoryHoldOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(HistoryHoldOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(HistoryHoldOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>
          //</editor-fold>

          /* Create and display the dialog */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    HistoryHoldOrder dialog = new HistoryHoldOrder(new javax.swing.JFrame(), true);
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
     private javax.swing.JPanel body;
     private ButtonPackage.ButtonCancel buttonCancel;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JPanel jPanel1;
     private Components.LabelPopUpTitle lbTitle;
     private javax.swing.JPanel panelHold;
     // End of variables declaration//GEN-END:variables
}
