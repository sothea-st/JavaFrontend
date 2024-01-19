package Components;

import Color.WindowColor;
import Components.Shadow.ShadowRenderer;
import Components.Shadow.ShadowType;
import DeleteAndCancel.DeleteDialog;
import Event.ButtonEvent;
import Fonts.WindowFonts;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author MOBILE-APP.02
 */
public class BoxItem extends javax.swing.JPanel {

    /**
     * @return the labelQuantity
     */
    public int getLabelQuantity() {
        return labelQuantity;
    }

    /**
     * @param labelQuantity the labelQuantity to set
     */
    public void setLabelQuantity(int labelQuantity) {
        this.labelQuantity = labelQuantity;
    }

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

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
        txtDiscount.setText(discountAmount);
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

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
        buttonAddProduct.setQuantity(qty);
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
        proId.setText("" + productId);
    }

    public SubtotalPanel getSubtotalPanel() {
        return subtotalPanel;
    }

    public void setSubtotalPanel(SubtotalPanel subtotalPanel) {
        this.subtotalPanel = subtotalPanel;
    }

     public Component[] getListCom() {
          return listCom;
     }

     public void setListCom(Component[] listCom) {
          this.listCom = listCom;
     }
    
    
    

    //=================================================
    public void initEvent(ButtonEvent event) {
        btnDelete.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                event.onMouseClick();
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
    private String discountAmount;
    private int labelQuantity;
    private int qty;
    private int productId;

    private SubtotalPanel subtotalPanel;
    private Component[] listCom;

    DecimalFormat dm = new DecimalFormat("$ #,##0.00");    // new (hello world) 18-01-2024
    DecimalFormat kh = new DecimalFormat("#,##0");  // new 18-01-2024 (hello world)

    public BoxItem() {
        initComponents();
        title.setFont(WindowFonts.timeNewRomanBold12);
        title.setForeground(WindowColor.black);
        lbWeight.setFont(WindowFonts.timeNewRomanBold10);
        lbWeight.setForeground(WindowColor.gray);
        lbSale.setFont(WindowFonts.timeNewRomanBold12);
        lbSale.setForeground(WindowColor.green);
        lbPrice.setFont(WindowFonts.timeNewRomanBold12);
        lbPrice.setForeground(WindowColor.darkGreen);
        amountUsd.setFont(WindowFonts.timeNewRomanBold12);
        amountUsd.setForeground(WindowColor.darkGreen);
        amountkh.setFont(WindowFonts.timeNewRomanBold12);
        amountkh.setForeground(WindowColor.darkGreen);
        barcode.setFont(WindowFonts.timeNewRomanBold12);
        lbBarcode.setFont(WindowFonts.timeNewRomanBold12);
        discount.setFont(WindowFonts.timeNewRomanBold12);
        txtDiscount.setFont(WindowFonts.timeNewRomanBold12);
        lbEach.setFont(WindowFonts.timeNewRomanBold12);
        lbEach.setForeground(WindowColor.darkGreen);

        // new (hello world) 18-01-2024
        proId.setVisible(false);
        ButtonEvent event = new ButtonEvent() {
            @Override
            public void btnPlus() {
                int getQty = getQty();
                String priceUsd = getLabelPrice();
                priceUsd = priceUsd.replace("$", "");
                priceUsd = priceUsd.replace(",", "");
                getQty++;
                setQty(getQty);
                double subAmountUsd = Double.valueOf(priceUsd) * getQty;
                setLabelAmountUsd(dm.format(subAmountUsd));
                double amountKh = Double.valueOf(subAmountUsd) * 4200;
                setLabelAmountKh(kh.format(amountKh));
                subtotalPanel.setLabelSubtotalUsd("ddddddddddddddddd");
             
//                    for( int i = 0 ; i < listCom.length  )
            }

            @Override
            public void btnMinus() {
                int getQty = getQty();
                getQty--;
                if (getQty != 0) {
                    String priceUsd = getLabelPrice();
                    priceUsd = priceUsd.replace("$", "");
                    priceUsd = priceUsd.replace(",", "");

                    setQty(getQty);
                    double subAmountUsd = Double.valueOf(priceUsd) * getQty;
                    setLabelAmountUsd(dm.format(subAmountUsd));
                    double amountKh = Double.valueOf(subAmountUsd) * 4200;
                    setLabelAmountKh(kh.format(amountKh));
                   
                }

            }
        };
        buttonAddProduct.initEvent(event);

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
        buttonAddProduct = new Button.ButtonAddProduct();
        jLabel1 = new javax.swing.JLabel();
        lbEach = new javax.swing.JLabel();
        proId = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        buttonAddProduct.setQuantity(1);

        jLabel1.setForeground(new java.awt.Color(16, 107, 67));
        jLabel1.setText("៛");

        lbEach.setText("each");

        proId.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(barcode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbSale, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbPrice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbEach)
                                .addGap(18, 18, 18)
                                .addComponent(buttonAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 8, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbBarcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(discount))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(39, 39, 39)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(proId)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amountUsd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amountkh)
                            .addComponent(jLabel1)
                            .addComponent(proId))
                        .addGap(2, 2, 2)
                        .addComponent(amountUsd))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbSale)
                                    .addComponent(lbPrice)
                                    .addComponent(lbEach)))
                            .addComponent(buttonAddProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(barcode)
                            .addComponent(lbBarcode)
                            .addComponent(discount)
                            .addComponent(txtDiscount))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        DeleteDialog delete = new DeleteDialog(new JFrame(), true);
        delete.setVisible(true);
    }//GEN-LAST:event_btnDeleteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountUsd;
    private javax.swing.JLabel amountkh;
    private javax.swing.JLabel barcode;
    private javax.swing.JLabel btnDelete;
    private Button.ButtonAddProduct buttonAddProduct;
    private javax.swing.JLabel discount;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbBarcode;
    private javax.swing.JLabel lbEach;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbSale;
    private javax.swing.JLabel lbWeight;
    private javax.swing.JLabel proId;
    private javax.swing.JLabel title;
    private javax.swing.JLabel txtDiscount;
    // End of variables declaration//GEN-END:variables
}
