public class Church {
    private String churchName;
    private String churchAddress;
    private double churchID;
    public Church(String churchName, String churchAddress, double churchID){
        this.churchName = churchName;
        this.churchAddress = churchAddress;
        this.churchID = churchID;
    }

    public void setChurchName(String churchName) {
        this.churchName = churchName;
    }
    public void setChurchAddress(String churchAddress) {
        this.churchAddress = churchAddress;
    }
    public void setChurchID(double churchID) {
        this.churchID = churchID;
    }
    public String getChurchName() {
        return churchName;
    }
    public String getChurchAddress() {
        return churchAddress;
    }
    public double getChurchID() {
        return churchID;
    }
}