package DeleteAndCancel;

import Color.WindowColor;
import Components.BoxItem;
import Components.JavaAlertMessage;
import Components.SubtotalPanel;
import Constant.JavaConnection;
import Constant.JavaConstant;
import Constant.JavaRoute;
import Event.ButtonEvent;
import Model.Package.ReasonModel;
import Model.PackageProduct.ProductIDModel;
import java.awt.Component;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

public class DeleteDialog extends javax.swing.JDialog {

    // declar variable
    private JPanel detailItem;
    private Component[] listCom;
    private int productId;
    private SubtotalPanel subtotalPanel;
    DecimalFormat dm = new DecimalFormat("$#,##0.00");
    DecimalFormat kh = new DecimalFormat("#,##0");
    private String reasonId;

    public DeleteDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        panelDelete.setBackground(WindowColor.mediumGreen);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        addComboReason();

        // action get select reason type
        ButtonEvent event = new ButtonEvent() {
            @Override
            public void onSelect(String key) {
                reasonId = key;
                System.err.println("key = " + key);
            }
        };
        comboBoxReason.initEvent(event);
    }

    private void addComboReason() {
        HashMap<String, String> map = new HashMap<>();
        try {
            ArrayList<ReasonModel> reason = new ArrayList<>();
            Response response = JavaConnection.get(JavaRoute.reason + "cancel");

            if (response.isSuccessful()) {
                String responseData = response.body().string();
                JSONObject jsonObject = new JSONObject(responseData);
                JSONArray data = jsonObject.getJSONArray("data");
                for (int i = 0; i < data.length(); i++) {
                    JSONObject obj = data.getJSONObject(i);
                    ReasonModel modelReason = new ReasonModel(
                            obj.getInt("id"),
                            obj.getString("reason")
                    );
                    reason.add(modelReason);
                    int idReason = reason.get(i).getIdReason();
                    String reasonName = reason.get(i).getReason();
                    map.put(reasonName, "" + idReason);
                }
                comboBoxReason.setMap(map);

            } else {
                System.err.println("fail loading data");
            }
        } catch (Exception e) {
            System.err.println("error = " + e);
        }
    }

    void deleteItem() {
        double sumSubTotalUsd = 0;
        double sumDiscount = 0;
        for (int i = 0; i < listCom.length; i++) {
            var d = (BoxItem) listCom[i];
            if (productId == d.getProductId()) {
                detailItem.remove(i);
                detailItem.revalidate();
                detailItem.repaint();
            } else {
                var data = (BoxItem) listCom[i];
                String priceStr = data.getLabelPrice();
                priceStr = priceStr.replace("$", "");
                priceStr = priceStr.replace(",", "");
                double price = Double.valueOf(priceStr);
                int qty = data.getQty();
                double amount = price * qty;
                sumSubTotalUsd += amount;

                String discount = data.getDiscountAmount();
                discount = discount.replace("$", "");
                discount = discount.replace(",", "");
                double discountValue = Double.valueOf(discount) * qty;
                sumDiscount += Double.valueOf(discountValue);
            }
        }

        subtotalPanel.setLabelSubtotalUsd(dm.format(sumSubTotalUsd));
        subtotalPanel.setLabelSubtotalKhr(kh.format(sumSubTotalUsd * JavaConstant.exchangeRate));

        subtotalPanel.setLableDiscountUsd(dm.format(sumDiscount));
        subtotalPanel.setLableDiscountKhr(kh.format(sumDiscount * JavaConstant.exchangeRate));

        // total
        double total = sumSubTotalUsd - sumDiscount;
        subtotalPanel.setLableTotalUsd(dm.format(total));
        subtotalPanel.setLableTotalKhr(kh.format(total * JavaConstant.exchangeRate));

        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDelete = new javax.swing.JPanel();
        labelPopUpTitle2 = new Components.LabelPopUpTitle();
        lbReason1 = new Components.Label();
        comboBoxReason = new Components.ComboBox();
        buttonCancel1 = new ButtonPackage.ButtonCancel();
        buttonSave1 = new ButtonPackage.ButtonSave();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelDelete.setPreferredSize(new java.awt.Dimension(379, 155));

        labelPopUpTitle2.setLabelTitle("Delete");

        lbReason1.setLabelName("Reason");

        comboBoxReason.setPreferredSize(new java.awt.Dimension(2, 28));

        buttonCancel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCancel1MouseClicked(evt);
            }
        });

        buttonSave1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSave1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelDeleteLayout = new javax.swing.GroupLayout(panelDelete);
        panelDelete.setLayout(panelDeleteLayout);
        panelDeleteLayout.setHorizontalGroup(
            panelDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPopUpTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeleteLayout.createSequentialGroup()
                .addGroup(panelDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDeleteLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lbReason1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxReason, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelDeleteLayout.createSequentialGroup()
                        .addContainerGap(201, Short.MAX_VALUE)
                        .addComponent(buttonCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        panelDeleteLayout.setVerticalGroup(
            panelDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeleteLayout.createSequentialGroup()
                .addComponent(labelPopUpTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(panelDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboBoxReason, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbReason1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSave1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_buttonCancel1MouseClicked

    private void buttonSave1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSave1MouseClicked
        
        if( reasonId == null) {
            JavaAlertMessage j = new JavaAlertMessage(new JFrame(), true);
            j.setMessage("Pleas select reason!");
            j.setVisible(true);
            return;
        }
        
        try {
            JSONObject json = new JSONObject();
            json.put("createBy", JavaConstant.cashierId);
            json.put("reasonId", 1);
            ArrayList<ProductIDModel> listCancelDetail = new ArrayList<>();
            listCancelDetail.add(new ProductIDModel(productId));
            json.put("listCancelDetail", listCancelDetail);

            Response response = JavaConnection.post(JavaRoute.cancelAndDelete + "delete", json);
            System.err.println("response " + response);
            if (response.isSuccessful()) {
                dispose();
                deleteItem();
            }
        } catch (Exception e) {
        }
     
    }//GEN-LAST:event_buttonSave1MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DeleteDialog dialog = new DeleteDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public JPanel getDetailItem() {
        return detailItem;
    }

    public void setDetailItem(JPanel detailItem) {
        this.detailItem = detailItem;
    }

    public Component[] getListCom() {
        return listCom;
    }

    public void setListCom(Component[] listCom) {
        this.listCom = listCom;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public SubtotalPanel getSubtotalPanel() {
        return subtotalPanel;
    }

    public void setSubtotalPanel(SubtotalPanel subtotalPanel) {
        this.subtotalPanel = subtotalPanel;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ButtonPackage.ButtonCancel buttonCancel1;
    private ButtonPackage.ButtonSave buttonSave1;
    private Components.ComboBox comboBoxReason;
    private Components.LabelPopUpTitle labelPopUpTitle2;
    private Components.Label lbReason1;
    private javax.swing.JPanel panelDelete;
    // End of variables declaration//GEN-END:variables
}
