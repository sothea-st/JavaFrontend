package Components;
 
import javax.swing.JLabel;

public class ReceiptBox extends javax.swing.JPanel {
     
     
     private String productName;
     private String qtyStr;
     private String barcodeStr;
     private String unitPriceStr;
     private String amountStr;
 
    public ReceiptBox() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jPanel2 = new javax.swing.JPanel();
          lbBarcode = new javax.swing.JLabel();
          lbProduct = new javax.swing.JLabel();
          lbQty = new javax.swing.JLabel();
          unitPriceLb = new javax.swing.JLabel();
          amount = new javax.swing.JLabel();

          jPanel2.setBackground(new java.awt.Color(255, 255, 255));

          lbBarcode.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
          lbBarcode.setText("9556439882270");
          lbBarcode.setToolTipText("");

          lbProduct.setFont(new java.awt.Font("Khmer OS Content", 0, 12)); // NOI18N
          lbProduct.setText("នំប្រៃផ្អែម ៣៩០​ក្រាម");

          lbQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
          lbQty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          lbQty.setText("1");

          unitPriceLb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
          unitPriceLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          unitPriceLb.setText("$ 1.85");

          amount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
          amount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          amount.setText("$ 1.85");

          javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
          jPanel2.setLayout(jPanel2Layout);
          jPanel2Layout.setHorizontalGroup(
               jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(lbBarcode)
                         .addComponent(lbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbQty, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(unitPriceLb, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(33, 33, 33)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(19, 19, 19))
          );
          jPanel2Layout.setVerticalGroup(
               jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(jPanel2Layout.createSequentialGroup()
                              .addContainerGap()
                              .addComponent(lbBarcode)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(lbProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                         .addGroup(jPanel2Layout.createSequentialGroup()
                              .addGap(17, 17, 17)
                              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                   .addComponent(lbQty)
                                   .addComponent(unitPriceLb)
                                   .addComponent(amount))))
                    .addContainerGap())
          );

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
          this.setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
          );
     }// </editor-fold>//GEN-END:initComponents
     
     public void setQtyStr(String qtyStr) {
          this.qtyStr = qtyStr;
          lbQty.setText(qtyStr);
     }

     public void setBarcodeStr(String barcodeStr) {
          this.barcodeStr = barcodeStr;
          lbBarcode.setText(barcodeStr);
     }

     public void setUnitPriceStr(String unitPriceStr) {
          this.unitPriceStr = unitPriceStr;
          unitPriceLb.setText(unitPriceStr);
     }

     public void setAmountStr(String amountStr) {
          this.amountStr = amountStr;
          amount.setText(amountStr);
     }

     public void setProductName(String productName) {
          this.productName = productName;
          lbProduct.setText("<html>"+productName+"</html>");
     }
     
     
     
 
     

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JLabel amount;
     private javax.swing.JPanel jPanel2;
     private javax.swing.JLabel lbBarcode;
     private javax.swing.JLabel lbProduct;
     private javax.swing.JLabel lbQty;
     private javax.swing.JLabel unitPriceLb;
     // End of variables declaration//GEN-END:variables
}
