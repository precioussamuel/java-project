public class Hotel {
    private String hotelName;
    private String hotelAddress;
    private String hotelPhoneNumber;
    private int hotelID;
    public Hotel(String hotelName, String hotelAddress, String hotelPhoneNumber, int hotelID){
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
        this.hotelPhoneNumber = hotelPhoneNumber;
        this.hotelID = hotelID;
    }

    public void setHotelName(String hotelName) {

        this.hotelName = hotelName;
    }

    public void setHotelAddress(String hotelAddress) {

        this.hotelAddress = hotelAddress;
    }

    public void setHotelPhoneNumber(String hotelPhoneNumber) {

        this.hotelPhoneNumber = hotelPhoneNumber;
    }

    public void setHotelID(int hotelID) {

        this.hotelID = hotelID;
    }

    public String getHotelName() {

        return hotelName;
    }

    public String getHotelAddress() {

        return hotelAddress;
    }

    public String getHotelPhoneNumber() {

        return hotelPhoneNumber;
    }

    public int getHotelID() {

        return hotelID;
    }
}