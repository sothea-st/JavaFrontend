package Model.MessageCode;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageCodeModel {

     private String msg;

     @JsonProperty("msg")
     public String getMsg() {
          return msg;
     }

     @JsonProperty("msg")
     public void setMsg(String value) {
          this.msg = value;
     }
}
