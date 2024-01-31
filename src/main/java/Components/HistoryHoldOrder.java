/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Components;

import Color.WindowColor;
import Constant.JavaConstant;
import Controller.ActionProduct.ActionProduct;
import Event.ButtonEvent;
import Fonts.WindowFonts;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

 
public class HistoryHoldOrder extends javax.swing.JDialog {

     private JPanel detailItem;
     private SubtotalPanel subtotalPanel;

     public HistoryHoldOrder(java.awt.Frame parent, boolean modal) {
          super(parent, modal);
          initComponents();
          remove.setFont(WindowFonts.timeNewRomanBold14);
          setDefaultCloseOperation(DISPOSE_ON_CLOSE);
          body.setBackground(WindowColor.mediumGreen);
          panelHold.setBackground(WindowColor.mediumGreen);
          setResizable(false);
          buttonCancel.setButtonName("Close");
          ActionProduct actionProduct = new ActionProduct();
          for (int i = 0; i < JavaConstant.listHoldData.size(); i++) {
               String name = JavaConstant.listHoldData.get(i).getCustomerName();
               int qty = JavaConstant.listHoldData.get(i).getQty();
               Component[] listCom = JavaConstant.listHoldData.get(i).getListCom();
               HoldItem h = new HoldItem();
               int index = i;
               ButtonEvent events = new ButtonEvent() {
                    @Override
                    public void onSelect(String key) {
                         detailItem.removeAll();
                         for (int j = 0; j < listCom.length; j++) {
                              var box = ((BoxItem) listCom[j]);
                              detailItem.add(box);
                         }
                         refreshPanel();
                         detailItem.setBorder(new BevelBorder(BevelBorder.RAISED));
                         detailItem.setLayout(new BoxLayout(detailItem, BoxLayout.PAGE_AXIS));
                         detailItem.setBackground(WindowColor.white);
                         actionProduct.total(0, listCom, 0, subtotalPanel);
                         JavaConstant.indexArrayListHold = index;
                         dispose();
                    }

                    @Override
                    public void onRemove(String key) {
                         JavaConstant.listHoldData.remove(index);
                         panelHold.remove(index);
                         refreshPanel();
                    }
               };

               h.initEvent(events);
               h.setName(name);
               h.setQty("" + qty);
               panelHold.add(h);
               refreshPanel();
               panelHold.add(Box.createRigidArea(new Dimension(2, 2)));
          }
          panelHold.setLayout(new BoxLayout(panelHold, BoxLayout.Y_AXIS));
          panelHold.setBorder(new EmptyBorder(2, 2, 2, 2));

     }

     void refreshPanel() {
          panelHold.revalidate();
          panelHold.repaint();
     }
     
     
     
  
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
          remove = new javax.swing.JLabel();

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
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
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

          remove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          remove.setText("Remove All");
          remove.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    removeMouseClicked(evt);
               }
          });

          javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
          body.setLayout(bodyLayout);
          bodyLayout.setHorizontalGroup(
               bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(panelHold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(buttonCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(remove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
          );
          bodyLayout.setVerticalGroup(
               bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)
                    .addComponent(panelHold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 350, Short.MAX_VALUE)
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

     private void removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseClicked
          panelHold.removeAll();
          refreshPanel();
          JavaConstant.listHoldData.clear();
     }//GEN-LAST:event_removeMouseClicked

     public static void main(String args[]) {

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

     public JPanel getDetailItem() {
          return detailItem;
     }

     public void setDetailItem(JPanel detailItem) {
          this.detailItem = detailItem;
     }

     public SubtotalPanel getSubtotalPanel() {
          return subtotalPanel;
     }

     public void setSubtotalPanel(SubtotalPanel subtotalPanel) {
          this.subtotalPanel = subtotalPanel;
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
     private javax.swing.JLabel remove;
     // End of variables declaration//GEN-END:variables
}
