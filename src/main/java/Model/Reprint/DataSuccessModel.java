 
package Model.Reprint;


public class DataSuccessModel {
     private String msg;
     private ReprintModel data;

     public DataSuccessModel() {
     }

     public DataSuccessModel(String msg, ReprintModel data) {
          this.msg = msg;
          this.data = data;
     }

     public String getMsg() {
          return msg;
     }

     public void setMsg(String msg) {
          this.msg = msg;
     }

     public ReprintModel getData() {
          return data;
     }

     public void setData(ReprintModel data) {
          this.data = data;
     }
      
}
