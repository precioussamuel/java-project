public class Course {
    private int ID;
    private String courseName;
    private String courseTeacher;
    private double duration;
    private String courseLevel;
    public Course(int ID, String courseName, String courseTeacher, double duration, String courseLevel){
        this.ID = ID;
        this.courseName = courseName;
        this.courseTeacher = courseTeacher;
        this.duration = duration;
        this.courseLevel = courseLevel;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setCourseLevel(String courseLevel) {
        this.courseLevel = courseLevel;
    }

    public int getID() {
        return ID;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public double getDuration() {
        return duration;
    }

    public String getCourseLevel() {
        return courseLevel;
    }
}