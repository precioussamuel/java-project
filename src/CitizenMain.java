import java.util.Scanner;

public class CitizenMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CitizenTax firstCitizen = new CitizenTax("Victor", 200, 0.5);
        CitizenTax secondCitizen = new CitizenTax("Esther", 150, 0.7);
        CitizenTax thirdCitizen = new CitizenTax("Glory", 350, 0.9);
        System.out.println("the first citizen name is " + firstCitizen.getCitizenName());
        System.out.println("the second citizen name is " + secondCitizen.getCitizenName());
        System.out.println("the third citizen name is " + thirdCitizen.getCitizenName());
        System.out.println("the first citizen tax is " + firstCitizen.getCitizenTax());
        System.out.println("the second citizen tax is " + secondCitizen.getCitizenTax());
        System.out.println("the third citizen tax is " + thirdCitizen.getCitizenTax());
        System.out.println("the first citizen tax discount is " + firstCitizen.getCitizenTaxDiscount());
        System.out.println("the second citizen tax discount is " + secondCitizen.getCitizenTaxDiscount());
        System.out.println("the third citizen tax discount is " + thirdCitizen.getCitizenTaxDiscount());
    }
}