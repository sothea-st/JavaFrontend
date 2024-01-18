 
package Model.PackageProduct;
 
import java.math.BigDecimal;


public class ProductModel {
     private int id;
     private int catId;
     private String flage;
     private String weight;
     private String fileName;
     private String barcode;
     private String productNameKh;
     private String productNameEn;
     private BigDecimal cost;
     private BigDecimal price;
     private String productStatus;
     private Object discount;
     
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

     public BigDecimal getCost() {
          return cost;
     }

     public void setCost(BigDecimal cost) {
          this.cost = cost;
     }

     public String getFileName() {
          return fileName;
     }

     public void setFileName(String fileName) {
          this.fileName = fileName;
     }

     public BigDecimal getPrice() {
          return price;
     }

     public void setPrice(BigDecimal price) {
          this.price = price;
     }

     public String getBarcode() {
          return barcode;
     }

     public void setBarcode(String barcode) {
          this.barcode = barcode;
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

   
     public ProductModel(
          int id, 
          int catId,
          String flage,
          String weight,
          String fileName,
          String barcode, 
          String productNameKh,
          String productNameEn,
          BigDecimal cost,
          BigDecimal price,
          String productStatus,
          Object discount
     ) {
          this.id = id;
          this.catId = catId;
          this.flage = flage;
          this.weight = weight;
          this.cost = cost;
          this.fileName = fileName;
          this.price = price;
          this.barcode = barcode;
       
          this.productNameKh = productNameKh;
          this.productNameEn = productNameEn;
        
          this.productStatus = productStatus;
          this.discount = discount;
        
     }
     
    
}
