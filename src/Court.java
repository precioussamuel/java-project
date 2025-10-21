public class Court {
    private int courtId;
    private String courtName;
    private String courtAddress;
    private String courtPhoneNumber;

    public Court(int courtId, String courtName, String courtAddress, String courtPhoneNumber) {
        this.courtId = courtId;
        this.courtName = courtName;
        this.courtAddress = courtAddress;
        this.courtPhoneNumber = courtPhoneNumber;
    }

    public void setCourtId(int courtId) {
        this.courtId = courtId;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    public void setCourtAddress(String courtAddress) {
        this.courtAddress = courtAddress;
    }

    public void setCourtPhoneNumber(String courtPhoneNumber) {
        this.courtPhoneNumber = courtPhoneNumber;
    }

    public int getCourtId() {
        return courtId;
    }

    public String getCourtName() {
        return courtName;
    }

    public String getCourtAddress() {
        return courtAddress;
    }

    public String getCourtPhoneNumber() {
        return courtPhoneNumber;
    }
}