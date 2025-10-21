public class Admin {
    private int ID;
    private String adminName;
    private String adminAddress;
    private String adminGender;
    private String adminAddUser;
    private String adminAssignPermission;
    private String adminAssignExamDate;
    public Admin(int ID, String adminName, String adminAddress, String adminGender, String adminAddUser, String adminAssignPermission, String adminAssignExamDate){
        this.ID = ID;
        this.adminName = adminName;
        this.adminAddress = adminAddress;
        this.adminGender = adminGender;
        this.adminAddUser = adminAddUser;
        this.adminAssignPermission = adminAssignPermission;
        this.adminAssignExamDate = adminAssignExamDate;
    }

    public void setID(int ID) {
                this.ID = ID;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public void setAdminAddress(String adminAddress) {
        this.adminAddress = adminAddress;
    }

    public void setAdminGender(String adminGender) {
        this.adminGender = adminGender;
    }

    public void setAdminAddUser(String adminAddUser) {
        this.adminAddUser = adminAddUser;
    }

    public void setAdminAssignPermission(String adminAssignPermission) {
        this.adminAssignPermission = adminAssignPermission;
    }

    public void setAdminAssignExamDate(String adminAssignExamDate) {
        this.adminAssignExamDate = adminAssignExamDate;
    }

    public int getID() {
        return ID;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getAdminAddress() {
        return adminAddress;
    }

    public String getAdminGender() {
        return adminGender;
    }

    public String getAdminAddUser() {
        return adminAddUser;
    }

    public String getAdminAssignPermission() {
        return adminAssignPermission;
    }

    public String getAdminAssignExamDate() {
        return adminAssignExamDate;
    }
}