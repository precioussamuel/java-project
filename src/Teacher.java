public class Teacher {
    private int ID;
    private String teacherName;
    private String teacherAddress;
    private String teacherGender;
    private String teacherCourse;
    private String teacherViewTimetable;
    private String teacherAssignHomework;
    private String teacherRecordAttendance;
    private String teacherViewExamDate;
    private String teacherAssignClasses;
    public Teacher(int ID, String teacherName, String teacherAddress, String teacherGender, String teacherCourse, String teacherViewTimetable,String teacherAssignHomework, String teacherRecordAttendance, String teacherViewExamDate, String teacherAssignClasses){
        this.ID = ID;
        this.teacherName = teacherName;
        this.teacherAddress = teacherAddress;
        this.teacherGender = teacherGender;
        this.teacherCourse = teacherCourse;
        this.teacherViewTimetable = teacherViewTimetable;
        this.teacherAssignHomework = teacherAssignHomework;
        this.teacherRecordAttendance = teacherRecordAttendance;
        this.teacherViewExamDate = teacherViewExamDate;
        this.teacherAssignClasses = teacherAssignClasses;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setTeacherAddress(String teacherAddress) {
        this.teacherAddress = teacherAddress;
    }

    public void setTeacherGender(String teacherGender) {
        this.teacherGender = teacherGender;
    }

    public void setTeacherCourse(String teacherCourse) {
        this.teacherCourse = teacherCourse;
    }

    public void setTeacherViewTimetable(String teacherViewTimetable) {
        this.teacherViewTimetable = teacherViewTimetable;
    }

    public void setTeacherAssignHomework(String teacherAssignHomework) {
        this.teacherAssignHomework = teacherAssignHomework;
    }

    public void setTeacherRecordAttendance(String teacherRecordAttendance) {
        this.teacherRecordAttendance = teacherRecordAttendance;
    }

    public void setTeacherViewExamDate(String teacherViewExamDate) {
        this.teacherViewExamDate = teacherViewExamDate;
    }

    public void setTeacherAssignClasses(String teacherAssignClasses) {
        this.teacherAssignClasses = teacherAssignClasses;
    }

    public int getID() {
        return ID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getTeacherAddress() {
        return teacherAddress;
    }

    public String getTeacherGender() {
        return teacherGender;
    }

    public String getTeacherCourse() {
        return teacherCourse;
    }

    public String getTeacherViewTimetable() {
        return teacherViewTimetable;
    }

    public String getTeacherAssignHomework() {
        return teacherAssignHomework;
    }

    public String getTeacherRecordAttendance() {
        return teacherRecordAttendance;
    }

    public String getTeacherViewExamDate() {
        return teacherViewExamDate;
    }

    public String getTeacherAssignClasses() {
        return teacherAssignClasses;
    }
}