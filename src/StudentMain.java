public class StudentMain {
    public static void main(String[] args){
        Student student = new Student("precious", "SS3", 21, 412);
        System.out.println("The student name is " + student.getStudentName());
        System.out.println("The student class is " + student.getStudentClass());
        System.out.println("The student age is " + student.getStudentAge());
        System.out.println("The student ID is " + student.getStudentID());
    }
}
