public class Account {
    private String accountName;
    private String accountNumber;
    private String accountType;
    private double accountBalance;
    public Account(String accountName, String accountNumber, String accountType, double accountBalance){
    this.accountName = accountName;
    this.accountNumber = accountNumber;
    this.accountType = accountType;
    this.accountBalance = accountBalance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
}
