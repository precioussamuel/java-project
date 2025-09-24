public class BankMain {
    public static void main(String[] args){
        Bank bank = new Bank("First bank", "Lagos road", 6793);
        System.out.println("the bank name is " + bank.getBankName());
        System.out.println("the bank address is " + bank.getBankAddress());
        System.out.println("the bank ID is " + bank.getBankID());
    }
}