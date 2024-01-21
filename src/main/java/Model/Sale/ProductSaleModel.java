 
package Model.Sale;
 
public class ProductSaleModel {
    private int productId;
    private int qty;
    private double price;
    private double amount;
    private double discount;

    public ProductSaleModel() {
    }

    public ProductSaleModel(int productId, int qty, double price, double amount, double discount) {
        this.productId = productId;
        this.qty = qty;
        this.price = price;
        this.amount = amount;
        this.discount = discount;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    
}
