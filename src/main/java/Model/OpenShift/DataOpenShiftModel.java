 
package Model.OpenShift;

import com.fasterxml.jackson.annotation.JsonProperty;

 
public class DataOpenShiftModel {

     private long id;
     private String posID;
     private String userCode;
     private String openTime;
     private String openDate;
     private long reserveUsd;
     private long reserveKhr;
     private long numberOpenShift;
     private long createBy;
     private String createDate;
     private boolean status;
     private boolean deleted;

     @JsonProperty("id")
     public long getID() {
          return id;
     }

     @JsonProperty("id")
     public void setID(long value) {
          this.id = value;
     }

     @JsonProperty("posId")
     public String getPosID() {
          return posID;
     }

     @JsonProperty("posId")
     public void setPosID(String value) {
          this.posID = value;
     }

     @JsonProperty("userCode")
     public String getUserCode() {
          return userCode;
     }

     @JsonProperty("userCode")
     public void setUserCode(String value) {
          this.userCode = value;
     }

     @JsonProperty("openTime")
     public String getOpenTime() {
          return openTime;
     }

     @JsonProperty("openTime")
     public void setOpenTime(String value) {
          this.openTime = value;
     }

     @JsonProperty("openDate")
     public String getOpenDate() {
          return openDate;
     }

     @JsonProperty("openDate")
     public void setOpenDate(String value) {
          this.openDate = value;
     }

     @JsonProperty("reserveUsd")
     public long getReserveUsd() {
          return reserveUsd;
     }

     @JsonProperty("reserveUsd")
     public void setReserveUsd(long value) {
          this.reserveUsd = value;
     }

     @JsonProperty("reserveKhr")
     public long getReserveKhr() {
          return reserveKhr;
     }

     @JsonProperty("reserveKhr")
     public void setReserveKhr(long value) {
          this.reserveKhr = value;
     }

     @JsonProperty("numberOpenShift")
     public long getNumberOpenShift() {
          return numberOpenShift;
     }

     @JsonProperty("numberOpenShift")
     public void setNumberOpenShift(long value) {
          this.numberOpenShift = value;
     }

     @JsonProperty("createBy")
     public long getCreateBy() {
          return createBy;
     }

     @JsonProperty("createBy")
     public void setCreateBy(long value) {
          this.createBy = value;
     }

     @JsonProperty("createDate")
     public String getCreateDate() {
          return createDate;
     }

     @JsonProperty("createDate")
     public void setCreateDate(String value) {
          this.createDate = value;
     }

     @JsonProperty("status")
     public boolean getStatus() {
          return status;
     }

     @JsonProperty("status")
     public void setStatus(boolean value) {
          this.status = value;
     }

     @JsonProperty("deleted")
     public boolean getDeleted() {
          return deleted;
     }

     @JsonProperty("deleted")
     public void setDeleted(boolean value) {
          this.deleted = value;
     }
}
