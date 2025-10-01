public class PhoneMain {
    public static void main(String[] args) {
        Phone phone = new Phone("Infinix hot 40i", "2024", "Android", 450000,57478);
        System.out.println("The phone model is " + phone.getPhoneModel());
        System.out.println("The phone year is " + phone.getPhoneYear());
        System.out.println("The phone type is " + phone.getPhoneType());
        System.out.println("The phone price is " + phone.getPhonePrice());
        System.out.println("The phone ID is " + phone.getPhoneID());
    }
}