public class MinisterMain {
    public static void main(String[] args) {
        Minister minister = new Minister(87, " Aba road", 35, "Zion Otis", "08036738633");
        System.out.println("The minister Id is " + minister.getMinisterId());
        System.out.println("The minister Name is " + minister.getMinisterName());
        System.out.println("The minister Age is " + minister.getMinisterAge());
        System.out.println("The minister Address is " + minister.getMinisterAddress());
        System.out.println("The minister PhoneNumber is " + minister.getMinisterPhoneNumber());
    }
}