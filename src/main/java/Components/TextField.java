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
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

/**
 *
 * @author FRONT-END.06
 */
public class TextField extends javax.swing.JPanel {
     
     private String labelTextField;
     private String valueTextField;
     
     public TextField() {
          initComponents();
          setBackground(WindowColor.white);
          txtText.setFont(WindowFonts.timeNewRoman14);
     }

     //Create Placeholder
     public void initEvent(ButtonEvent event) {
          txtText.addFocusListener(new FocusListener() {
               @Override
               public void focusGained(FocusEvent e) {
                    if (txtText.getText().trim().equals(labelTextField)) {
                         txtText.setText("");
                    }
                    txtText.setForeground(Color.BLACK);
               }
               
               @Override
               public void focusLost(FocusEvent e) {
                    if (txtText.getText().trim().equals("")) {
                         txtText.setText(labelTextField);
                         txtText.setForeground(Color.LIGHT_GRAY);
                    }
                    
                    if (txtText.getText().trim().equals(labelTextField)) {
                         txtText.setForeground(Color.LIGHT_GRAY);
                    }
               }
          });
          
          txtText.addKeyListener(new KeyListener() {
               @Override
               public void keyTyped(KeyEvent e) {
                    String text = txtText.getText();
                    setValueTextField(text);
                    event.onKeyType();
               }
               
               @Override
               public void keyPressed(KeyEvent e) {
               }
               
               @Override
               public void keyReleased(KeyEvent e) {
                    
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
     
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtText = new javax.swing.JTextField();

        txtText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtText.setBorder(null);
        txtText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTextFocusGained(evt);
            }
        });
        txtText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTextKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtText, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtText)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTextFocusGained
         // TODO add your handling code here:
    }//GEN-LAST:event_txtTextFocusGained
     
     public String getLabelTextField() {
          return labelTextField;
     }
     
     public void setLabelTextField(String labelTextField) {
          this.labelTextField = labelTextField;
          txtText.setText(labelTextField);
          txtText.setForeground(Color.LIGHT_GRAY);
     }

     private void txtTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTextKeyReleased
          // TODO add your handling code here:
          String txt = txtText.getText();
          setValueTextField(txt);
     }//GEN-LAST:event_txtTextKeyReleased
     
     public String getValueTextField() {
          return valueTextField;
     }
     
     public void setValueTextField(String valueTextField) {
          this.valueTextField = valueTextField;
          txtText.setText(valueTextField);
          txtText.setForeground(Color.BLACK);
     }

     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField txtText;
    // End of variables declaration//GEN-END:variables

}
