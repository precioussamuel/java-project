public class CourtMain {
    public static void main(String[] args) {
        Court court = new Court(4776, "The Supreme Court", "Abuja", "08479279828");
        System.out.println("The court Id is " + court.getCourtId());
        System.out.println("The court Name is " + court.getCourtName());
        System.out.println("The court Address is " + court.getCourtAddress());
        System.out.println("The court Phone number is " + court.getCourtPhoneNumber());
    }
}
