 
package Model.PackageProduct;
 
import java.math.BigDecimal;


public class ProductModel {
     private int id;
     private int catId;
     private String flag;
     private String weight;
     private BigDecimal cost;
     private String proImageName;
     private BigDecimal price;
     private String barcode;
     private String productNameKh;
     private String productNameEn;
     private String productStatus;
     private int discount;

    
     public ProductModel(){}

    public ProductModel(int id, int catId, String flag, String weight,
            BigDecimal cost, String proImageName, BigDecimal price, 
            String barcode, String productNameKh, String productNameEn, 
            String productStatus, int discount) {
        this.id = id;
        this.catId = catId;
        this.flag = flag;
        this.weight = weight;
        this.cost = cost;
        this.proImageName = proImageName;
        this.price = price;
        this.barcode = barcode;
        this.productNameKh = productNameKh;
        this.productNameEn = productNameEn;
        this.productStatus = productStatus;
        this.discount = discount;
    }

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

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
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

    public String getProImageName() {
        return proImageName;
    }

    public void setProImageName(String proImageName) {
        this.proImageName = proImageName;
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

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    
     
    
}
