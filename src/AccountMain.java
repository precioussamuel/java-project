public class AccountMain {
    public static void main(String[] args){
        Account account = new Account("First bank", "3321624509", "Savings", 80000);
        System.out.println("the account name is " + account.getAccountName());
        System.out.println("the account number is " + account.getAccountNumber());
        System.out.println("the account type is " + account.getAccountType());
        System.out.println("the account balance is " + account.getAccountBalance());
    }
}