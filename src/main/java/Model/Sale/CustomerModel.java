 
package Model.Sale;

 
public class CustomerModel {
    private String cusName;
    private String contact;
    private String email;
    private String gender;
    private String nationality;
    private String coupon;
    private String earning;

    public CustomerModel() {
    }

    public CustomerModel(String cusName, String contact, String email, String gender, String nationality, String coupon, String earning) {
        this.cusName = cusName;
        this.contact = contact;
        this.email = email;
        this.gender = gender;
        this.nationality = nationality;
        this.coupon = coupon;
        this.earning = earning;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public String getEarning() {
        return earning;
    }

    public void setEarning(String earning) {
        this.earning = earning;
    }
    
    
    
}
