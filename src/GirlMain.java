public class GirlMain {
    public static void main(String[] args){
        Girl girl = new Girl("Mercy", 15, 9, 435);
        System.out.println("the  girl name is " + girl.getGirlName());
        System.out.println("the girl age is " + girl.getGirlAge());
        System.out.println("the girl height is " + girl.getGirlHeight());
        System.out.println("the girl ID is " + girl.getGirlID());
    }
}