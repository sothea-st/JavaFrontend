 
package Model.Sale;
 
import java.util.ArrayList;
import org.json.JSONObject;

public class SaleModel {
    private int id;
    private String saleDate;
    private double discount;
    private double subTotal;
    private double deliveryFee;
    private double total;
    private PaymentDetailModel dataPay;
    private CustomerModel customer;
    private ArrayList<ProductSaleModel> dataSale;

    public SaleModel() {
    }

    public SaleModel(int id, String saleDate, double discount, double subTotal, double deliveryFee, double total, PaymentDetailModel dataPay, CustomerModel customer, ArrayList<ProductSaleModel> dataSale) {
        this.id = id;
        this.saleDate = saleDate;
        this.discount = discount;
        this.subTotal = subTotal;
        this.deliveryFee = deliveryFee;
        this.total = total;
        this.dataPay = dataPay;
        this.customer = customer;
        this.dataSale = dataSale;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public PaymentDetailModel getDataPay() {
        return dataPay;
    }

    public void setDataPay(PaymentDetailModel dataPay) {
        this.dataPay = dataPay;
    }

    public CustomerModel getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerModel customer) {
        this.customer = customer;
    }

    public ArrayList<ProductSaleModel> getDataSale() {
        return dataSale;
    }

    public void setDataSale(ArrayList<ProductSaleModel> dataSale) {
        this.dataSale = dataSale;
    }
    
    
    
}   
