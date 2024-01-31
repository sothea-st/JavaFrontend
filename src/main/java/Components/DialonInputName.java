package Components;

import Color.WindowColor;
import Constant.JavaConstant;
import Model.HoldOrder.HoldOrderModel;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DialonInputName extends javax.swing.JDialog {

     private JPanel detailItem;
     private SubtotalPanel subtotalPanel;

     public DialonInputName(java.awt.Frame parent, boolean modal) {
          super(parent, modal);
          initComponents();
          txtCustomerName.setLabelTextCenter("");
          body.setBackground(WindowColor.mediumGreen);
     }

     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          body = new javax.swing.JPanel();
          lbTitle = new Components.LabelPopUpTitle();
          txtCustomerName = new Components.TextFieldCenter();
          label1 = new Components.Label();
          labelFontBlack9 = new Components.LabelFontBlack();

          setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

          lbTitle.setLabelTitle("Add Customer Name");

          txtCustomerName.setLabelTextCenter("No found");

          label1.setLabelName("Customer Name");

          labelFontBlack9.setBackground(new java.awt.Color(47, 152, 70));
          labelFontBlack9.setFontColor(java.awt.Color.white);
          labelFontBlack9.setLabelName("Save");
          labelFontBlack9.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    labelFontBlack9MouseClicked(evt);
               }
          });

          javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
          body.setLayout(bodyLayout);
          bodyLayout.setHorizontalGroup(
               bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(bodyLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFontBlack9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
          );
          bodyLayout.setVerticalGroup(
               bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(bodyLayout.createSequentialGroup()
                    .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(labelFontBlack9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE))
          );

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          );

          pack();
          setLocationRelativeTo(null);
     }// </editor-fold>//GEN-END:initComponents

     private void labelFontBlack9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelFontBlack9MouseClicked
          String name = txtCustomerName.getValueTextFieldCenter();
          
          if( !JavaConstant.listHoldData.isEmpty() ) {
               for( int i = 0 ; i < JavaConstant.listHoldData.size() ; i++ ) {
                    String customerName = JavaConstant.listHoldData.get(i).getCustomerName();
                    if( name.equals(customerName) ) {
                         JavaAlertMessage j = new JavaAlertMessage(new JFrame(), true);
                         j.setMessage("Process hold can not have same customer name!");
                         j.setVisible(true);
                         return;
                    }
               }
          }
     

          Component[] listHold = detailItem.getComponents();
          int qty = 0;
          for (int i = 0; i < listHold.length; i++) {
               var box = ((BoxItem) listHold[i]);
               qty += box.getQty();
          }
          HoldOrderModel hh = new HoldOrderModel(name, qty, listHold);
          JavaConstant.listHoldData.add(hh);
          detailItem.removeAll();
          detailItem.revalidate();
          detailItem.repaint();
          subtotalPanel.setLabelSubTitleToZero();
          dispose();
     }//GEN-LAST:event_labelFontBlack9MouseClicked

     public static void main(String args[]) {

          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    DialonInputName dialog = new DialonInputName(new javax.swing.JFrame(), true);
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
     private Components.Label label1;
     private Components.LabelFontBlack labelFontBlack9;
     private Components.LabelPopUpTitle lbTitle;
     private Components.TextFieldCenter txtCustomerName;
     // End of variables declaration//GEN-END:variables
}
