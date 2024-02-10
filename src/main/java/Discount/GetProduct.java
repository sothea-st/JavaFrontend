
package Discount;

public class GetProduct extends javax.swing.JPanel {

    private String productName;
    private String productBarcode;
    private String productPrice;
    
    
    public GetProduct() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        getProduct = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbBarcode = new javax.swing.JLabel();
        lbPrice = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();

        getProduct.setBackground(new java.awt.Color(255, 255, 255));
        getProduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\POSCASHIER\\tt_pos_window\\src\\main\\resources\\image\\Edit.png")); // NOI18N

        lbBarcode.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbBarcode.setForeground(new java.awt.Color(0, 0, 0));
        lbBarcode.setText("Product Barcode");

        lbPrice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbPrice.setForeground(new java.awt.Color(0, 0, 0));
        lbPrice.setText("Product Price");

        lbName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbName.setForeground(new java.awt.Color(0, 0, 0));
        lbName.setText("Product Name");

        javax.swing.GroupLayout getProductLayout = new javax.swing.GroupLayout(getProduct);
        getProduct.setLayout(getProductLayout);
        getProductLayout.setHorizontalGroup(
            getProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getProductLayout.setVerticalGroup(
            getProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(getProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbBarcode)
                    .addComponent(lbPrice)
                    .addComponent(lbName))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(getProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(getProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
        lbName.setText(productName);
    }

    public String getProductBarcode() {
        return productBarcode;
    }

    public void setProductBarcode(String productBarcode) {
        this.productBarcode = productBarcode;
        lbBarcode.setText(productName);
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
        lbPrice.setText(productPrice);
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel getProduct;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbBarcode;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPrice;
    // End of variables declaration//GEN-END:variables
}
