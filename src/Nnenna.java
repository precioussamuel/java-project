public class Nnenna {
    private String nnennaName;
    private String nnennaAddress;
    private double nnennaAge;
    public Nnenna(String nnennaName, String nnennaAddress, double nnennaAge){
        this.nnennaName = nnennaName;
        this.nnennaAddress = nnennaAddress;
        this.nnennaAge = nnennaAge;
    }

    public void setNnennaName(String nnennaName) {
        this.nnennaName = nnennaName;
    }

    public void setNnennaAddress(String nnennaAddress) {
        this.nnennaAddress = nnennaAddress;
    }

    public void setNnennaAge(double nnennaAge) {
        this.nnennaAge = nnennaAge;
    }

    public String getNnennaName() {
        return nnennaName;
    }

    public String getNnennaAddress() {
        return nnennaAddress;
    }

    public double getNnennaAge() {
        return nnennaAge;
    }
}