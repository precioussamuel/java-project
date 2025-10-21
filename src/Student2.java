public class Student2 {
    private int ID;
    private String studentName;
    private String studentAddress;
    private int studentAge;
    private String studentInfo;
    private String studentGender;
    private String studentViewAssignment;
    private String studentViewTimetable;
    private String studentViewResult;
    private String studentViewExamDate;
    public Student2(int ID, String studentName, String studentAddress, int studentAge, String studentInfo, String studentGender, String studentViewAssignment, String studentViewTimetable, String studentViewResult, String studentViewExamDate){
        this.ID = ID;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentAge = studentAge;
        this.studentInfo = studentInfo;
        this.studentGender = studentGender;
        this.studentViewAssignment = studentViewAssignment;
        this.studentViewTimetable = studentViewTimetable;
        this.studentViewResult = studentViewResult;
        this.studentViewExamDate = studentViewExamDate;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void setStudentInfo(String studentInfo) {
        this.studentInfo = studentInfo;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public void setStudentViewAssignment(String studentViewAssignment) {
        this.studentViewAssignment = studentViewAssignment;
    }

    public void setStudentViewTimetable(String studentViewTimetable) {
        this.studentViewTimetable = studentViewTimetable;
    }

    public void setStudentViewResult(String studentViewResult) {
        this.studentViewResult = studentViewResult;
    }

    public void setStudentViewExamDate(String studentViewExamDate) {
        this.studentViewExamDate = studentViewExamDate;
    }

    public int getID() {
        return ID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public String getStudentInfo() {
        return studentInfo;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public String getStudentViewAssignment() {
        return studentViewAssignment;
    }

    public String getStudentViewTimetable() {
        return studentViewTimetable;
    }

    public String getStudentViewResult() {
        return studentViewResult;
    }

    public String getStudentViewExamDate() {
        return studentViewExamDate;
    }
}