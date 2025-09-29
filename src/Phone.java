import java.lang.management.ThreadInfo;

public class Phone {
    private String phoneModel;
    private String phoneYear;
    private String phoneType;
    private double phonePrice;
    private int phoneID;
    public Phone(String phoneModel, String phoneYear, String phoneType, double phonePrice, int phoneID){
        this.phoneModel = phoneModel;
        this.phoneYear = phoneYear;
        this.phoneType = phoneType;
        this.phonePrice = phonePrice;
        this.phoneID = phoneID;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public void setPhoneYear(){
        this.phoneYear = phoneYear;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public void setPhonePrice(double phonePrice) {
        this.phonePrice = phonePrice;
    }

    public void setPhoneID(int phoneID) {
        this.phoneID = phoneID;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public String getPhoneYear() {
        return phoneYear;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public double getPhonePrice() {
        return phonePrice;
    }

    public int getPhoneID() {
        return phoneID;
    }
}