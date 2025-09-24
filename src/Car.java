public class Car {
    private String carModel;
    private String carYear;
    private double carPrice;
    private double discountPercentage;
    public Car(String carModel, String carYear, double carPrice, Double discountPercentage){
        this.carModel = carModel;
        this.carYear = carYear;
        this.carPrice = carPrice;
        this.discountPercentage = discountPercentage;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
    public void setCarYear(String carYear) {

        this.carYear = carYear;
    }
    public void setCarPrice(double carPrice) {
        if (carPrice <= 0){
            System.out.println("the car price is greater than zero");
    }
        this.carPrice = carPrice;
    }
    public void setDiscountPercentage(double discountPercentage) {
        if (discountPercentage <= 0){
            System.out.println("the discount percentage is greater than zero");
        }
        this.discountPercentage = discountPercentage;
    }
    public String getCarModel() {

        return carModel;
    }
    public String getCarYear() {

        return carYear;
    }
    public double getCarPrice() {

        return carPrice;
    }
    public double getDiscountPercentage() {

        return discountPercentage;
    }
}