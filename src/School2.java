public class School2 {
    private int schoolID;
    private String schoolName;
    private String schoolAddress;
    private String student;
    private String teacher;
    private String course;
    private String admin;
    public School2(int schoolID, String schoolName, String schoolAddress, String student, String teacher, String course, String admin){
        this.schoolID = schoolID;
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.student = student;
        this.teacher = teacher;
        this.course = course;
        this.admin = admin;
    }

    public void setSchoolID(int schoolID) {

        this.schoolID = schoolID;
    }

    public void setSchoolName(String schoolName) {

        this.schoolName = schoolName;
    }

    public void setSchoolAddress(String schoolAddress) {

        this.schoolAddress = schoolAddress;
    }

    public void setStudent(String student) {

        this.student = student;
    }

    public void setTeacher(String teacher) {

        this.teacher = teacher;
    }

    public void setCourse(String course) {

        this.course = course;
    }

    public void setAdmin(String admin) {

        this.admin = admin;
    }

    public int getSchoolID() {

        return schoolID;
    }

    public String getSchoolName() {

        return schoolName;
    }

    public String getSchoolAddress() {

        return schoolAddress;
    }

    public String getStudent() {

        return student;
    }

    public String getTeacher() {

        return teacher;
    }

    public String getCourse() {

        return course;
    }

    public String getAdmin() {

        return admin;
    }
}