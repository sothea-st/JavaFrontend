package Payment;

import Color.WindowColor;
import Components.BoxItem;
import Components.SubtotalPanel;
import Constant.JavaBaseUrl;
import Constant.JavaConnection;
import Constant.JavaConstant;
import Constant.JavaRoute;
import Event.ButtonEvent;
import Model.CustomerType.CustomerTypeModel;
import Model.CustomerType.SourceModel;
import Model.Sale.PaymentDetailModel;
import Model.Sale.ProductSaleModel;
import java.awt.Color;
import java.awt.Component;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

public class PaymentOption extends javax.swing.JDialog {

    private String totalUsd;
    DecimalFormat dm = new DecimalFormat("#,##0");
    DecimalFormat df = new DecimalFormat("$ #,##0.00");
    private String sign;
    private Component[] listCom;
    private SubtotalPanel subtotalPanel;

    public PaymentOption(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        panelPayment.setBackground(WindowColor.mediumGreen);
        panelTotal.setBackground(WindowColor.mediumGreen);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        addComboCustomerType();
        addComboSource();
        event();

        // txtCustomerId.requestFocusInWindow(); // unfocus all jtextField
    }

    //Action call function placeholder
    private void event() {
        ButtonEvent btnevent = new ButtonEvent() {
            @Override
            public void onFocusGain() {

            }
        };
        txtCustomerId.initEvent(btnevent);
        txtEarning.initEvent(btnevent);
        txtCustomerName.initEvent(btnevent);
        txtCustomerPhone.initEvent(btnevent);
        txtCustomerEmail.initEvent(btnevent);
    }

    //Set Combo box Customer Type
    private void addComboCustomerType() {
        HashMap<String, String> map = new HashMap<>();
        try {
            ArrayList<CustomerTypeModel> typeCustomer = new ArrayList<>();
            Response response = JavaConnection.get(JavaRoute.customerType);
            if (response.isSuccessful()) {
                String responseData = response.body().string();
                JSONObject jsonObject = new JSONObject(responseData);
                JSONArray data = jsonObject.getJSONArray("data");
                for (int i = 0; i < data.length(); i++) {
                    JSONObject obj = data.getJSONObject(i);
                    CustomerTypeModel customer = new CustomerTypeModel(
                            obj.getInt("id"),
                            obj.getString("name")
                    );
                    typeCustomer.add(customer);
                    int idType = typeCustomer.get(i).getCustomerTypeId();
                    String type = typeCustomer.get(i).getCustomerTypeName();
                    map.put("" + idType, type);
                }
                cmbCustomerType.setMap(map);

            } else {
                System.err.println("fail loading data");
            }
        } catch (Exception e) {
            System.err.println("error = " + e);
        }

        HashMap<String, String> coupon = new HashMap<>();
        coupon.put("", "--Select--");
        cmbCoupon.setMap(coupon);
    }

    //Set Combo box Source
    private void addComboSource() {
        HashMap<String, String> source = new HashMap<>();
        try {
            ArrayList<SourceModel> modelSource = new ArrayList<>();
            Response response = JavaConnection.get(JavaRoute.source);
            if (response.isSuccessful()) {
                String responseData = response.body().string();
                JSONObject jsonObject = new JSONObject(responseData);
                JSONArray data = jsonObject.getJSONArray("data");
                for (int i = 0; i < data.length(); i++) {
                    JSONObject obj = data.getJSONObject(i);
                    SourceModel sourceCombo = new SourceModel(
                            obj.getInt("id"),
                            obj.getString("name")
                    );
                    modelSource.add(sourceCombo);
                    int idSource = modelSource.get(i).getSourceId();
                    String sourceName = modelSource.get(i).getSourceName();
                    source.put("" + idSource, sourceName);
                }
                cmbSource.setMap(source);

            } else {
                System.err.println("fail loading data");
            }
        } catch (Exception e) {
            System.err.println("error = " + e);
        }

        HashMap<String, String> coupon = new HashMap<>();
        coupon.put("", "--Select--");
        cmbCoupon.setMap(coupon);
    }

    private void inputAmount(String value) {
        String receviUsd = txtReceiveUsd.getText();
        String receviKhr = txtReceiveKhr.getText();

        if (sign == "usd") {
            receviUsd += value;
            txtReceiveUsd.setText(receviUsd);

            String strTotalUsd = getTotalUsd().replace("$", "");
            strTotalUsd = strTotalUsd.replace(",", "");
            double doubleTotalUsd = Double.valueOf(strTotalUsd);

            if (!receviUsd.isEmpty()) {
                String stringReceiveUsd = receviUsd.replace(",", "");
                double doubleReceviceUsd = Double.valueOf(stringReceiveUsd);
                double result = doubleReceviceUsd - doubleTotalUsd;
                if (result < 0) {
                    setValueLabelUsd(result, 0);
                } else if (result > 0) {
                    setValueLabelUsd(0, result);
                } else if (result == 0) {
                    setValueLabelUsd(0, 0);
                }
            }
        } else if (sign == "khr") {
            receviKhr += value;
            txtReceiveKhr.setText(receviKhr);
            String strTotalKhr = lbTotalKhr.getLabelName();
            strTotalKhr = strTotalKhr.replace(",", "");
            double doubleTotalKhr = Double.valueOf(strTotalKhr);

            if (!receviKhr.isEmpty()) {
                String stringReceiveKhr = receviKhr.replace(",", "");
                double doubleReceviceKhr = Double.valueOf(stringReceiveKhr);

                double result = doubleReceviceKhr - doubleTotalKhr;
                if (result < 0) {
                    setValueLabelKhr(result, 0);
                } else if (result > 0) {
                    setValueLabelKhr(0, result);

                } else if (result == 0) {
                    setValueLabelKhr(0, 0);
                }
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPayment = new javax.swing.JPanel();
        cmbCoupon = new Components.ComboBox();
        cmbCustomerType = new Components.ComboBox();
        cmbSource = new Components.ComboBox();
        labelPopUpTitle1 = new Components.LabelPopUpTitle();
        lbCustomerId = new Components.Label();
        lbCustomerType = new Components.Label();
        lbSource = new Components.Label();
        lbEarning = new Components.Label();
        label1 = new Components.Label();
        lbCustomerPhone = new Components.Label();
        lbCustomerEmail = new Components.Label();
        lbGift = new Components.Label();
        lbGender = new Components.Label();
        radioButtonMale = new Components.RadioButton();
        radioButtonFemale = new Components.RadioButton();
        lbNationality = new Components.Label();
        radioButton1 = new Components.RadioButton();
        radioButton2 = new Components.RadioButton();
        radioButton3 = new Components.RadioButton();
        radioButton4 = new Components.RadioButton();
        radioButton5 = new Components.RadioButton();
        lbCash = new Components.LabelFontBlack();
        lbCreditCard = new Components.LabelFontBlack();
        lbCashPayment = new Components.LabelFontBlack();
        panelTotal = new javax.swing.JPanel();
        label5 = new Components.Label();
        label6 = new Components.Label();
        label7 = new Components.Label();
        label8 = new Components.Label();
        label2 = new Components.Label();
        label3 = new Components.Label();
        label4 = new Components.Label();
        label9 = new Components.Label();
        lbTotalUsd = new Components.Label();
        lbRemainingUsd = new Components.Label();
        lbChangeUsd = new Components.Label();
        label14 = new Components.Label();
        label15 = new Components.Label();
        label16 = new Components.Label();
        label17 = new Components.Label();
        lbTotalKhr = new Components.Label();
        lbRemainingKhr = new Components.Label();
        lbChangeKhr = new Components.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtReceiveUsd = new javax.swing.JTextField();
        txtReceiveKhr = new javax.swing.JTextField();
        lbOne = new Components.LabelFontBlack();
        lbTwo = new Components.LabelFontBlack();
        lbThree = new Components.LabelFontBlack();
        lbDelete = new Components.LabelFontBlack();
        lbFour = new Components.LabelFontBlack();
        lbFive = new Components.LabelFontBlack();
        lbSix = new Components.LabelFontBlack();
        lbDot = new Components.LabelFontBlack();
        lbSeven = new Components.LabelFontBlack();
        lbEight = new Components.LabelFontBlack();
        lbNine = new Components.LabelFontBlack();
        lbZero = new Components.LabelFontBlack();
        labelFontBlack2 = new Components.LabelFontBlack();
        labelFontBlack5 = new Components.LabelFontBlack();
        labelFontBlack9 = new Components.LabelFontBlack();
        txtCustomerId = new Components.TextFieldCenter();
        txtEarning = new Components.TextFieldCenter();
        txtCustomerName = new Components.TextFieldCenter();
        txtCustomerPhone = new Components.TextFieldCenter();
        txtCustomerEmail = new Components.TextFieldCenter();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelPopUpTitle1.setLabelTitle("Payment Option");

        lbCustomerId.setLabelName("Customer ID");

        lbCustomerType.setLabelName("Customer Type");

        lbSource.setLabelName("Source");

        lbEarning.setLabelName("Earning ($)");

        label1.setLabelName("Customer Name");

        lbCustomerPhone.setLabelName("Customer Phone");

        lbCustomerEmail.setLabelName("Customer Email");

        lbGift.setLabelName("Gift Coupon ($)");

        lbGender.setLabelName(" Gender");

        radioButtonMale.setRadioButton("Male");

        radioButtonFemale.setRadioButton("Female");

        lbNationality.setLabelName(" Nationality");

        radioButton1.setRadioButton("Asian");

        radioButton2.setRadioButton("Chinese");

        radioButton3.setRadioButton("Khmer");

        radioButton4.setRadioButton("White");

        radioButton5.setRadioButton("Black");

        lbCash.setBackground(new java.awt.Color(102, 153, 255));
        lbCash.setLabelName("Cash");

        lbCreditCard.setBackground(new java.awt.Color(102, 153, 255));
        lbCreditCard.setLabelName("Credit Card");

        lbCashPayment.setBackground(new java.awt.Color(0, 204, 255));
        lbCashPayment.setLabelName("Cash Payment");

        label5.setLabelName("Total Pay");

        label6.setLabelName("Receive");

        label7.setLabelName("Remaining");

        label8.setLabelName("Change");

        label2.setLabelName(":");

        label3.setLabelName(":");

        label4.setLabelName(":");

        label9.setLabelName(":");

        lbTotalUsd.setLabelName("$ 0.00");

        lbRemainingUsd.setLabelName("$ 0.00");

        lbChangeUsd.setLabelName("$ 0.00");

        label14.setLabelName(":");

        label15.setLabelName(":");

        label16.setLabelName(":");

        label17.setLabelName(":");

        lbTotalKhr.setLabelName("0");

        lbRemainingKhr.setLabelName("0");

        lbChangeKhr.setLabelName("0");

        jLabel1.setFont(new java.awt.Font("Khmer OS Content", 0, 12)); // NOI18N
        jLabel1.setText("៛");

        jLabel2.setFont(new java.awt.Font("Khmer OS Content", 0, 12)); // NOI18N
        jLabel2.setText("៛");

        jLabel3.setFont(new java.awt.Font("Khmer OS Content", 0, 12)); // NOI18N
        jLabel3.setText("៛");

        jLabel4.setFont(new java.awt.Font("Khmer OS Content", 0, 12)); // NOI18N
        jLabel4.setText("៛");

        txtReceiveUsd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtReceiveUsdMouseClicked(evt);
            }
        });
        txtReceiveUsd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtReceiveUsdKeyReleased(evt);
            }
        });

        txtReceiveKhr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtReceiveKhrMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtReceiveKhrMouseEntered(evt);
            }
        });
        txtReceiveKhr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtReceiveKhrKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelTotalLayout = new javax.swing.GroupLayout(panelTotal);
        panelTotal.setLayout(panelTotalLayout);
        panelTotalLayout.setHorizontalGroup(
            panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(label7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(label6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(label5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelTotalLayout.createSequentialGroup()
                            .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbChangeUsd, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(panelTotalLayout.createSequentialGroup()
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbRemainingUsd, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTotalLayout.createSequentialGroup()
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbTotalUsd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelTotalLayout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtReceiveUsd, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(1, 1, 1)
                .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTotalLayout.createSequentialGroup()
                        .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTotalLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbRemainingKhr, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelTotalLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbTotalKhr, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelTotalLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtReceiveKhr, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addGroup(panelTotalLayout.createSequentialGroup()
                        .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbChangeKhr, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        panelTotalLayout.setVerticalGroup(
            panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTotalUsd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTotalKhr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTotalLayout.createSequentialGroup()
                        .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1))
                    .addComponent(txtReceiveKhr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(txtReceiveUsd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelTotalLayout.createSequentialGroup()
                        .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbRemainingKhr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbRemainingUsd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbChangeUsd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTotalLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(lbChangeKhr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lbOne.setBackground(new java.awt.Color(255, 255, 255));
        lbOne.setLabelName("1");
        lbOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbOneMouseClicked(evt);
            }
        });

        lbTwo.setBackground(new java.awt.Color(255, 255, 255));
        lbTwo.setLabelName("2");
        lbTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTwoMouseClicked(evt);
            }
        });

        lbThree.setBackground(new java.awt.Color(255, 255, 255));
        lbThree.setLabelName("3");
        lbThree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThreeMouseClicked(evt);
            }
        });

        lbDelete.setBackground(new java.awt.Color(255, 255, 255));
        lbDelete.setLabelName("Del");
        lbDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDeleteMouseClicked(evt);
            }
        });

        lbFour.setBackground(new java.awt.Color(255, 255, 255));
        lbFour.setLabelName("4");
        lbFour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbFourMouseClicked(evt);
            }
        });

        lbFive.setBackground(new java.awt.Color(255, 255, 255));
        lbFive.setLabelName("5");
        lbFive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbFiveMouseClicked(evt);
            }
        });

        lbSix.setBackground(new java.awt.Color(255, 255, 255));
        lbSix.setLabelName("6");
        lbSix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSixMouseClicked(evt);
            }
        });

        lbDot.setBackground(new java.awt.Color(255, 255, 255));
        lbDot.setLabelName(".");
        lbDot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDotMouseClicked(evt);
            }
        });

        lbSeven.setBackground(new java.awt.Color(255, 255, 255));
        lbSeven.setLabelName("7");
        lbSeven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSevenMouseClicked(evt);
            }
        });

        lbEight.setBackground(new java.awt.Color(255, 255, 255));
        lbEight.setLabelName("8");
        lbEight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEightMouseClicked(evt);
            }
        });

        lbNine.setBackground(new java.awt.Color(255, 255, 255));
        lbNine.setLabelName("9");
        lbNine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNineMouseClicked(evt);
            }
        });

        lbZero.setBackground(new java.awt.Color(255, 255, 255));
        lbZero.setLabelName("0");
        lbZero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbZeroMouseClicked(evt);
            }
        });

        labelFontBlack2.setBackground(new java.awt.Color(204, 0, 0));
        labelFontBlack2.setLabelName("Back");
        labelFontBlack2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelFontBlack2MouseClicked(evt);
            }
        });

        labelFontBlack5.setBackground(new java.awt.Color(47, 152, 70));
        labelFontBlack5.setLabelName("Charge&eInvoice");

        labelFontBlack9.setBackground(new java.awt.Color(47, 152, 70));
        labelFontBlack9.setLabelName("Charge&Print");
        labelFontBlack9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelFontBlack9MouseClicked(evt);
            }
        });

        txtCustomerId.setLabelTextCenter("Scan or input");

        txtEarning.setLabelTextCenter("$ 0.00");

        txtCustomerName.setLabelTextCenter("No found");

        txtCustomerPhone.setLabelTextCenter("No found");

        txtCustomerEmail.setLabelTextCenter("No found");

        javax.swing.GroupLayout panelPaymentLayout = new javax.swing.GroupLayout(panelPayment);
        panelPayment.setLayout(panelPaymentLayout);
        panelPaymentLayout.setHorizontalGroup(
            panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPaymentLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPaymentLayout.createSequentialGroup()
                        .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCustomerId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbSource, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbCustomerType, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbEarning, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbCustomerType, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(cmbSource, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtEarning, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(19, 19, 19))
                    .addGroup(panelPaymentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButtonMale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButtonFemale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNationality, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPaymentLayout.createSequentialGroup()
                        .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPaymentLayout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCreditCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPaymentLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelFontBlack2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPaymentLayout.createSequentialGroup()
                                .addComponent(lbOne, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbThree, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPaymentLayout.createSequentialGroup()
                                .addComponent(lbFour, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbFive, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbSix, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbDot, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPaymentLayout.createSequentialGroup()
                                .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labelFontBlack5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panelPaymentLayout.createSequentialGroup()
                                        .addComponent(lbSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbEight, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelPaymentLayout.createSequentialGroup()
                                        .addComponent(lbNine, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbZero, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelFontBlack9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(panelPaymentLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelPaymentLayout.createSequentialGroup()
                                    .addComponent(lbCustomerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCustomerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelPaymentLayout.createSequentialGroup()
                                    .addComponent(lbCustomerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCustomerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelPaymentLayout.createSequentialGroup()
                                .addComponent(lbGift, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(cmbCoupon, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelPaymentLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(lbCashPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPaymentLayout.createSequentialGroup()
                .addGap(705, 705, 705)
                .addComponent(panelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelPaymentLayout.createSequentialGroup()
                .addComponent(labelPopUpTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelPaymentLayout.setVerticalGroup(
            panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPaymentLayout.createSequentialGroup()
                .addComponent(labelPopUpTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPaymentLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCustomerId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelPaymentLayout.createSequentialGroup()
                                .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panelPaymentLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbCashPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPaymentLayout.createSequentialGroup()
                        .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCustomerPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelPaymentLayout.createSequentialGroup()
                                .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbCustomerType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCustomerPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbCustomerType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSource, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelPaymentLayout.createSequentialGroup()
                                .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCustomerEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbCustomerEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCoupon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbGift, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbEarning, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEarning, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPaymentLayout.createSequentialGroup()
                        .addComponent(panelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)))
                .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPaymentLayout.createSequentialGroup()
                        .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(radioButtonMale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioButtonFemale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(panelPaymentLayout.createSequentialGroup()
                        .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbThree, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTwo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbOne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbCash, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbSix, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbFive, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbFour, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbCreditCard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbDot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbNine, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbEight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbSeven, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFontBlack2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFontBlack5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFontBlack9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPayment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelFontBlack2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelFontBlack2MouseClicked
        this.dispose();
    }//GEN-LAST:event_labelFontBlack2MouseClicked

    private void lbOneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOneMouseClicked
        String number = lbOne.getLabelName();
        inputAmount(number);
    }//GEN-LAST:event_lbOneMouseClicked

    private void lbTwoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTwoMouseClicked
        String number = lbTwo.getLabelName();
        inputAmount(number);
    }//GEN-LAST:event_lbTwoMouseClicked

    private void lbThreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThreeMouseClicked
        String number = lbThree.getLabelName();
        inputAmount(number);
    }//GEN-LAST:event_lbThreeMouseClicked

    private void lbFourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFourMouseClicked
        String number = lbFour.getLabelName();
        inputAmount(number);
    }//GEN-LAST:event_lbFourMouseClicked

    private void lbFiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFiveMouseClicked
        String number = lbFive.getLabelName();
        inputAmount(number);
    }//GEN-LAST:event_lbFiveMouseClicked

    private void lbSixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSixMouseClicked
        String number = lbSix.getLabelName();
        inputAmount(number);
    }//GEN-LAST:event_lbSixMouseClicked

    private void lbDotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDotMouseClicked
        String number = lbDot.getLabelName();
        inputAmount(number);
    }//GEN-LAST:event_lbDotMouseClicked

    private void lbSevenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSevenMouseClicked
        String number = lbSeven.getLabelName();
        inputAmount(number);
    }//GEN-LAST:event_lbSevenMouseClicked

    private void lbEightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEightMouseClicked
        String number = lbEight.getLabelName();
        inputAmount(number);
    }//GEN-LAST:event_lbEightMouseClicked

    private void lbNineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNineMouseClicked
        String number = lbNine.getLabelName();
        inputAmount(number);
    }//GEN-LAST:event_lbNineMouseClicked

    private void lbZeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbZeroMouseClicked
        String number = lbZero.getLabelName();
        inputAmount(number);
    }//GEN-LAST:event_lbZeroMouseClicked

    private void lbDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDeleteMouseClicked
        if (!txtReceiveUsd.getText().isEmpty()) {
            String valueReceive = txtReceiveUsd.getText();
            valueReceive = valueReceive.substring(0, valueReceive.length() - 1);
            txtReceiveUsd.setText("");
            if (valueReceive.isEmpty()) {
                setValueLabelUsd(0, 0);
            }
            inputAmount(valueReceive);
        }

        if (!txtReceiveKhr.getText().isEmpty()) {
            String valueReceive = txtReceiveKhr.getText();
            valueReceive = valueReceive.substring(0, valueReceive.length() - 1);
            txtReceiveKhr.setText("");
            if (valueReceive.isEmpty()) {
                setValueLabelKhr(0, 0);
            }
            inputAmount(valueReceive);
        }
    }//GEN-LAST:event_lbDeleteMouseClicked

    private void txtReceiveUsdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReceiveUsdMouseClicked
        sign = "usd";
    }//GEN-LAST:event_txtReceiveUsdMouseClicked

    private void txtReceiveKhrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReceiveKhrMouseEntered

    }//GEN-LAST:event_txtReceiveKhrMouseEntered

    private void txtReceiveKhrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReceiveKhrMouseClicked
        sign = "khr";
    }//GEN-LAST:event_txtReceiveKhrMouseClicked

    private void txtReceiveUsdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReceiveUsdKeyReleased
        if (txtReceiveUsd.getText().length() > 0) {
            double totalUsdValue = JavaConstant.getReplace(totalUsd);
            double rUsdValue = JavaConstant.getReplace(txtReceiveUsd.getText());
            double resultValueUsd = rUsdValue - totalUsdValue;
            if (resultValueUsd == 0) {
                setValueLabelUsd(resultValueUsd, resultValueUsd);
            } else if (resultValueUsd > 0) {
                setValueLabelUsd(0, resultValueUsd);
            } else if (resultValueUsd < 0) {
                setValueLabelUsd(resultValueUsd, 0);
            }
        } else {
            setValueLabelUsd(0, 0);
        }

    }//GEN-LAST:event_txtReceiveUsdKeyReleased

    private void txtReceiveKhrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReceiveKhrKeyReleased
        if (txtReceiveKhr.getText().length() > 0) {
            double totalKhrValue = JavaConstant.getReplace(lbTotalKhr.getLabelName());
            double rKhrValue = JavaConstant.getReplace(txtReceiveKhr.getText());
            double resultValueKhr = rKhrValue - totalKhrValue;
            if (resultValueKhr == 0) {
                setValueLabelKhr(resultValueKhr, resultValueKhr);
            } else if (resultValueKhr > 0) {
                setValueLabelKhr(0, resultValueKhr);
            } else if (resultValueKhr < 0) {
                setValueLabelKhr(resultValueKhr, 0);
            }
        } else {
            setValueLabelKhr(0, 0);
        }
    }//GEN-LAST:event_txtReceiveKhrKeyReleased

    private void labelFontBlack9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelFontBlack9MouseClicked

        double discount = JavaConstant.getReplace(subtotalPanel.getLableDiscountUsd());
//        double deliveryFee = JavaConstant.getReplace(subtotalPanel.getLableDeliveryUsd());
        double subTotal = JavaConstant.getReplace(subtotalPanel.getLabelSubtotalUsd());
        double total = JavaConstant.getReplace(subtotalPanel.getLableTotalUsd());

        JSONObject jsonData = new JSONObject();
        jsonData.put("userId", JavaConstant.cashierId);
        jsonData.put("saleDate", JavaConstant.currentDate);
        jsonData.put("discount", discount);
        jsonData.put("subTotal", subTotal);
        jsonData.put("deliveryFee", "0");
        jsonData.put("total", total);

        PaymentDetailModel p = new PaymentDetailModel(
                11,
                1,
                "mnk",
                0,
                5.66,
                0,
                0,
                0,
                0
        );

        HashMap<String, Object> dataPay = new HashMap<>();
        dataPay.put("sourceId", 1);
        dataPay.put("customerTypeId", 1);
        dataPay.put("paymentType", "mnk");
        dataPay.put("receiveKhr", 10);
        dataPay.put("receiveUsd", 0);
        dataPay.put("remainingUsd", 0);
        dataPay.put("remainingKhr", 0);
        dataPay.put("changeUsd", 0);
        dataPay.put("changeKhr", 0);
        jsonData.put("dataPay", dataPay);

        ArrayList<ProductSaleModel> dataSale = new ArrayList<>();
        for (int i = 0; i < listCom.length; i++) {
            var obj = ((BoxItem) listCom[i]);
            double price = JavaConstant.getReplace(obj.getLabelPrice());
            double amount = JavaConstant.getReplace(obj.getLabelAmountUsd());
            double discountAmount = JavaConstant.getReplace(obj.getDiscountAmount());
            ProductSaleModel pro = new ProductSaleModel(
                    obj.getProductId(),
                    obj.getQty(),
                    price,
                    amount,
                    discountAmount
            );
            dataSale.add(pro);
        }
        jsonData.put("dataSale", dataSale);

        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(
                JavaConstant.JSON,
                jsonData.toString());
        Request request = new Request.Builder()
                .url(new JavaBaseUrl().getBaseUrl() + JavaRoute.sale)
                .header("Authorization", "Bearer " + JavaConstant.token)
                .post(body).build();
     
        try {
            Response response =   client.newCall(request).execute();
            String stringData = response.body().string();
            System.err.println("string = " + stringData);
        } catch (Exception e) {
            System.err.println("getting error during call request " + e);
        }

    }//GEN-LAST:event_labelFontBlack9MouseClicked

    private void setValueLabelUsd(double remaining, double change) {
        lbRemainingUsd.setLabelName(df.format(remaining));
        lbChangeUsd.setLabelName(df.format(change));
    }

    private void setValueLabelKhr(double remaining, double change) {
        lbRemainingKhr.setLabelName(df.format(remaining));
        lbChangeKhr.setLabelName(df.format(change));
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PaymentOption dialog = new PaymentOption(new javax.swing.JFrame(), true);
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

    public String getTotalUsd() {
        return totalUsd;
    }

    public void setTotalUsd(String totalUsd) {
        this.totalUsd = totalUsd;
        lbTotalUsd.setLabelName(totalUsd);
        String moneyUsd = totalUsd.replace("$", "");
        moneyUsd = moneyUsd.replace(",", "");
        double totalKhr = Double.valueOf(moneyUsd);
        lbTotalKhr.setLabelName(dm.format(totalKhr * 4200));
    }

    public Component[] getListCom() {
        return listCom;
    }

    public void setListCom(Component[] listCom) {
        this.listCom = listCom;
    }

    public SubtotalPanel getSubtotalPanel() {
        return subtotalPanel;
    }

    public void setSubtotalPanel(SubtotalPanel subtotalPanel) {
        this.subtotalPanel = subtotalPanel;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.ComboBox cmbCoupon;
    private Components.ComboBox cmbCustomerType;
    private Components.ComboBox cmbSource;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private Components.Label label1;
    private Components.Label label14;
    private Components.Label label15;
    private Components.Label label16;
    private Components.Label label17;
    private Components.Label label2;
    private Components.Label label3;
    private Components.Label label4;
    private Components.Label label5;
    private Components.Label label6;
    private Components.Label label7;
    private Components.Label label8;
    private Components.Label label9;
    private Components.LabelFontBlack labelFontBlack2;
    private Components.LabelFontBlack labelFontBlack5;
    private Components.LabelFontBlack labelFontBlack9;
    private Components.LabelPopUpTitle labelPopUpTitle1;
    private Components.LabelFontBlack lbCash;
    private Components.LabelFontBlack lbCashPayment;
    private Components.Label lbChangeKhr;
    private Components.Label lbChangeUsd;
    private Components.LabelFontBlack lbCreditCard;
    private Components.Label lbCustomerEmail;
    private Components.Label lbCustomerId;
    private Components.Label lbCustomerPhone;
    private Components.Label lbCustomerType;
    private Components.LabelFontBlack lbDelete;
    private Components.LabelFontBlack lbDot;
    private Components.Label lbEarning;
    private Components.LabelFontBlack lbEight;
    private Components.LabelFontBlack lbFive;
    private Components.LabelFontBlack lbFour;
    private Components.Label lbGender;
    private Components.Label lbGift;
    private Components.Label lbNationality;
    private Components.LabelFontBlack lbNine;
    private Components.LabelFontBlack lbOne;
    private Components.Label lbRemainingKhr;
    private Components.Label lbRemainingUsd;
    private Components.LabelFontBlack lbSeven;
    private Components.LabelFontBlack lbSix;
    private Components.Label lbSource;
    private Components.LabelFontBlack lbThree;
    private Components.Label lbTotalKhr;
    private Components.Label lbTotalUsd;
    private Components.LabelFontBlack lbTwo;
    private Components.LabelFontBlack lbZero;
    private javax.swing.JPanel panelPayment;
    private javax.swing.JPanel panelTotal;
    private Components.RadioButton radioButton1;
    private Components.RadioButton radioButton2;
    private Components.RadioButton radioButton3;
    private Components.RadioButton radioButton4;
    private Components.RadioButton radioButton5;
    private Components.RadioButton radioButtonFemale;
    private Components.RadioButton radioButtonMale;
    private Components.TextFieldCenter txtCustomerEmail;
    private Components.TextFieldCenter txtCustomerId;
    private Components.TextFieldCenter txtCustomerName;
    private Components.TextFieldCenter txtCustomerPhone;
    private Components.TextFieldCenter txtEarning;
    private javax.swing.JTextField txtReceiveKhr;
    private javax.swing.JTextField txtReceiveUsd;
    // End of variables declaration//GEN-END:variables
}
