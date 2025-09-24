public class ManMain {
    public static void main(String[] args) {
    Man man = new Man("De Don", "Abuja road", 57, "7hm", "fair");
         System.out.println("The man`s name is " + man.getManName());
         System.out.println("The man`s address is " + man.getManAddress());
         System.out.println("The man`s age is " + man.getManAge());
         System.out.println("The man`s height is " + man.getManHeight());
        System.out.println("The man`s completion is " + man.getManComplexion());
    }
}