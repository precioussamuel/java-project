public class HotelMain {
    public static void main(String[] args){
        Hotel hotel = new Hotel("GrandLotte", "Aba road", "021636866786", 7497);
        System.out.println("the hotel name is " + hotel.getHotelName());
        System.out.println("the hotel address is " + hotel.getHotelAddress());
        System.out.println("the hotel phone number is " + hotel.getHotelPhoneNumber());
        System.out.println("the hotel ID is " + hotel.getHotelID());
    }
}
