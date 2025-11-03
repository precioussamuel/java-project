public class CommissionEmployee {
    private String firstName;
    private String lastName;
    private String socialSecurity;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurity, double grossSales, double commissionRate) {
        this.firstName = firstName;
        this.lastName = socialSecurity;
        this.socialSecurity = socialSecurity;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            System.out.println("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            System.out.println("commission rate must be > 0.0 and 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }
}