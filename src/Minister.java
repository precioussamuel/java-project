public class Minister {
    private int ministerId;
    private String ministerName;
    private int ministerAge;
    private String ministerAddress;
    private String ministerPhoneNumber;
    public Minister(int ministerId, String ministerName, int ministerAge, String ministerAddress, String ministerPhoneNumber){
        this.ministerId = ministerId;
        this.ministerAge = ministerAge;
        this.ministerName = ministerAddress;
        this.ministerAddress = ministerAddress;
        this.ministerPhoneNumber = ministerPhoneNumber;
    }

    public void setMinisterId(int ministerId) {
        this.ministerId = ministerId;
    }

    public void setMinisterName(String ministerName) {
        this.ministerName = ministerName;
    }

    public void setMinisterAge(int ministerAge) {
        this.ministerAge = ministerAge;
    }

    public void setMinisterAddress(String ministerAddress) {
        this.ministerAddress = ministerAddress;
    }

    public void setMinisterPhoneNumber(String ministerPhoneNumber) {
        this.ministerPhoneNumber = ministerPhoneNumber;
    }

    public int getMinisterId() {
        return ministerId;
    }

    public String getMinisterName() {
        return ministerName;
    }

    public int getMinisterAge() {
        return ministerAge;
    }

    public String getMinisterAddress() {
        return ministerAddress;
    }

    public String getMinisterPhoneNumber() {
        return ministerPhoneNumber;
    }
}