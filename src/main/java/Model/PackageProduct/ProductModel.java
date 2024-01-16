 
package Model.PackageProduct;
 

public class ProductModel {
     private int id;
     private int catId;
     private String flage;
     private String weight;
     private String costKhr;
     private String fileName;
     private String priceKhr;
     private String barcode;
     private int unitTypeId;
     private String productNameKh;
     private String productNameEn;
     private Object costUsd;
     private Object priceUsd;
     private String productStatus;
     private Object discount;
     private String disoucntPercentage;
     
     public ProductModel(){}

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public int getCatId() {
          return catId;
     }

     public void setCatId(int catId) {
          this.catId = catId;
     }

     public String getFlage() {
          return flage;
     }

     public void setFlage(String flage) {
          this.flage = flage;
     }

     public String getWeight() {
          return weight;
     }

     public void setWeight(String weight) {
          this.weight = weight;
     }

     public String getCostKhr() {
          return costKhr;
     }

     public void setCostKhr(String costKhr) {
          this.costKhr = costKhr;
     }

     public String getFileName() {
          return fileName;
     }

     public void setFileName(String fileName) {
          this.fileName = fileName;
     }

     public String getPriceKhr() {
          return priceKhr;
     }

     public void setPriceKhr(String priceKhr) {
          this.priceKhr = priceKhr;
     }

     public String getBarcode() {
          return barcode;
     }

     public void setBarcode(String barcode) {
          this.barcode = barcode;
     }

     public int getUnitTypeId() {
          return unitTypeId;
     }

     public void setUnitTypeId(int unitTypeId) {
          this.unitTypeId = unitTypeId;
     }

     public String getProductNameKh() {
          return productNameKh;
     }

     public void setProductNameKh(String productNameKh) {
          this.productNameKh = productNameKh;
     }

     public String getProductNameEn() {
          return productNameEn;
     }

     public void setProductNameEn(String productNameEn) {
          this.productNameEn = productNameEn;
     }

     public Object getCostUsd() {
          return costUsd;
     }

     public void setCostUsd(Object costUsd) {
          this.costUsd = costUsd == null ? "" : costUsd;
     }

     public Object getPriceUsd() {
          return priceUsd;
     }

     public void setPriceUsd(Object priceUsd) {
          this.priceUsd =  priceUsd == null ? "" : priceUsd;
     }

     public String getProductStatus() {
          return productStatus;
     }

     public void setProductStatus(String productStatus) {
          this.productStatus = productStatus;
     }

     public Object getDiscount() {
          return discount;
     }

     public void setDiscount(Object discount) {
          this.discount = discount == null ? "" : discount;
     }

     public String getDisoucntPercentage() {
          return disoucntPercentage;
     }

     public void setDisoucntPercentage(String disoucntPercentage) {
          this.disoucntPercentage = disoucntPercentage;
     }
     
     public ProductModel(
          int id, 
          int catId,
          String flage,
          String weight,
          String costKhr,
          String fileName,
          String priceKhr,
          String barcode, 
          int unitTypeId,
          String productNameKh,
          String productNameEn,
          Object costUsd,
          Object priceUsd,
          String productStatus,
          Object discount,
          String disoucntPercentage) {
          this.id = id;
          this.catId = catId;
          this.flage = flage;
          this.weight = weight;
          this.costKhr = costKhr;
          this.fileName = fileName;
          this.priceKhr = priceKhr;
          this.barcode = barcode;
          this.unitTypeId = unitTypeId;
          this.productNameKh = productNameKh;
          this.productNameEn = productNameEn;
          this.costUsd = costUsd;
          this.priceUsd = priceUsd;
          this.productStatus = productStatus;
          this.discount = discount;
          this.disoucntPercentage = disoucntPercentage;
     }
     
     
    
}
