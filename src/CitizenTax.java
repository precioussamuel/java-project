public class CitizenTax {
    private String citizenName;
    private double citizenTax;
    private double citizenTaxDiscount;

    public CitizenTax(String citizenName, double citizenTax, double citizenTaxDiscount) {
        this.citizenName = citizenName;
        this.citizenTax = citizenTax;
        this.citizenTaxDiscount = citizenTaxDiscount;
    }

    public void setCitizenName(String citizenName) {
        this.citizenName = citizenName;
    }

    public void setCitizenTax(double citizenTax) {
        if (citizenTax <= 15){
            System.out.println("the citizen tax is 30,000");
        }
        this.citizenTax = citizenTax;
    }

    public void setCitizenTaxDiscount(double citizenTaxDiscount) {
        if (citizenTaxDiscount <= 15){
            System.out.println("the citizen discount is 30,000");
        }
        this.citizenTaxDiscount = citizenTaxDiscount;
    }

    public String getCitizenName() {
        return citizenName;
    }

    public double getCitizenTax() {
        return citizenTax;
    }

    public double getCitizenTaxDiscount() {
        return citizenTaxDiscount;
    }
}