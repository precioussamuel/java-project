public class Student {
    private String studentName;
    private String studentClass;
    private int studentAge;
    private int studentID;
    public Student(String studentName, String studentClass, int studentAge, int studentID){
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.studentAge = studentAge;
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public int getStudentID() {
        return studentID;
    }
}
