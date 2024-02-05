package Components;

import Color.WindowColor;
import Constant.JavaConnection;
import Constant.JavaRoute;
import javax.swing.ImageIcon;
import okhttp3.Response;

/**
 *
 * @author FRONT-END.06
 */
public class BackgroundImage extends javax.swing.JPanel {

     public BackgroundImage() {
          initComponents();
          setBackground(WindowColor.slightGreen);
          getBgImage();
     }

     void getBgImage() {
          Response response = JavaConnection.getWithoutToken(JavaRoute.bgImage + "King Mart Background.png");
          if (response.isSuccessful()) {
               try {
                    byte[] bg = response.body().bytes();
                    jLabel1.setIcon(new ImageIcon(bg));
               } catch (Exception e) {
                    System.err.println("error = " + e);
               }
          }
     }

     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jLabel1 = new javax.swing.JLabel();

          jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
          this.setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(50, Short.MAX_VALUE))
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE))
          );
     }// </editor-fold>//GEN-END:initComponents


     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JLabel jLabel1;
     // End of variables declaration//GEN-END:variables
}
