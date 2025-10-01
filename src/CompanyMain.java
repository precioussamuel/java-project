public class CompanyMain {
    public static void main(String[] args) {
        Company company = new Company("Niter valley", "Lagos road", 9348576);
        System.out.println("The company name is " + company.getCompanyName());
        System.out.println("The company location is " + company.getCompanyLocation());
        System.out.println("The company ID is " + company.getCompanyID());
    }
}