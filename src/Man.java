public class Man {
    private String manName;
    private  String manAddress;
    private double manAge;
    private String manHeight;
    private String manComplexion;
    public Man(String manName, String manAddress, double manAge, String manHeight, String manComplexion){
        this.manName = manName;
        this.manAddress = manAddress;
        this.manAge = manAge;
        this.manHeight = manHeight;
        this.manComplexion = manComplexion;
    }

    public void setManName(String manName) {
        this.manName = manName;
    }

    public void setManAddress(String manAddress) {
        this.manAddress = manAddress;
    }

    public void setManAge(double manAge) {
        this.manAge = manAge;
    }

    public void setManHeight(String manHeight) {
        this.manHeight = manHeight;
    }

    public void setManComplexion(String manComplexion) {
        this.manComplexion = manComplexion;
    }

    public String getManName() {
        return manName;
    }

    public String getManAddress() {
        return manAddress;
    }

    public double getManAge() {
        return manAge;
    }

    public String getManHeight() {
        return manHeight;
    }

    public String getManComplexion() {
        return manComplexion;
    }
}