/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Components;

import Event.ButtonEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author MOBILE-APP.02
 */
public class HoldItem extends javax.swing.JPanel {

     private String name;
     private String qty;
    
     
     public HoldItem() {
          initComponents();
          buttonCancel.setButtonName("Process");
     }

    
     public void initEvent(ButtonEvent event) {
          buttonCancel.addMouseListener(new MouseListener() {
               @Override
               public void mouseClicked(MouseEvent e) {
                    System.err.println("dddddddddddddddddddddddddddddddddddddd = " + name);
                    event.onSelect(name);
               }

               @Override
               public void mousePressed(MouseEvent e) {
               }

               @Override
               public void mouseReleased(MouseEvent e) {
               }

               @Override
               public void mouseEntered(MouseEvent e) {
               }

               @Override
               public void mouseExited(MouseEvent e) {
               }
          });
     }
     
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          holdItem = new javax.swing.JPanel();
          lbName = new javax.swing.JLabel();
          lbQty = new javax.swing.JLabel();
          buttonCancel = new ButtonPackage.ButtonCancel();

          lbName.setText("Name");

          lbQty.setText("qty");

          buttonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    buttonCancelMouseClicked(evt);
               }
          });

          javax.swing.GroupLayout holdItemLayout = new javax.swing.GroupLayout(holdItem);
          holdItem.setLayout(holdItemLayout);
          holdItemLayout.setHorizontalGroup(
               holdItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(holdItemLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lbQty, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addGap(49, 49, 49)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
          );
          holdItemLayout.setVerticalGroup(
               holdItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(holdItemLayout.createSequentialGroup()
                    .addGroup(holdItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(holdItemLayout.createSequentialGroup()
                              .addContainerGap()
                              .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addGroup(holdItemLayout.createSequentialGroup()
                              .addGap(17, 17, 17)
                              .addGroup(holdItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                   .addComponent(lbName)
                                   .addComponent(lbQty))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          );

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
          this.setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addComponent(holdItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0))
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addComponent(holdItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
          );
     }// </editor-fold>//GEN-END:initComponents

     private void buttonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelMouseClicked
        
     }//GEN-LAST:event_buttonCancelMouseClicked

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
          lbName.setText(name);
     }

     public String getQty() {
          return qty;
     }

     public void setQty(String qty) {
          this.qty = qty;
          lbQty.setText(qty);
     }

     
     

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private ButtonPackage.ButtonCancel buttonCancel;
     private javax.swing.JPanel holdItem;
     private javax.swing.JLabel lbName;
     private javax.swing.JLabel lbQty;
     // End of variables declaration//GEN-END:variables
}
