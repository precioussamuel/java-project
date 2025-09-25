public class AirportMain {
    public static void main(String[] args) {
        Airport airport = new Airport("Serverless Deadline", "Lagos Ikeja", 50, 409479);
        System.out.println("the airport name is " + airport.getAirportName());
        System.out.println("the airport address is " + airport.getAirportAddress());
        System.out.println("the airport staff numbers is " + airport.getAirportStaffNumber());
        System.out.println("the airport ID is " + airport.getAirportID());
    }
}