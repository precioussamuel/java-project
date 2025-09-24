public class ChurchMain {
    public static void main(String[] args) {
        Church church = new Church("Assemblies of GOD church", "22 Clifford road aba", 4672);
        System.out.println("the church name is " + church.getChurchName());
        System.out.println("the church address is " + church.getChurchAddress());
        System.out.println("the church ID is " + church.getChurchID());
    }
}