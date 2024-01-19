package Model.CustomerType;

/**
 *
 * @author FRONT-END.06
 */
public class CustomerTypeModel {


    public CustomerTypeModel(){}

    public CustomerTypeModel(int customerTypeId, String customerTypeName) {
        this.customerTypeId = customerTypeId;
        this.customerTypeName = customerTypeName;
    }
    
    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }


    public int getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(int customerTypeId) {
        this.customerTypeId = customerTypeId;
    }
    
    private int customerTypeId;
    private String customerTypeName;
}
