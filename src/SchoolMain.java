public class SchoolMain {
    public static void main(String[] args) {
        School school = new School("Divine Grace Academy", "Lagos road", "In GOD we trust", "Sky blue", "Two Storey building", 301);
        System.out.println("The name of the school is " + school.getSchoolName());
        System.out.println("The school address is " + school.getSchoolAddress());
        System.out.println("The school motto is " + school.getSchoolMotto());
        System.out.println("the school uniform is " + school.getSchoolUniform());
        System.out.println("The school building is " + school.getSchoolBuilding());
        System.out.println("The school ID is " + school.getSchoolID());
    }
}