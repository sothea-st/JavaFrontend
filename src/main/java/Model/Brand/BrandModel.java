package Model.Brand;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BrandModel {

     private int id;
     private String brandNameEn;
     private String brandNameKh;
     private int createBy;
     private String createDate;
     private boolean status;
     private boolean deleted;

     @JsonProperty("id")
     public int getID() {
          return id;
     }

     @JsonProperty("id")
     public void setID(int value) {
          this.id = value;
     }

     @JsonProperty("brandNameEn")
     public String getBrandNameEn() {
          return brandNameEn;
     }

     @JsonProperty("brandNameEn")
     public void setBrandNameEn(String value) {
          this.brandNameEn = value;
     }

     @JsonProperty("brandNameKh")
     public String getBrandNameKh() {
          return brandNameKh;
     }

     @JsonProperty("brandNameKh")
     public void setBrandNameKh(String value) {
          this.brandNameKh = value;
     }

     @JsonProperty("createBy")
     public int getCreateBy() {
          return createBy;
     }

     @JsonProperty("createBy")
     public void setCreateBy(int value) {
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
