package Model.CashierReport;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author FRONT-END.06
 */
public class SummerySale {
    private String title;
    private long qty;
    private double total;

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("qty")
    public long getQty() { return qty; }
    @JsonProperty("qty")
    public void setQty(long value) { this.qty = value; }

    @JsonProperty("total")
    public double getTotal() { return total; }
    @JsonProperty("total")
    public void setTotal(double value) { this.total = value; }
}
