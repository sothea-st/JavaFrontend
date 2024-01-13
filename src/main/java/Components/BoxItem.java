package Components;

import Color.WindowColor;
import Components.Shadow.ShadowRenderer;
import Components.Shadow.ShadowType;
import DeleteAndCancel.DeleteDialog;
import Fonts.WindowFonts;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.JFrame;

/**
 *
 * @author MOBILE-APP.02
 */
public class BoxItem extends javax.swing.JPanel {

    public String getLabelAmountKh() {
        return labelAmountKh;
    }

    public void setLabelAmountKh(String labelAmountKh) {
        this.labelAmountKh = labelAmountKh;
        amountkh.setText(labelAmountKh);
    }

    public String getLabelAmountUsd() {
        return labelAmountUsd;
    }

    public void setLabelAmountUsd(String labelAmountUsd) {
        this.labelAmountUsd = labelAmountUsd;
        amountUsd.setText(labelAmountUsd);
    }

    public String getLabelBarcode() {
        return labelBarcode;
    }

    public void setLabelBarcode(String labelBarcode) {
        this.labelBarcode = labelBarcode;
        lbBarcode.setText(labelBarcode);
    }

    public String getLabelPrice() {
        return labelPrice;
    }

    public void setLabelPrice(String labelPrice) {
        this.labelPrice = labelPrice;
        lbPrice.setText(labelPrice);
    }
    
    public String getLabelWeight() {
        return labelWeight;
    }

    public void setLabelWeight(String labelWeight) {
        this.labelWeight = labelWeight;
        lbWeight.setText(labelWeight);
    }
    
     public Icon getIconImage() {
        return iconImage;
    }

    public void setIconImage(Icon iconImage) {
        this.iconImage = iconImage;
        img.setIcon(iconImage);
    }

    public String getLabelProductName() {
         return LabelProductName;
    }

    public void setLabelProductName(String LabelProductName) {
         this.LabelProductName = LabelProductName;
         title.setText(LabelProductName);
    }

    
    /**
    * Creates new form BoxItem
    */
    private String LabelProductName;
    private Icon iconImage;
    private String labelWeight;
    private String labelPrice;
    private String labelBarcode;
    private String labelAmountUsd;
    private String labelAmountKh;

    public BoxItem() {
        initComponents();
        title.setFont(WindowFonts.timeNewRomanBoldForLabel);
        title.setForeground(WindowColor.black);
        lbWeight.setFont(WindowFonts.timeNewRomanBold12);
        lbWeight.setForeground(WindowColor.gray);
        lbSale.setFont(WindowFonts.timeNewRomanBoldForLabel);
        lbSale.setForeground(WindowColor.green);
        lbPrice.setFont(WindowFonts.timeNewRomanBoldForLabel);
        lbPrice.setForeground(WindowColor.darkGreen);
        amountUsd.setFont(WindowFonts.timeNewRomanBoldForLabel);
        amountUsd.setForeground(WindowColor.darkGreen);
        amountkh.setFont(WindowFonts.timeNewRomanBoldForLabel);
        amountkh.setForeground(WindowColor.darkGreen);
        barcode.setFont(WindowFonts.timeNewRomanBoldForLabel);
        lbBarcode.setFont(WindowFonts.timeNewRomanBoldForLabel);
//        lbBarcode.setForeground(WindowColor.gray);
        discount.setFont(WindowFonts.timeNewRomanBoldForLabel);
        txtDiscount.setFont(WindowFonts.timeNewRomanBoldForLabel);
        lbEach.setFont(WindowFonts.timeNewRomanBoldForLabel);
        lbEach.setForeground(WindowColor.darkGreen);
     }
     
     
    //=================================================Create Shadow Box
    private ShadowType shadowType;
    private int shadowSize = 3;
    private float shadowOpacity = 0.8f;
    private Color shadowColor = Color.GRAY;
    
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
        g.fillRoundRect(0, 0, width, height, 10, 10);

        //  Create Shadow
        ShadowRenderer render = new ShadowRenderer(shadowSize, shadowOpacity, shadowColor);
        g2.drawImage(render.createShadow(img), 0, 0, null);
        g2.drawImage(img, x, y, null);
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        lbWeight = new javax.swing.JLabel();
        lbSale = new javax.swing.JLabel();
        lbPrice = new javax.swing.JLabel();
        barcode = new javax.swing.JLabel();
        lbBarcode = new javax.swing.JLabel();
        discount = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JLabel();
        amountUsd = new javax.swing.JLabel();
        amountkh = new javax.swing.JLabel();
        btnDelete = new javax.swing.JLabel();
        buttonAddProduct2 = new Button.ButtonAddProduct();
        jLabel1 = new javax.swing.JLabel();
        lbEach = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        img.setIcon(new javax.swing.ImageIcon("C:\\Users\\front-end.06\\Documents\\NetBeansProjects\\tt_pos_window-danin\\src\\main\\resources\\image\\Pizza.png")); // NOI18N

        title.setText("Pizza");

        lbWeight.setText("Weight");

        lbSale.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbSale.setForeground(new java.awt.Color(47, 155, 70));
        lbSale.setText("Sale Price :");

        lbPrice.setText("Price");

        barcode.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        barcode.setText("Barcode :");

        lbBarcode.setText("Barcode");

        discount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        discount.setForeground(new java.awt.Color(204, 0, 0));
        discount.setText("Discount :");

        txtDiscount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDiscount.setForeground(new java.awt.Color(204, 0, 0));
        txtDiscount.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txtDiscount.setText("$ 0.00");

        amountUsd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        amountUsd.setForeground(new java.awt.Color(16, 107, 67));
        amountUsd.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        amountUsd.setText("$ 1.40");

        amountkh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        amountkh.setForeground(new java.awt.Color(16, 107, 67));
        amountkh.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        amountkh.setText("0");

        btnDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\front-end.06\\Documents\\NetBeansProjects\\tt_pos_window-danin\\src\\main\\resources\\image\\Delete.png")); // NOI18N
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(16, 107, 67));
        jLabel1.setText("៛");

        lbEach.setText("each");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(barcode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbSale, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbEach, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonAddProduct2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbBarcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(discount)
                                .addGap(3, 3, 3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amountUsd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(39, 39, 39)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(amountkh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(title)
                            .addComponent(btnDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(amountkh)
                                .addComponent(jLabel1))
                            .addComponent(lbWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonAddProduct2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbSale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbEach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amountUsd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(discount)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(barcode)
                                .addComponent(lbBarcode)
                                .addComponent(txtDiscount)))
                        .addGap(0, 12, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
       DeleteDialog delete = new DeleteDialog(new JFrame(),true);
       delete.setVisible(true);
    }//GEN-LAST:event_btnDeleteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountUsd;
    private javax.swing.JLabel amountkh;
    private javax.swing.JLabel barcode;
    private javax.swing.JLabel btnDelete;
    private Button.ButtonAddProduct buttonAddProduct2;
    private javax.swing.JLabel discount;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbBarcode;
    private javax.swing.JLabel lbEach;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbSale;
    private javax.swing.JLabel lbWeight;
    private javax.swing.JLabel title;
    private javax.swing.JLabel txtDiscount;
    // End of variables declaration//GEN-END:variables
}
