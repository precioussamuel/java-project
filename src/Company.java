public class Company {
    private String companyName;
    private String companyLocation;
    private int companyID;
    public Company(String companyName, String companyLocation, int companyID){
        this.companyName = companyName;
        this.companyLocation = companyLocation;
        this.companyID = companyID;

    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyLocation(String companyLocation) {
        this.companyLocation = companyLocation;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyLocation() {
            return companyLocation;
        }
            public int getCompanyID() {
                return companyID;
            }
        }