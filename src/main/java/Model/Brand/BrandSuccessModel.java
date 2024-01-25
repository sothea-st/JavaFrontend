package Model.Brand;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BrandSuccessModel {

     private String msg;
     private BrandModel[] data;

     @JsonProperty("msg")
     public String getMsg() {
          return msg;
     }

     @JsonProperty("msg")
     public void setMsg(String value) {
          this.msg = value;
     }

     @JsonProperty("data")
     public BrandModel[] getData() {
          return data;
     }

     @JsonProperty("data")
     public void setData(BrandModel[] value) {
          this.data = value;
     }
}
