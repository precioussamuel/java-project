public class Airport {
    private String airportName;
    private String airportAddress;
    private double airportStaffNumber;
    private  double airportID;
    public Airport(String airportName, String airportAddress, double airportStaffNumber, double airportID){
        this.airportName = airportName;
        this.airportAddress = airportAddress;
        this.airportStaffNumber = airportStaffNumber;
        this.airportID = airportID;

    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public void setAirportAddress(String airportAddress) {
        this.airportAddress = airportAddress;
    }

    public void setAirportStaffNumber(double airportStaffNumber) {
        this.airportStaffNumber = airportStaffNumber;
    }

    public void setAirportID(double airportID) {
        this.airportID = airportID;
    }

    public String getAirportName() {
        return airportName;
    }

    public String getAirportAddress() {
        return airportAddress;
    }

    public double getAirportStaffNumber() {
        return airportStaffNumber;
    }

    public double getAirportID() {
        return airportID;
    }
}