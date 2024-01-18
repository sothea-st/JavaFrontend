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
import javax.swing.ImageIcon;

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
        lbName.setFont(WindowFonts.timeNewRomanBold11);
        lbName.setForeground(WindowColor.black);
        lbWeight.setFont(WindowFonts.timeNewRomanBold10);
        lbWeight.setForeground(WindowColor.gray);
        lbPrice.setFont(WindowFonts.timeNewRomanBold12);
        lbPrice.setForeground(WindowColor.darkGreen);
        lbBarcode.setFont(WindowFonts.timeNewRomanBold10);
        lbBarcode.setForeground(WindowColor.gray);
        txtBarcode.setFont(WindowFonts.timeNewRomanBold10);
        txtBarcode.setForeground(WindowColor.gray);
        lbEach.setFont(WindowFonts.timeNewRomanBold10);
        lbEach.setForeground(WindowColor.darkGreen);
        

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
    private String productStatus;
    private Icon imageFlag;

     public Icon getImageFlag() {
          return imageFlag;
     }

     public void setImageFlag(Icon imageFlag) {
          this.imageFlag = imageFlag;
          flagImage.setIcon(imageFlag);
     }
    @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          productBox = new javax.swing.JPanel();
          img = new javax.swing.JLabel();
          lbName = new javax.swing.JLabel();
          lbWeight = new javax.swing.JLabel();
          lbBarcode = new javax.swing.JLabel();
          flagImage = new javax.swing.JLabel();
          txtBarcode = new javax.swing.JLabel();
          status = new Button.ButtonInstock();
          lbEach = new javax.swing.JLabel();
          lbPrice = new javax.swing.JLabel();
          btnBuy = new Button.ButtonBuy();

          img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

          lbName.setText("Name");

          lbWeight.setText("Weight");

          lbBarcode.setText("Barcode");

          flagImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

          txtBarcode.setText("0000");

          lbEach.setText("each");

          lbPrice.setText("Price");

          javax.swing.GroupLayout productBoxLayout = new javax.swing.GroupLayout(productBox);
          productBox.setLayout(productBoxLayout);
          productBoxLayout.setHorizontalGroup(
               productBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productBoxLayout.createSequentialGroup()
                    .addGroup(productBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                         .addComponent(img, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addGroup(productBoxLayout.createSequentialGroup()
                              .addComponent(lbWeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGap(18, 18, 18)
                              .addComponent(flagImage, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(9, 9, 9))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productBoxLayout.createSequentialGroup()
                    .addGroup(productBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                         .addGroup(productBoxLayout.createSequentialGroup()
                              .addComponent(lbBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(txtBarcode)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(btnBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addGroup(javax.swing.GroupLayout.Alignment.LEADING, productBoxLayout.createSequentialGroup()
                              .addComponent(lbPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(lbEach, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(24, 24, 24))
          );
          productBoxLayout.setVerticalGroup(
               productBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productBoxLayout.createSequentialGroup()
                    .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(productBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                         .addComponent(lbWeight, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                         .addComponent(flagImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(productBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                         .addGroup(productBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(lbEach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(lbPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(productBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(lbBarcode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addComponent(txtBarcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addComponent(btnBuy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
          );

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
          this.setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(productBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, Short.MAX_VALUE)
                    .addContainerGap())
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
          );
     }// </editor-fold>//GEN-END:initComponents


     // Variables declaration - do not modify//GEN-BEGIN:variables
     private Button.ButtonBuy btnBuy;
     private javax.swing.JLabel flagImage;
     private javax.swing.JLabel img;
     private javax.swing.JLabel lbBarcode;
     private javax.swing.JLabel lbEach;
     private javax.swing.JLabel lbName;
     private javax.swing.JLabel lbPrice;
     private javax.swing.JLabel lbWeight;
     private javax.swing.JPanel productBox;
     private Button.ButtonInstock status;
     private javax.swing.JLabel txtBarcode;
     // End of variables declaration//GEN-END:variables

     /**
      * @return the productStatus
      */
     public String getProductStatus() {
          return productStatus;
     }

     /**
      * @param productStatus the productStatus to set
      */
     public void setProductStatus(String productStatus) {
          this.productStatus = productStatus;
          status.setButtonName(productStatus);
     }
}
