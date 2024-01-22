 
package Model.Reprint;
 
import com.fasterxml.jackson.annotation.JsonProperty;

public class SaleDetailModel {
      private long qty;
     private double price;
     private String barcode;
     private String proNameEn;

     public SaleDetailModel() {
     }

     public SaleDetailModel(long qty, double price, String barcode, String proNameEn) {
          this.qty = qty;
          this.price = price;
          this.barcode = barcode;
          this.proNameEn = proNameEn;
     }

     @JsonProperty("qty")
    public long getQty() { return qty; }
    @JsonProperty("qty")
    public void setQty(long value) { this.qty = value; }

    @JsonProperty("price")
    public double getPrice() { return price; }
    @JsonProperty("price")
    public void setPrice(double value) { this.price = value; }

    @JsonProperty("barcode")
    public String getBarcode() { return barcode; }
    @JsonProperty("barcode")
    public void setBarcode(String value) { this.barcode = value; }

    @JsonProperty("pro_name_en")
    public String getProNameEn() { return proNameEn; }
    @JsonProperty("pro_name_en")
    public void setProNameEn(String value) { this.proNameEn = value; }
}
