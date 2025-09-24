public class ClockMain {
    public static void main(String[] args){
        Clock clock = new Clock(12, 60, 60);
        System.out.println("the clock hour is " + clock.getClockHours());
        System.out.println("the clock minutes is " + clock.getClockMinutes());
        System.out.println("the clock seconds is " + clock.getClockSeconds());
    }
}
