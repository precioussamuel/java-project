public class CommissionEmployeeMain {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Alice", "Joe", "25637-68809-8398", 638276000, 5000.05);
        System.out.println("The employee first name is " + commissionEmployee.getFirstName());
        System.out.println("The employee last name is " + commissionEmployee.getLastName());
        System.out.println("The employee social security is " +commissionEmployee.getSocialSecurity());
        System.out.println("The employee gross sales is " + commissionEmployee.getGrossSales());
        System.out.println("The employee commission rate is " + commissionEmployee.getCommissionRate());
    }
}