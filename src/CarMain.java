public class CarMain {
    public static void main(String [] args) {
        Car firstcar = new Car("Infinity", "2025", 550000, 0.5);
        Car secondcar = new Car("Pilot", "2012", 350000, 0.7);
        System.out.println("The first car model is " + firstcar.getCarModel());
        System.out.println("The second car model is " + secondcar.getCarModel());
        System.out.println("The first car year is " + firstcar.getCarYear());
        System.out.println("The second car year is " + secondcar.getCarYear());
        System.out.println("The first car price is " + firstcar.getCarPrice());
        System.out.println("The second car price is " + secondcar.getCarPrice());
        System.out.println("The first car discount percentage is " + firstcar.getDiscountPercentage());
        System.out.println("The second car discount percentage is " + secondcar.getDiscountPercentage());
    }
}
