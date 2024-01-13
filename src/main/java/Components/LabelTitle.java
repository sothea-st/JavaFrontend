package Components;

import Color.WindowColor;
import Fonts.WindowFonts;

/**
 *
 * @author FRONT-END.06
 */
public class LabelTitle extends javax.swing.JPanel {

    /**
     * @return the labelTitle
     */
    public String getLabelTitle() {
        return labelTitle;
    }

    /**
     * @param labelTitle the labelTitle to set
     */
    public void setLabelTitle(String labelTitle) {
        this.labelTitle = labelTitle;
        lbTitle.setText(labelTitle);
    }

    /**
     * Creates new form LabelTitle
     */
    public LabelTitle() {
        initComponents();
        setBackground(WindowColor.darkGreen);
        lbTitle.setFont(WindowFonts.timeNewRomanBold);
        lbTitle.setForeground(WindowColor.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();

        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    private String labelTitle;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbTitle;
    // End of variables declaration//GEN-END:variables
}
