public class School {
    private String schoolName;
    private String schoolAddress;
    private String schoolMotto;
    private String schoolUniform;
    private String schoolBuilding;
    private double schoolID;
    public School(String schoolName, String schoolAddress, String schoolMotto, String schoolUniform, String schoolBuilding, double schoolID){
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.schoolMotto = schoolMotto;
        this.schoolUniform = schoolUniform;
        this.schoolBuilding = schoolBuilding;
        this.schoolID = schoolID;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public void setSchoolMotto(String schoolMotto) {
        this.schoolMotto = schoolMotto;
    }

    public void setSchoolUniform(String schoolUniform) {
        this.schoolUniform = schoolUniform;
    }

    public void setSchoolBuilding(String schoolBuilding) {
        this.schoolBuilding = schoolBuilding;
    }

    public void setSchoolID(double schoolID) {
        this.schoolID = schoolID;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public String getSchoolMotto() {
        return schoolMotto;
    }

    public String getSchoolUniform() {
        return schoolUniform;
    }

    public String getSchoolBuilding() {
        return schoolBuilding;
    }

    public double getSchoolID() {
        return schoolID;
    }
}