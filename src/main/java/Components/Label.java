package Components;

import Color.WindowColor;
import Fonts.WindowFonts;

/**
 *
 * @author FRONT-END.06
 */
public class Label extends javax.swing.JPanel {

    /**
     * @return the labelName
     */
    public String getLabelName() {
        return labelName;
    }

    /**
     * @param labelName the labelName to set
     */
    public void setLabelName(String labelName) {
        this.labelName = labelName;
        lbLabel.setText(labelName);
    }

    /**
     * Creates new form Label
     */
    public Label() {
        initComponents();
        setBackground(WindowColor.mediumGreen);
        lbLabel.setFont(WindowFonts.timeNewRomanBold14);
        lbLabel.setForeground(WindowColor.black);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbLabel = new javax.swing.JLabel();

        lbLabel.setForeground(new java.awt.Color(255, 255, 255));
        lbLabel.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private String labelName;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbLabel;
    // End of variables declaration//GEN-END:variables
}
