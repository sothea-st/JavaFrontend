 
package Model.HoldOrder;

import java.awt.Component;
import java.util.HashMap;

 
public class HoldOrderModel {
     private String customerName;
     private int qty;
     private Component[] listCom;

     public HoldOrderModel() {
     }

     public HoldOrderModel(String customerName, int qty, Component[] listCom) {
          this.customerName = customerName;
          this.qty = qty;
          this.listCom = listCom;
     }

     

     public String getCustomerName() {
          return customerName;
     }

     public void setCustomerName(String customerName) {
          this.customerName = customerName;
     }

     public int getQty() {
          return qty;
     }

     public void setQty(int qty) {
          this.qty = qty;
     }

     public Component[] getListCom() {
          return listCom;
     }

     public void setListCom(Component[] listCom) {
          this.listCom = listCom;
     }
     
     
       
}
