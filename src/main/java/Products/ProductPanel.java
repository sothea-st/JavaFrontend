package Products;

import Color.WindowColor;
import Components.BoxItem;
import Components.SubtotalPanel;
import Event.ButtonEvent;
import View.MainPage.MainPage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author FRONT-END.06
 */
public class ProductPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProductPanel
     */
    private JPanel panelItem;
    private SubtotalPanel totalPanel;
    
    public ProductPanel(JPanel panelItem, SubtotalPanel totalPanel) {
        initComponents();
        panelProduct.setBackground(WindowColor.slightGreen);
        panelPagination.setBackground(WindowColor.slightGreen);
        setBackground(WindowColor.slightGreen);
        appendProduct();
        this.panelItem = panelItem;
        this.totalPanel=totalPanel;
    }
    
    ArrayList<BoxItem> arrInt = new ArrayList<>();
    //=========================Append Product into panelProductBox===============================
    void appendProduct() {

        scrollItem.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
        File f = new File("C:\\Users\\front-end.06\\Documents\\NetBeansProjects\\tt_pos_window-danin\\src\\main\\resources\\productImage");
        File[] list = f.listFiles();

        // set panel to GridBagLayout
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.rowHeights = new int[]{0,0,0,0,0}; // one row has 5 column
        gridBagLayout.rowWeights = new double[]{0,0,0,0,1};
        gridBagLayout.columnWidths = new int[]{0,0,0,0,0};
        gridBagLayout.columnWeights = new double[]{0,0,0,0,1};

        panelProduct.setLayout(gridBagLayout);

        int x = 0;
        int y = 0;

        for (int i = 0; i < list.length; i++) {
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = x;
            gbc.gridy = y;
            gbc.gridwidth = 1;
            gbc.anchor = gbc.NORTH;
            gbc.insets = new Insets(5, 0, 5, 10);
            x++;
            if (x == 5) {
                 x = 0;
                 y++;
            }
            
            int qty = 1;
            Random rd = new Random();
            double weight = rd.nextDouble(5, 20);
            double price = rd.nextDouble(5, 20);
            double barcode = rd.nextDouble(100, 200);
            double amountUsd = price * qty;

            DecimalFormat df = new DecimalFormat("#,##0.00 kg"); 
            DecimalFormat dm = new DecimalFormat("$ #,##0.00");
            DecimalFormat bar = new DecimalFormat("########00000000");
            
            String name = list[i].getName().substring(0, list[i].getName().length() - 4);
            Icon image = new ImageIcon(list[i].getAbsolutePath());

            ButtonEvent event = new ButtonEvent() {
                @Override
                public void onMouseClick() {

                    int id = arrInt.size();
                    BoxItem box = new BoxItem();
                    box.setLabelProductName("" + name);
                    box.setIconImage(image);
                    box.setLabelWeight(df.format(weight));
                    box.setLabelPrice(dm.format(price));
                    box.setLabelBarcode(bar.format(barcode));
                    box.setLabelAmountUsd(dm.format(amountUsd));
                    arrInt.add(box);
                    
                    double sum = 0;
                    for (int j = 0; j < arrInt.size(); j++) {
                        sum = sum + amountUsd;
                    }


                    panelItem.add(box);
                    panelItem.add(Box.createRigidArea(new Dimension(2, 2)));
                    panelItem.revalidate();
                    panelItem.setBorder(new EmptyBorder(10, 10, 10, 10)); // for padding item 
                    panelItem.setLayout(new BoxLayout(panelItem, BoxLayout.PAGE_AXIS));
                                        totalPanel.setLabelSubtotalUsd(dm.format(sum));
                }
            };
            
                
            ProductBox product = new ProductBox();
            product.initEvent(event);
            String productName;
            if (name.length() > 15) {
                productName = name.substring(0, 14) + "...";
            } else {
                productName = name;
            }
            product.setProductName("<html>" + productName + "</html>");
            
            product.setWeight(df.format(weight));
            
            product.setPrice(dm.format(price));
            
            product.setBarcode(bar.format(barcode));
            
            product.setImage(new ImageIcon(list[i].getAbsolutePath()));
            panelProduct.add(product, gbc);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollItem = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        panelProduct = new javax.swing.JPanel();
        panelPagination = new javax.swing.JPanel();
        button1 = new Button.Button();
        button2 = new Button.Button();
        comboBox1 = new Components.ComboBox();
        labelFontGreen1 = new Components.LabelFontGreen();
        labelFontGreen2 = new Components.LabelFontGreen();
        labelFontGreen3 = new Components.LabelFontGreen();
        labelFontGreen4 = new Components.LabelFontGreen();
        labelFontGreen5 = new Components.LabelFontGreen();
        labelFontGreen6 = new Components.LabelFontGreen();
        labelFontGreen7 = new Components.LabelFontGreen();

        scrollItem.setBorder(null);

        jPanel1.setBackground(new java.awt.Color(215, 234, 213));

        panelProduct.setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(panelProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                .addGap(173, 173, 173))
        );

        scrollItem.setViewportView(jPanel1);

        button1.setBackground(new java.awt.Color(47, 155, 70));
        button1.setButtonName("Home");

        button2.setBackground(new java.awt.Color(47, 155, 70));
        button2.setButtonName("NEW ITEMS");

        labelFontGreen1.setLabelName("4");

        labelFontGreen2.setLabelName(">");

        labelFontGreen3.setLabelName("5");

        labelFontGreen4.setLabelName("3");

        labelFontGreen5.setLabelName("2");

        labelFontGreen6.setLabelName("1");

        labelFontGreen7.setLabelName("<");

        javax.swing.GroupLayout panelPaginationLayout = new javax.swing.GroupLayout(panelPagination);
        panelPagination.setLayout(panelPaginationLayout);
        panelPaginationLayout.setHorizontalGroup(
            panelPaginationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPaginationLayout.createSequentialGroup()
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 427, Short.MAX_VALUE)
                .addGroup(panelPaginationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPaginationLayout.createSequentialGroup()
                        .addComponent(labelFontGreen7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelFontGreen6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelFontGreen5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelFontGreen4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelFontGreen1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelFontGreen3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelFontGreen2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        panelPaginationLayout.setVerticalGroup(
            panelPaginationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPaginationLayout.createSequentialGroup()
                .addComponent(comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPaginationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFontGreen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFontGreen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFontGreen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFontGreen4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFontGreen5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFontGreen6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFontGreen7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelPaginationLayout.createSequentialGroup()
                .addGroup(panelPaginationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(button1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(button2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollItem, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
            .addComponent(panelPagination, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPagination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollItem, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Button.Button button1;
    private Button.Button button2;
    private Components.ComboBox comboBox1;
    private javax.swing.JPanel jPanel1;
    private Components.LabelFontGreen labelFontGreen1;
    private Components.LabelFontGreen labelFontGreen2;
    private Components.LabelFontGreen labelFontGreen3;
    private Components.LabelFontGreen labelFontGreen4;
    private Components.LabelFontGreen labelFontGreen5;
    private Components.LabelFontGreen labelFontGreen6;
    private Components.LabelFontGreen labelFontGreen7;
    private javax.swing.JPanel panelPagination;
    private javax.swing.JPanel panelProduct;
    private javax.swing.JScrollPane scrollItem;
    // End of variables declaration//GEN-END:variables
}
