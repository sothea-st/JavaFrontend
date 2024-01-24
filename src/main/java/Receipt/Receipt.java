package Receipt;

import Components.ReceiptBox;
import Constant.JavaConnection;
import Constant.JavaConstant;
import Constant.JavaRoute;
import Controller.ReceiptController;
import Model.Reprint.DataSuccessModel;
import Model.Reprint.ReprintModel;
import Model.Reprint.SaleDetailModel;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.DecimalFormat;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import okhttp3.Response;

/**
 *
 * @author FRONT-END.06
 */
public class Receipt extends javax.swing.JDialog {

     private DataSuccessModel dataSuccess;

     DecimalFormat dm = new DecimalFormat("$#,##0.00");
     DecimalFormat kh = new DecimalFormat("#,##0");  

     public Receipt(java.awt.Frame parent, boolean modal) {
          super(parent, modal);
          initComponents();
          jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
          setDefaultCloseOperation(DISPOSE_ON_CLOSE);
          setResizable(false);

     }

     public void printComponenet(Component component) {
          PrinterJob pj = PrinterJob.getPrinterJob();
          pj.setJobName(" Print Component ");

          pj.setPrintable(new Printable() {
               public int print(Graphics pg, PageFormat pf, int pageNum) {
                    if (pageNum > 0) {
                         return Printable.NO_SUCH_PAGE;
                    }

                    Graphics2D g2 = (Graphics2D) pg;
                    g2.translate(pf.getImageableX(), pf.getImageableY());
                    component.paint(g2);
                    return Printable.PAGE_EXISTS;
               }
          });
          if (pj.printDialog() == false) {
               return;
          }

          try {
               pj.print();
          } catch (PrinterException ex) {
               // handle exception
          }
     }

     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jScrollPane1 = new javax.swing.JScrollPane();
          print = new javax.swing.JPanel();
          logo = new javax.swing.JLabel();
          companyname = new javax.swing.JLabel();
          jPanel3 = new javax.swing.JPanel();
          jLabel4 = new javax.swing.JLabel();
          vattin = new javax.swing.JLabel();
          address = new javax.swing.JLabel();
          addressLabel = new javax.swing.JLabel();
          jSeparator1 = new javax.swing.JSeparator();
          jPanel4 = new javax.swing.JPanel();
          jLabel8 = new javax.swing.JLabel();
          cusName = new javax.swing.JLabel();
          jLabel10 = new javax.swing.JLabel();
          jLabel11 = new javax.swing.JLabel();
          jLabel12 = new javax.swing.JLabel();
          invoiceNo = new javax.swing.JLabel();
          jLabel14 = new javax.swing.JLabel();
          contact = new javax.swing.JLabel();
          jLabel16 = new javax.swing.JLabel();
          saleDate = new javax.swing.JLabel();
          jLabel18 = new javax.swing.JLabel();
          cashierName = new javax.swing.JLabel();
          jLabel20 = new javax.swing.JLabel();
          jLabel46 = new javax.swing.JLabel();
          jSeparator2 = new javax.swing.JSeparator();
          jPanel7 = new javax.swing.JPanel();
          jLabel21 = new javax.swing.JLabel();
          jLabel25 = new javax.swing.JLabel();
          jLabel22 = new javax.swing.JLabel();
          jLabel26 = new javax.swing.JLabel();
          jLabel23 = new javax.swing.JLabel();
          jLabel27 = new javax.swing.JLabel();
          jLabel24 = new javax.swing.JLabel();
          jLabel28 = new javax.swing.JLabel();
          jSeparator3 = new javax.swing.JSeparator();
          jSeparator4 = new javax.swing.JSeparator();
          jLabel35 = new javax.swing.JLabel();
          jLabel36 = new javax.swing.JLabel();
          jLabel37 = new javax.swing.JLabel();
          jLabel38 = new javax.swing.JLabel();
          jLabel45 = new javax.swing.JLabel();
          jPanel1 = new javax.swing.JPanel();
          jLabel30 = new javax.swing.JLabel();
          jLabel2 = new javax.swing.JLabel();
          jLabel29 = new javax.swing.JLabel();
          jLabel31 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          jLabel32 = new javax.swing.JLabel();
          jLabel39 = new javax.swing.JLabel();
          totalprice = new javax.swing.JLabel();
          totalKhr = new javax.swing.JLabel();
          jLabel33 = new javax.swing.JLabel();
          jLabel43 = new javax.swing.JLabel();
          receiveUsd = new javax.swing.JLabel();
          receiveKhr = new javax.swing.JLabel();
          jLabel34 = new javax.swing.JLabel();
          jLabel44 = new javax.swing.JLabel();
          changeUsd = new javax.swing.JLabel();
          jLabel49 = new javax.swing.JLabel();
          jLabel63 = new javax.swing.JLabel();
          jLabel64 = new javax.swing.JLabel();
          jLabel65 = new javax.swing.JLabel();
          countProduct = new javax.swing.JPanel();
          btnPrint = new Button.Button();
          btnBack = new Button.Button();

          setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

          jScrollPane1.setBorder(null);

          print.setBackground(new java.awt.Color(255, 255, 255));
          print.setForeground(new java.awt.Color(255, 255, 255));

          logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

          companyname.setFont(new java.awt.Font("Khmer OS Muol", 1, 14)); // NOI18N
          companyname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          companyname.setText("រេដ​ អាន អិចប្រេស ឯ.ក");

          jPanel3.setBackground(new java.awt.Color(255, 255, 255));

          jLabel4.setFont(new java.awt.Font("Khmer OS Content", 0, 12)); // NOI18N
          jLabel4.setText("លេខអត្តសញ្ញាណសារពើពន្ធ​(VATTIN)៖");

          vattin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
          vattin.setText("038545848965886");

          address.setFont(new java.awt.Font("Khmer OS Content", 0, 12)); // NOI18N
          address.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
          address.setText("ផ្ទះលេខ១៣៩១២ ផ្លូវ ៥៩៨ ភូមិខ១ សង្កាត់ច្រាំងចំរេះទី២");
          address.setVerticalAlignment(javax.swing.SwingConstants.TOP);

          addressLabel.setFont(new java.awt.Font("Khmer OS Content", 0, 12)); // NOI18N
          addressLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          addressLabel.setText("អាសយដ្ឋាន៖");

          javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
          jPanel3.setLayout(jPanel3Layout);
          jPanel3Layout.setHorizontalGroup(
               jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                              .addGap(0, 0, Short.MAX_VALUE)
                              .addComponent(jLabel4)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(vattin, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addContainerGap())
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                              .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
          );
          jPanel3Layout.setVerticalGroup(
               jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(vattin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(addressLabel)
                         .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
          );

          jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

          jPanel4.setBackground(new java.awt.Color(255, 255, 255));

          jLabel8.setFont(new java.awt.Font("Khmer OS Content", 0, 12)); // NOI18N
          jLabel8.setText("ឈ្មោះអតិថិជន ៖");

          cusName.setFont(new java.awt.Font("Khmer OS Content", 0, 12)); // NOI18N
          cusName.setText("អតិថិជនទូរទៅ");

          jLabel10.setFont(new java.awt.Font("Khmer OS Content", 0, 12)); // NOI18N
          jLabel10.setText("សាខាហាង ៖");

          jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
          jLabel11.setText("Red Ant");

          jLabel12.setFont(new java.awt.Font("Khmer OS Content", 0, 12)); // NOI18N
          jLabel12.setText("លេខវិក្ក័យប័ត្រ ៖");

          invoiceNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
          invoiceNo.setText("000000243");

          jLabel14.setFont(new java.awt.Font("Khmer OS Content", 0, 12)); // NOI18N
          jLabel14.setText("លេខទូរសព្ឌ ៖");

          contact.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
          contact.setText("093 999 699");

          jLabel16.setFont(new java.awt.Font("Khmer OS Content", 0, 12)); // NOI18N
          jLabel16.setText("កាលបរិច្ឆេទ ៖");

          saleDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
          saleDate.setText("22-12-2023 9:24");

          jLabel18.setFont(new java.awt.Font("Khmer OS Content", 0, 12)); // NOI18N
          jLabel18.setText("អ្នកគិតលុយ ៖");

          cashierName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
          cashierName.setText("RAE-0004");

          jLabel20.setFont(new java.awt.Font("Khmer OS Muol", 1, 14)); // NOI18N
          jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
          jLabel20.setText("វិក្កយបត្រ");

          jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
          jLabel46.setText(" /  Invoice");

          javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
          jPanel4.setLayout(jPanel4Layout);
          jPanel4Layout.setHorizontalGroup(
               jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(jPanel4Layout.createSequentialGroup()
                              .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                         .addGroup(jPanel4Layout.createSequentialGroup()
                              .addComponent(jLabel12)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                              .addComponent(invoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addGroup(jPanel4Layout.createSequentialGroup()
                                                  .addGap(0, 0, Short.MAX_VALUE)
                                                  .addComponent(jLabel10))
                                             .addGroup(jPanel4Layout.createSequentialGroup()
                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                                  .addComponent(jLabel14)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(jLabel11))
                                        .addGap(12, 12, 12))
                                   .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addGroup(jPanel4Layout.createSequentialGroup()
                                                  .addGap(103, 103, 103)
                                                  .addComponent(cashierName))
                                             .addGroup(jPanel4Layout.createSequentialGroup()
                                                  .addGap(22, 22, 22)
                                                  .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                         .addGroup(jPanel4Layout.createSequentialGroup()
                              .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                   .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(cusName)
                                             .addGroup(jPanel4Layout.createSequentialGroup()
                                                  .addGap(20, 20, 20)
                                                  .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                  .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                   .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(saleDate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(89, 89, 89)))
                              .addGap(0, 0, Short.MAX_VALUE))))
          );
          jPanel4Layout.setVerticalGroup(
               jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel20)
                         .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel8)
                         .addComponent(cusName)
                         .addComponent(jLabel10)
                         .addComponent(jLabel11))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel12)
                         .addComponent(invoiceNo)
                         .addComponent(jLabel14)
                         .addComponent(contact))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel16)
                         .addComponent(saleDate)
                         .addComponent(jLabel18)
                         .addComponent(cashierName))
                    .addContainerGap(12, Short.MAX_VALUE))
          );

          jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

          jPanel7.setBackground(new java.awt.Color(255, 255, 255));

          jLabel21.setFont(new java.awt.Font("Khmer OS Content", 1, 12)); // NOI18N
          jLabel21.setText("ឈ្មោះទំនិញ");

          jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
          jLabel25.setText("Item Name");

          jLabel22.setFont(new java.awt.Font("Khmer OS Content", 1, 12)); // NOI18N
          jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel22.setText("បរិមាណ");

          jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
          jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel26.setText("Quantity");

          jLabel23.setFont(new java.awt.Font("Khmer OS Content", 1, 12)); // NOI18N
          jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel23.setText("ថ្លៃឯកតា");

          jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
          jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel27.setText("Price");

          jLabel24.setFont(new java.awt.Font("Khmer OS Content", 1, 12)); // NOI18N
          jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel24.setText("ថ្លៃទំនិញ");

          jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
          jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel28.setText("Net Price");

          javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
          jPanel7.setLayout(jPanel7Layout);
          jPanel7Layout.setHorizontalGroup(
               jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                         .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                         .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                         .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          );
          jPanel7Layout.setVerticalGroup(
               jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel21)
                         .addComponent(jLabel22)
                         .addComponent(jLabel23)
                         .addComponent(jLabel24))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel25)
                         .addComponent(jLabel26)
                         .addComponent(jLabel27)
                         .addComponent(jLabel28))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          );

          jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

          jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

          jLabel35.setFont(new java.awt.Font("Khmer OS Content", 0, 12)); // NOI18N
          jLabel35.setText("អត្រាប្តូរប្រាក់ ");

          jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
          jLabel36.setText("1 USD = 4200");

          jLabel37.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
          jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel37.setText("Thank you for choosing \"RED ANT Express\" !!");

          jLabel38.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
          jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel38.setText("Receipt required for exchange or return items");

          jLabel45.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
          jLabel45.setText("/  Exchange Rate :");

          jPanel1.setBackground(new java.awt.Color(255, 255, 255));

          jLabel30.setFont(new java.awt.Font("Khmer OS Content", 0, 12)); // NOI18N
          jLabel30.setText("សេវាដឹក ");

          jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
          jLabel2.setText("/  Delivery Fee :");

          jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
          jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
          jLabel29.setText("$-");

          jLabel31.setFont(new java.awt.Font("Khmer OS Content", 0, 12)); // NOI18N
          jLabel31.setText("សរុប(រួមអាករ) ");

          jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
          jLabel3.setText("/  Total (All Tax Included)-USD :");

          jLabel32.setFont(new java.awt.Font("Khmer OS Content", 0, 12)); // NOI18N
          jLabel32.setText("សរុប(រួមអាករ) ");

          jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
          jLabel39.setText("/  Total (All Tax Included)-Riel :");

          totalprice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
          totalprice.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
          totalprice.setText("$ 5.55");

          totalKhr.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
          totalKhr.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
          totalKhr.setText("23,310");

          jLabel33.setFont(new java.awt.Font("Khmer OS Content", 0, 12)); // NOI18N
          jLabel33.setText("ប្រាក់ទទួល");

          jLabel43.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
          jLabel43.setText(" /  Received :");

          receiveUsd.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
          receiveUsd.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
          receiveUsd.setText("$-");

          receiveKhr.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
          receiveKhr.setText("៛-");

          jLabel34.setFont(new java.awt.Font("Khmer OS Content", 0, 12)); // NOI18N
          jLabel34.setText("ប្រាក់អាប់ ");

          jLabel44.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
          jLabel44.setText("/  Change :");

          changeUsd.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
          changeUsd.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
          changeUsd.setText("$-");

          jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
          jLabel49.setText("៛-");

          jLabel63.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
          jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
          jLabel63.setText("៛ ");

          jLabel64.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
          jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
          jLabel64.setText("៛ ");

          jLabel65.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
          jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
          jLabel65.setText("៛ ");

          javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
          jPanel1.setLayout(jPanel1Layout);
          jPanel1Layout.setHorizontalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(jPanel1Layout.createSequentialGroup()
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                   .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)))
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                   .addComponent(totalprice, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                   .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                         .addGroup(jPanel1Layout.createSequentialGroup()
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                             .addComponent(jLabel34)
                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                             .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                             .addComponent(changeUsd, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                             .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                             .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                             .addComponent(receiveUsd, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(totalKhr, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                             .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                             .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                             .addComponent(receiveKhr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGap(23, 23, 23))
          );
          jPanel1Layout.setVerticalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel30)
                         .addComponent(jLabel2)
                         .addComponent(jLabel29))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel31)
                         .addComponent(jLabel3)
                         .addComponent(totalprice))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel32)
                         .addComponent(jLabel39)
                         .addComponent(totalKhr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(receiveUsd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jLabel43)
                              .addComponent(receiveKhr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(jPanel1Layout.createSequentialGroup()
                              .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGap(19, 19, 19))
                         .addGroup(jPanel1Layout.createSequentialGroup()
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                   .addComponent(jLabel44)
                                   .addComponent(changeUsd, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                   .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                              .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
          );

          countProduct.setBackground(new java.awt.Color(255, 255, 255));

          javax.swing.GroupLayout countProductLayout = new javax.swing.GroupLayout(countProduct);
          countProduct.setLayout(countProductLayout);
          countProductLayout.setHorizontalGroup(
               countProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGap(0, 0, Short.MAX_VALUE)
          );
          countProductLayout.setVerticalGroup(
               countProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGap(0, 64, Short.MAX_VALUE)
          );

          btnPrint.setBackground(new java.awt.Color(47, 155, 70));
          btnPrint.setButtonName("Print");
          btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnPrintMouseClicked(evt);
               }
          });

          btnBack.setButtonName("Back");
          btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnBackMouseClicked(evt);
               }
          });

          javax.swing.GroupLayout printLayout = new javax.swing.GroupLayout(print);
          print.setLayout(printLayout);
          printLayout.setHorizontalGroup(
               printLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(printLayout.createSequentialGroup()
                    .addGroup(printLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(printLayout.createSequentialGroup()
                              .addGap(152, 152, 152)
                              .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addGroup(printLayout.createSequentialGroup()
                              .addGap(121, 121, 121)
                              .addComponent(companyname, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE))
               .addGroup(printLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(printLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, printLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(printLayout.createSequentialGroup()
                                   .addGap(47, 47, 47)
                                   .addGroup(printLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)))
                              .addGroup(printLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                   .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                   .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                   .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                              .addGroup(printLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                   .addGroup(printLayout.createSequentialGroup()
                                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addGroup(printLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(printLayout.createSequentialGroup()
                                             .addGap(12, 12, 12)
                                             .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(printLayout.createSequentialGroup()
                                             .addGap(79, 79, 79)
                                             .addComponent(jLabel35)
                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                             .addComponent(jLabel45))
                                        .addComponent(jSeparator4))))
                         .addComponent(countProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(30, 30, 30))
          );
          printLayout.setVerticalGroup(
               printLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, printLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(companyname)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(3, 3, 3)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(countProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(printLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel35)
                         .addComponent(jLabel36)
                         .addComponent(jLabel45))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel37)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel38)
                    .addGap(21, 21, 21)
                    .addGroup(printLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(19, 19, 19))
          );

          jScrollPane1.setViewportView(print);

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
          );

          pack();
          setLocationRelativeTo(null);
     }// </editor-fold>//GEN-END:initComponents

    private void btnPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseClicked
         printComponenet(print);
    }//GEN-LAST:event_btnPrintMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
         this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

     public static void main(String args[]) {
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    Receipt dialog = new Receipt(new javax.swing.JFrame(), true);
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

     public DataSuccessModel getDataSuccess() {
          return dataSuccess;
     }

     public void setDataSuccess(DataSuccessModel dataSuccess) {
          this.dataSuccess = dataSuccess;
          assignValue(dataSuccess);

     }

     private void assignValue(DataSuccessModel dataSuccess) {
          var data = dataSuccess.getData();
          try {
               Response response = JavaConnection.get(JavaRoute.readImage + data.getCompanyLogo());
               byte[] images = response.body().bytes();
               logo.setIcon(new ImageIcon(images));
               companyname.setText(data.getCompanyName());
               address.setText("<html>" + data.getCompanyAddres() + "</html>");
               vattin.setText(data.getVattin());
               cusName.setText(data.getCustomerType());
               invoiceNo.setText(data.getPaymentNo());
               contact.setText(data.getCompanyContact());
               saleDate.setText(data.getSaleDate());
               cashierName.setText(data.getEmpName());
               displayProduct(data);
               totalprice.setText(dm.format(data.getTotal()));
               totalKhr.setText(kh.format(data.getTotal() * JavaConstant.exchangeRate));
               receiveUsd.setText(dm.format(data.getReceiveUsd()));
               receiveKhr.setText(kh.format(data.getReceiveUsd()*JavaConstant.exchangeRate));
               changeUsd.setText(dm.format(data.getChangeUsd()));
               jLabel49.setText(kh.format(data.getChangeUsd()* JavaConstant.exchangeRate));

          } catch (Exception e) {
               System.err.println("getting error at " + e);
          }

     }

     private void displayProduct(ReprintModel data) {
          SaleDetailModel[] listSale = data.getSaleDetails();

          for (int i = 0; i < listSale.length; i++) {
               var list = listSale[i];
               ReceiptBox re = new ReceiptBox();
               re.setProductName(list.getProNameEn());
               re.setBarcodeStr(list.getBarcode());
               re.setQtyStr("" + list.getQty());
               re.setUnitPriceStr(dm.format(list.getPrice()));
               double amount = list.getQty() * list.getPrice();
               re.setAmountStr(dm.format(amount));
               countProduct.add(re);
               countProduct.add(Box.createRigidArea(new Dimension(2, 2)));
          }

          countProduct.setLayout(new BoxLayout(countProduct, BoxLayout.Y_AXIS));
          countProduct.setBorder(new EmptyBorder(2, 2, 2, 2));
     }


     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JLabel address;
     private javax.swing.JLabel addressLabel;
     private Button.Button btnBack;
     private Button.Button btnPrint;
     private javax.swing.JLabel cashierName;
     private javax.swing.JLabel changeUsd;
     private javax.swing.JLabel companyname;
     private javax.swing.JLabel contact;
     private javax.swing.JPanel countProduct;
     private javax.swing.JLabel cusName;
     private javax.swing.JLabel invoiceNo;
     private javax.swing.JLabel jLabel10;
     private javax.swing.JLabel jLabel11;
     private javax.swing.JLabel jLabel12;
     private javax.swing.JLabel jLabel14;
     private javax.swing.JLabel jLabel16;
     private javax.swing.JLabel jLabel18;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel20;
     private javax.swing.JLabel jLabel21;
     private javax.swing.JLabel jLabel22;
     private javax.swing.JLabel jLabel23;
     private javax.swing.JLabel jLabel24;
     private javax.swing.JLabel jLabel25;
     private javax.swing.JLabel jLabel26;
     private javax.swing.JLabel jLabel27;
     private javax.swing.JLabel jLabel28;
     private javax.swing.JLabel jLabel29;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel30;
     private javax.swing.JLabel jLabel31;
     private javax.swing.JLabel jLabel32;
     private javax.swing.JLabel jLabel33;
     private javax.swing.JLabel jLabel34;
     private javax.swing.JLabel jLabel35;
     private javax.swing.JLabel jLabel36;
     private javax.swing.JLabel jLabel37;
     private javax.swing.JLabel jLabel38;
     private javax.swing.JLabel jLabel39;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel43;
     private javax.swing.JLabel jLabel44;
     private javax.swing.JLabel jLabel45;
     private javax.swing.JLabel jLabel46;
     private javax.swing.JLabel jLabel49;
     private javax.swing.JLabel jLabel63;
     private javax.swing.JLabel jLabel64;
     private javax.swing.JLabel jLabel65;
     private javax.swing.JLabel jLabel8;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JPanel jPanel3;
     private javax.swing.JPanel jPanel4;
     private javax.swing.JPanel jPanel7;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JSeparator jSeparator1;
     private javax.swing.JSeparator jSeparator2;
     private javax.swing.JSeparator jSeparator3;
     private javax.swing.JSeparator jSeparator4;
     private javax.swing.JLabel logo;
     private javax.swing.JPanel print;
     private javax.swing.JLabel receiveKhr;
     private javax.swing.JLabel receiveUsd;
     private javax.swing.JLabel saleDate;
     private javax.swing.JLabel totalKhr;
     private javax.swing.JLabel totalprice;
     private javax.swing.JLabel vattin;
     // End of variables declaration//GEN-END:variables
}
