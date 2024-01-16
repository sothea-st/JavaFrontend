package Products;

import Button.Button;
import Color.WindowColor;
import Components.BoxItem;
import Components.SubtotalPanel;
import Event.ButtonEvent;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import javax.swing.border.BevelBorder;
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
    private Button btnPayment;
    
    public ProductPanel(JPanel panelItem, SubtotalPanel totalPanel, Button btnPayment) {
        initComponents();
        panelProduct.setBackground(WindowColor.slightGreen);
        panelPagination.setBackground(WindowColor.slightGreen);
        setBackground(WindowColor.slightGreen);
        appendProduct();
        this.panelItem = panelItem;
        this.totalPanel=totalPanel;
        this.btnPayment=btnPayment;
        addCombo();

    }
    
    //Add Combobox item
    void addCombo(){
        HashMap<String,String> map = new HashMap<>();
        map.put("", "Select Product by Brand");
        map.put("1", "ABC");
        map.put("2", "DES");
        cmboxBrand.setMap(map);
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

        int rowLenght = list.length;
        
        for (int i = 0; i < rowLenght; i++) {
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
            int id = i + 1;
           
            Random rd = new Random();
            double weight = rd.nextDouble(5, 20);
            double price = rd.nextDouble(5, 20);
            double barcode = rd.nextDouble(100, 200);
            double amountUsd = price * qty;
            double amountKhr = price * qty * 4200;

            DecimalFormat df = new DecimalFormat("#,##0.00 kg"); 
            DecimalFormat dm = new DecimalFormat("$ #,##0.00");
            DecimalFormat bar = new DecimalFormat("########00000000");
            DecimalFormat kh = new DecimalFormat("#,##0.00");
            
            String name = list[i].getName().substring(0, list[i].getName().length() - 4);
            Icon image = new ImageIcon(list[i].getAbsolutePath());
            
            ButtonEvent event = new ButtonEvent() {
                @Override
                public void onMouseClick() {

                    BoxItem box = new BoxItem();
                    box.setLabelProductName("" + name);
                    box.setIconImage(image);
                    box.setLabelWeight(df.format(weight));
                    box.setLabelPrice(dm.format(price));
                    box.setLabelBarcode(bar.format(barcode));
                    box.setLabelAmountUsd(dm.format(amountUsd));
                    box.setLabelAmountKh(kh.format(amountKhr)); 
                    
                    double sum = 0;
                    for (int j = 0; j < arrInt.size(); j++) {
                        sum = sum + amountUsd;
                    }
                    
                    double sumKh = 0;
                    for (int j = 0; j < arrInt.size(); j++) {
                        sumKh = sumKh + amountKhr;
                    }

                    arrInt.add(box);
                    panelItem.add(box);
                    panelItem.add(Box.createRigidArea(new Dimension(2, 2)));
                    panelItem.revalidate();
//                    panelItem.setBorder(new EmptyBorder(10, 10, 10, 10)); // for padding item 
                    
                    panelItem.setBorder(new BevelBorder(BevelBorder.RAISED));
                    panelItem.setLayout(new BoxLayout(panelItem, BoxLayout.PAGE_AXIS));
                    panelItem.setBackground(WindowColor.white);
                    
                    totalPanel.setLabelSubtotalUsd(dm.format(sum));
                    totalPanel.setLabelSubtotalKhr(kh.format(sumKh));
                    btnPayment.setBackground(WindowColor.lightBlue);
                    
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
        cmboxBrand = new Components.ComboBox();
        labelFontGreen1 = new Components.LabelFontGreen();
        labelFontGreen2 = new Components.LabelFontGreen();
        labelFontGreen3 = new Components.LabelFontGreen();
        labelFontGreen4 = new Components.LabelFontGreen();
        labelFontGreen5 = new Components.LabelFontGreen();
        labelFontGreen6 = new Components.LabelFontGreen();
        labelFontGreen7 = new Components.LabelFontGreen();
        labelTitle1 = new Components.LabelTitle();
        labelTitle2 = new Components.LabelTitle();

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
                .addComponent(panelProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addGap(304, 304, 304))
        );

        scrollItem.setViewportView(jPanel1);

        labelFontGreen1.setLabelName(">");

        labelFontGreen2.setLabelName("<");

        labelFontGreen3.setLabelName("1");

        labelFontGreen4.setLabelName("2");

        labelFontGreen5.setLabelName("3");

        labelFontGreen6.setLabelName("4");

        labelFontGreen7.setLabelName("5");

        labelTitle1.setBackground(new java.awt.Color(47, 155, 70));
        labelTitle1.setLabelTitle("Home");

        labelTitle2.setBackground(new java.awt.Color(47, 155, 70));
        labelTitle2.setLabelTitle("NEW ITEMS");

        javax.swing.GroupLayout panelPaginationLayout = new javax.swing.GroupLayout(panelPagination);
        panelPagination.setLayout(panelPaginationLayout);
        panelPaginationLayout.setHorizontalGroup(
            panelPaginationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPaginationLayout.createSequentialGroup()
                .addComponent(labelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 349, Short.MAX_VALUE)
                .addGroup(panelPaginationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPaginationLayout.createSequentialGroup()
                        .addComponent(labelFontGreen2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelFontGreen3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelFontGreen4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelFontGreen5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelFontGreen6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelFontGreen7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelFontGreen1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmboxBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        panelPaginationLayout.setVerticalGroup(
            panelPaginationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPaginationLayout.createSequentialGroup()
                .addComponent(cmboxBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(panelPaginationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelFontGreen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFontGreen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFontGreen4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFontGreen5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFontGreen6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFontGreen7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFontGreen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(panelPaginationLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelPaginationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollItem, javax.swing.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE)
            .addComponent(panelPagination, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPagination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollItem, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.ComboBox cmboxBrand;
    private javax.swing.JPanel jPanel1;
    private Components.LabelFontGreen labelFontGreen1;
    private Components.LabelFontGreen labelFontGreen2;
    private Components.LabelFontGreen labelFontGreen3;
    private Components.LabelFontGreen labelFontGreen4;
    private Components.LabelFontGreen labelFontGreen5;
    private Components.LabelFontGreen labelFontGreen6;
    private Components.LabelFontGreen labelFontGreen7;
    private Components.LabelTitle labelTitle1;
    private Components.LabelTitle labelTitle2;
    private javax.swing.JPanel panelPagination;
    private javax.swing.JPanel panelProduct;
    private javax.swing.JScrollPane scrollItem;
    // End of variables declaration//GEN-END:variables
}
