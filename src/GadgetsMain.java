public class GadgetsMain {
    public static void main(String[] args){
        Gadgets gadgets = new Gadgets("Laptop", "2025", "HP", 5795885, 9789776);
        System.out.println("the gadgets model is " + gadgets.getGadgetsModel());
        System.out.println("the gadgets year is " + gadgets.getGadgetsYear());
        System.out.println("the gadgets type is " + gadgets.getGadgetsType());
        System.out.println("the gadgets price is " + gadgets.getGadgetsPrice());
        System.out.println("the gadgets ID is " + gadgets.getGadgetsID());
    }
}
