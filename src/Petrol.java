public class Petrol {
    private  String petrolStationLocation;
    private  String petrolType;
    private double petrolQuantityInLiters;
    private double petrolPriceInLiter;
    private double discountPercentage;
    private double netPurchaseAmount;

    public Petrol(String petrolStationLocation, String petrolType, double petrolQuantityInLiters, double petrolPriceInLiter, double discountPercentage) {
        this.petrolStationLocation = petrolStationLocation;
        this.petrolType = petrolType;
        this.petrolQuantityInLiters = petrolQuantityInLiters;
        this.petrolPriceInLiter = petrolPriceInLiter;
        this.discountPercentage = discountPercentage;
    }

    public void setPetrolStationLocation(String petrolStationLocation) {
        this.petrolStationLocation = petrolStationLocation;
    }

    public void setPetrolType(String petrolType) {

        this.petrolType = petrolType;
    }

    public void setPetrolQuantityInLiters(double petrolQuantityInLiters) {
        this.petrolQuantityInLiters = petrolQuantityInLiters;
    }

    public void setPetrolPriceInLiter(double petrolPriceInLiter) {

        this.petrolPriceInLiter = petrolPriceInLiter;
    }

    public void setDiscountPercentage(double discountPercentage) {

        this.discountPercentage = discountPercentage;
    }

    public String getPetrolStationLocation() {

        return petrolStationLocation;
    }

    public String getPetrolType() {

        return petrolType;
    }

    public double getPetrolQuantityInLiters() {

        return petrolQuantityInLiters;
    }

    public double getPetrolPriceInLiter() {

        return petrolPriceInLiter;
    }

    public double getDiscountPercentage() {

        return discountPercentage;
    }

    public double getNetPurchaseAmount() {
        double netPurchaseAmount = petrolPriceInLiter - discountPercentage;
        return netPurchaseAmount;
    }
}