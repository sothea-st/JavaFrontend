package Components;

import Color.WindowColor;
import Components.Shadow.ShadowRenderer;
import Components.Shadow.ShadowType;
import Event.ButtonEvent;
import Fonts.WindowFonts;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.JScrollPane;

/**
 *
 * @author MOBILE-APP.02
 */
public class BoxItem extends javax.swing.JPanel {

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

    public BoxItem() {
        initComponents();
        title.setFont(WindowFonts.timeNewRomanBoldForLabel);
        title.setForeground(WindowColor.black);
        lbWeight.setFont(WindowFonts.timeNewRomanBold10);
        lbWeight.setForeground(WindowColor.gray);
        lbPrice.setFont(WindowFonts.timeNewRomanBoldForLabel);
        lbPrice.setForeground(WindowColor.darkGreen);
        lbBarcode.setFont(WindowFonts.timeNewRomanBold12);
        lbBarcode.setForeground(WindowColor.gray);
//            txtBarcode.setFont(WindowFonts.timeNewRomanBold12);
//            txtBarcode.setForeground(WindowColor.gray);
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
        Discount = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JLabel();
        amountUsd = new javax.swing.JLabel();
        totalPriceKhr = new javax.swing.JLabel();
        button1 = new Button.Button();
        button2 = new Button.Button();
        button3 = new Button.Button();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        img.setIcon(new javax.swing.ImageIcon("C:\\Users\\front-end.06\\Documents\\NetBeansProjects\\tt_pos_window-danin\\src\\main\\resources\\image\\Pizza.png")); // NOI18N
        img.setText("jLabel1");

        title.setText("Pizza");

        lbWeight.setText("Weight");

        lbSale.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbSale.setForeground(new java.awt.Color(47, 155, 70));
        lbSale.setText("Sale Price :");

        lbPrice.setText("Price");

        barcode.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        barcode.setText("Barcode :");

        lbBarcode.setText("Barcode");

        Discount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Discount.setForeground(new java.awt.Color(204, 0, 0));
        Discount.setText("Discount :");

        txtDiscount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDiscount.setForeground(new java.awt.Color(204, 0, 0));
        txtDiscount.setText("$0");

        amountUsd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        amountUsd.setForeground(new java.awt.Color(16, 107, 67));
        amountUsd.setText("$1.40");

        totalPriceKhr.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        totalPriceKhr.setForeground(new java.awt.Color(16, 107, 67));
        totalPriceKhr.setText("5,400");

        button1.setBackground(new java.awt.Color(16, 107, 67));
        button1.setButtonName("-");

        button2.setBackground(new java.awt.Color(16, 107, 67));
        button2.setButtonName("1");

        button3.setBackground(new java.awt.Color(16, 107, 67));
        button3.setButtonName("+");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\front-end.06\\Documents\\NetBeansProjects\\tt_pos_window-danin\\src\\main\\resources\\image\\Delete.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(barcode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbSale, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Discount)
                                .addGap(2, 2, 2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(amountUsd))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbWeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(totalPriceKhr)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(title)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbWeight)
                                    .addComponent(totalPriceKhr))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbSale)
                                    .addComponent(lbPrice)
                                    .addComponent(amountUsd)))
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(barcode)
                            .addComponent(lbBarcode)
                            .addComponent(Discount)
                            .addComponent(txtDiscount))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Discount;
    private javax.swing.JLabel amountUsd;
    private javax.swing.JLabel barcode;
    private Button.Button button1;
    private Button.Button button2;
    private Button.Button button3;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbBarcode;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbSale;
    private javax.swing.JLabel lbWeight;
    private javax.swing.JLabel title;
    private javax.swing.JLabel totalPriceKhr;
    private javax.swing.JLabel txtDiscount;
    // End of variables declaration//GEN-END:variables
}
