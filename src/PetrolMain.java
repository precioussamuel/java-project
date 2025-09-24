public class PetrolMain {
    public static void main(String[] args){
        Petrol petrol = new Petrol("Aba road", "Fuel", 12, 300, 0.9);
        System.out.println("the petrol station location is " + petrol.getPetrolStationLocation());
        System.out.println("the petrol type is " + petrol.getPetrolType());
        System.out.println("the petrol quantity in liters is " + petrol.getPetrolQuantityInLiters());
        System.out.println("the petrol price in liter is " + petrol.getPetrolPriceInLiter());
        System.out.println("the discount percentage is " + petrol.getDiscountPercentage());
        System.out.println("the net purchase discount is " + petrol.getNetPurchaseAmount());
    }
}