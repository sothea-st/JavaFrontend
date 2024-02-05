package Model.CashierReport;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author FRONT-END.06
 */
public class Data {
    private String paymentNoFirst;
    private String companyLogo;
    private String companyName;
    private String userName;
    private SummerySale[] discountSummery;
    private String closeDate;
    private String posID;
    private String paymentNoLast;
    private SummerySale[] summeryPayemnt;
    private String companyAddress;
    private SummerySale[] summerySale;
    private String companyContact;
    private String openDate;
    private double closeCash;
    private double openCash;

    @JsonProperty("paymentNoFirst")
    public String getPaymentNoFirst() { return paymentNoFirst; }
    @JsonProperty("paymentNoFirst")
    public void setPaymentNoFirst(String value) { this.paymentNoFirst = value; }

    @JsonProperty("companyLogo")
    public String getCompanyLogo() { return companyLogo; }
    @JsonProperty("companyLogo")
    public void setCompanyLogo(String value) { this.companyLogo = value; }

    @JsonProperty("companyName")
    public String getCompanyName() { return companyName; }
    @JsonProperty("companyName")
    public void setCompanyName(String value) { this.companyName = value; }

    @JsonProperty("userName")
    public String getUserName() { return userName; }
    @JsonProperty("userName")
    public void setUserName(String value) { this.userName = value; }

    @JsonProperty("discountSummery")
    public SummerySale[] getDiscountSummery() { return discountSummery; }
    @JsonProperty("discountSummery")
    public void setDiscountSummery(SummerySale[] value) { this.discountSummery = value; }

    @JsonProperty("closeDate")
    public String getCloseDate() { return closeDate; }
    @JsonProperty("closeDate")
    public void setCloseDate(String value) { this.closeDate = value; }

    @JsonProperty("posId")
    public String getPosID() { return posID; }
    @JsonProperty("posId")
    public void setPosID(String value) { this.posID = value; }

    @JsonProperty("paymentNoLast")
    public String getPaymentNoLast() { return paymentNoLast; }
    @JsonProperty("paymentNoLast")
    public void setPaymentNoLast(String value) { this.paymentNoLast = value; }

    @JsonProperty("summeryPayemnt")
    public SummerySale[] getSummeryPayemnt() { return summeryPayemnt; }
    @JsonProperty("summeryPayemnt")
    public void setSummeryPayemnt(SummerySale[] value) { this.summeryPayemnt = value; }

    @JsonProperty("companyAddress")
    public String getCompanyAddress() { return companyAddress; }
    @JsonProperty("companyAddress")
    public void setCompanyAddress(String value) { this.companyAddress = value; }

    @JsonProperty("SummerySale")
    public SummerySale[] getSummerySale() { return summerySale; }
    @JsonProperty("SummerySale")
    public void setSummerySale(SummerySale[] value) { this.summerySale = value; }

    @JsonProperty("companyContact")
    public String getCompanyContact() { return companyContact; }
    @JsonProperty("companyContact")
    public void setCompanyContact(String value) { this.companyContact = value; }

    @JsonProperty("openDate")
    public String getOpenDate() { return openDate; }
    @JsonProperty("openDate")
    public void setOpenDate(String value) { this.openDate = value; }

    @JsonProperty("closeCash")
    public double getCloseCash() { return closeCash; }
    @JsonProperty("closeCash")
    public void setCloseCash(double value) { this.closeCash = value; }

    @JsonProperty("openCash")
    public double getOpenCash() { return openCash; }
    @JsonProperty("openCash")
    public void setOpenCash(double value) { this.openCash = value; }
}
