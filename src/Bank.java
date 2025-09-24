public class Bank {
    private String bankName;
    private String bankAddress;
    private double bankID;
    public Bank(String bankName, String bankAddress, double bankID){
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.bankID = bankID;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public void setBankID(double bankID) {
        this.bankID = bankID;
    }
    public String getBankName() {
        return bankName;
    }

    public String getBankAddress() {
        return bankAddress;
    }
     public double getBankID(){
        return bankID;
     }
}