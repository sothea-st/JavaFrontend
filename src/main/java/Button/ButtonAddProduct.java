package Button;

import Color.WindowColor;
import Components.Shadow.ShadowRenderer;
import Components.Shadow.ShadowType;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

/**
 *
 * @author FRONT-END.06
 */
public class ButtonAddProduct extends javax.swing.JPanel {

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
        lbQty.setText(""+ quantity);
    }
    
    public ButtonAddProduct() {
        initComponents();
        setBackground(WindowColor.white);
    }
    
    private int quantity;

    //=================================================Create Shadow Box
    private ShadowType shadowType;
    private int shadowSize = 3;
    private float shadowOpacity = 0.8f;
    private Color shadowColor = WindowColor.darkGreen;
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        setOpaque(false);
        createShadow(grphcs);
        super.paintComponent(grphcs);
    }
    
    private void createShadow(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        int size = shadowSize * 2;
        int x = 0;
        int y = 0;
        int width = getWidth() - size;
        int height = getHeight() - size;
        if (shadowType == ShadowType.TOP) {
             x = shadowSize;
             y = size;
        } else if (shadowType == ShadowType.BOT) {
             x = shadowSize;
             y = 0;
        } else if (shadowType == ShadowType.TOP_LEFT) {
             x = size;
             y = size;
        } else if (shadowType == ShadowType.TOP_RIGHT) {
             x = 0;
             y = size;
        } else if (shadowType == ShadowType.BOT_LEFT) {
             x = size;
             y = 0;
        } else if (shadowType == ShadowType.BOT_RIGHT) {
             x = 0;
             y = 0;
        } else {
             //  Center
             x = shadowSize;
             y = shadowSize;
        }
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = img.createGraphics();
        g.setColor(getBackground());
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.fillRoundRect(0, 0, width, height, 40, 40);

        //  Create Shadow
        ShadowRenderer render = new ShadowRenderer(shadowSize, shadowOpacity, shadowColor);
        g2.drawImage(render.createShadow(img), 0, 0, null);
        g2.drawImage(img, x, y, null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbDecrease = new javax.swing.JLabel();
        lbQty = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(100, 32));

        lbDecrease.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbDecrease.setForeground(new java.awt.Color(16, 107, 67));
        lbDecrease.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDecrease.setText("-");

        lbQty.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbQty.setForeground(new java.awt.Color(16, 107, 67));
        lbQty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQty.setText("1");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(16, 107, 67));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("+");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbDecrease, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbQty, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbQty, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbDecrease, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbDecrease;
    private javax.swing.JLabel lbQty;
    // End of variables declaration//GEN-END:variables
}
