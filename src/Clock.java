public class Clock {
    private int clockHours;
    private int clockMinutes;
    private int clockSeconds;
    public Clock(int clockHours, int clockMinutes, int clockSeconds){
        this.clockHours = clockHours;
        this.clockMinutes = clockMinutes;
        this.clockSeconds = clockSeconds;
    }

    public void setClockHours(int clockHours) {
        if (clockHours >= 23) {
            System.out.println(" the clock hours is less than 23");
        }
        this.clockHours = clockHours;
    }

    public void setClockMinutes(int clockMinutes) {
        if (clockMinutes >= 59){
            System.out.println("the clock minutes is less than 59");
        }
        this.clockMinutes = clockMinutes;
    }

    public void setClockSeconds(int clockSeconds) {
        if (clockSeconds >= 59) {
            System.out.println(" the clock seconds is less than 59");
        }
        this.clockSeconds = clockSeconds;
    }
    public int getClockHours(){
        return clockHours;
    }
    public int getClockMinutes(){
        return clockMinutes;
    }
    public int getClockSeconds(){
        return clockSeconds;
    }
}
