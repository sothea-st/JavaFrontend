 
package Model.Sale;
 
public class PaymentDetailModel {
    private int sourceId;
    private int customerTypeId;
    private String paymentType;
    private double receiveKhr;
    private double receiveUsd;
    private double remainingUsd;
    private double remainingKhr;
    private double changeUsd;
    private double changeKhr;
    
    public PaymentDetailModel(){}

    public PaymentDetailModel(
            int sourceId,
            int customerTypeId, 
            String paymentType, 
            double receiveKhr, 
            double receiveUsd, 
            double remainingUsd, 
            double remainingKhr, 
            double changeUsd, 
            double changeKhr) {
        this.sourceId = sourceId;
        this.customerTypeId = customerTypeId;
        this.paymentType = paymentType;
        this.receiveKhr = receiveKhr;
        this.receiveUsd = receiveUsd;
        this.remainingUsd = remainingUsd;
        this.remainingKhr = remainingKhr;
        this.changeUsd = changeUsd;
        this.changeKhr = changeKhr;
    }

    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    public int getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(int customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getReceiveKhr() {
        return receiveKhr;
    }

    public void setReceiveKhr(double receiveKhr) {
        this.receiveKhr = receiveKhr;
    }

    public double getReceiveUsd() {
        return receiveUsd;
    }

    public void setReceiveUsd(double receiveUsd) {
        this.receiveUsd = receiveUsd;
    }

    public double getRemainingUsd() {
        return remainingUsd;
    }

    public void setRemainingUsd(double remainingUsd) {
        this.remainingUsd = remainingUsd;
    }

    public double getRemainingKhr() {
        return remainingKhr;
    }

    public void setRemainingKhr(double remainingKhr) {
        this.remainingKhr = remainingKhr;
    }

    public double getChangeUsd() {
        return changeUsd;
    }

    public void setChangeUsd(double changeUsd) {
        this.changeUsd = changeUsd;
    }

    public double getChangeKhr() {
        return changeKhr;
    }

    public void setChangeKhr(double changeKhr) {
        this.changeKhr = changeKhr;
    }
    
    
    
    
    
}
