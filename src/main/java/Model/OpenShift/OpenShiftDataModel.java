package Model.OpenShift;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OpenShiftDataModel {

     private String msg;
     private DataOpenShiftModel data;

     @JsonProperty("msg")
     public String getMsg() {
          return msg;
     }

     @JsonProperty("msg")
     public void setMsg(String value) {
          this.msg = value;
     }

     @JsonProperty("data")
     public DataOpenShiftModel getData() {
          return data;
     }

     @JsonProperty("data")
     public void setData(DataOpenShiftModel value) {
          this.data = value;
     }
}
