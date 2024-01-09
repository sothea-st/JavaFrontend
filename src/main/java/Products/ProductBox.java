package Products;

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

/**
 *
 * @author FRONT-END.06
 */
public class ProductBox extends javax.swing.JPanel {

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
        txtBarcode.setText(barcode);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
        lbPrice.setText(price);
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
        lbWeight.setText(weight);
    }

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
        img.setIcon(image);
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
        lbName.setText(ProductName);
    }

    /**
     * Creates new form ProductBox
     */
    public ProductBox() {
        initComponents();
        productBox.setBackground(WindowColor.white);
        setBackground(WindowColor.white);
        lbName.setFont(WindowFonts.timeNewRomanBoldForLabel);
        lbName.setForeground(WindowColor.black);
        lbWeight.setFont(WindowFonts.timeNewRomanBold10);
        lbWeight.setForeground(WindowColor.gray);
        lbPrice.setFont(WindowFonts.timeNewRomanBoldForLabel);
        lbPrice.setForeground(WindowColor.darkGreen);
        lbBarcode.setFont(WindowFonts.timeNewRomanBold12);
        lbBarcode.setForeground(WindowColor.gray);
        txtBarcode.setFont(WindowFonts.timeNewRomanBold12);
        txtBarcode.setForeground(WindowColor.gray);
    }
    
    //=================================================
   
    public void initEvent(ButtonEvent event) {
        btnBuy.addMouseListener(new MouseListener() {
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

    private String ProductName;
    private Icon image;
    private String weight;
    private String price;
    private String barcode;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productBox = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbWeight = new javax.swing.JLabel();
        lbPrice = new javax.swing.JLabel();
        lbBarcode = new javax.swing.JLabel();
        btnBuy = new Button.ButtonBuy();
        jLabel1 = new javax.swing.JLabel();
        buttonInstock1 = new Button.ButtonInstock();
        txtBarcode = new javax.swing.JLabel();

        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setIcon(new javax.swing.ImageIcon("C:\\Users\\front-end.06\\Documents\\NetBeansProjects\\tt_pos_window-danin\\src\\main\\resources\\image\\Pizza.png")); // NOI18N

        lbName.setText("Name");

        lbWeight.setText("Weight");

        lbPrice.setText("Price");

        lbBarcode.setText("Barcode");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\front-end.06\\Documents\\NetBeansProjects\\tt_pos_window-danin\\src\\main\\resources\\image\\Flag-United Kingdom -icon.png")); // NOI18N

        txtBarcode.setText("736473");

        javax.swing.GroupLayout productBoxLayout = new javax.swing.GroupLayout(productBox);
        productBox.setLayout(productBoxLayout);
        productBoxLayout.setHorizontalGroup(
            productBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productBoxLayout.createSequentialGroup()
                .addComponent(lbBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(productBoxLayout.createSequentialGroup()
                .addGroup(productBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(productBoxLayout.createSequentialGroup()
                        .addComponent(lbWeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(productBoxLayout.createSequentialGroup()
                        .addComponent(lbPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(buttonInstock1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        productBoxLayout.setVerticalGroup(
            productBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productBoxLayout.createSequentialGroup()
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(productBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(productBoxLayout.createSequentialGroup()
                        .addComponent(lbWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(productBoxLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonInstock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(productBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productBoxLayout.createSequentialGroup()
                        .addComponent(btnBuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(lbBarcode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBarcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productBox, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Button.ButtonBuy btnBuy;
    private Button.ButtonInstock buttonInstock1;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbBarcode;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbWeight;
    private javax.swing.JPanel productBox;
    private javax.swing.JLabel txtBarcode;
    // End of variables declaration//GEN-END:variables
}
