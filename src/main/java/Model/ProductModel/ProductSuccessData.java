package Model.ProductModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductSuccessData {

     private String msg;
     private ProductDataModel[] data;

     @JsonProperty("data")
     public ProductDataModel[] getData() {
          return data;
     }

     @JsonProperty("data")
     public void setData(ProductDataModel[] value) {
          this.data = value;
     }

     @JsonProperty("msg")
     public String getMsg() {
          return msg;
     }

     @JsonProperty("msg")
     public void setMsg(String value) {
          this.msg = value;
     }
}
