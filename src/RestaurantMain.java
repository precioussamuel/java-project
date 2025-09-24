public class RestaurantMain {
    public static  void main(String [] args){
        Restaurant restaurant = new Restaurant("GrandLotte", "Lagos road", "07027384518", 125);
        System.out.println("the restaurant name is " + restaurant.getRestaurantName());
        System.out.println("the restaurant address is " + restaurant.getRestaurantAddress());
        System.out.println("the restaurant phone number is "+ restaurant.getRestaurantPhoneNumber() );
        System.out.println("the restaurant ID is " + restaurant.getRestaurantID());
    }
}