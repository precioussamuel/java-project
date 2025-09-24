public class Girl {
    private String girlName;
    private  double girlAge;
    private double girlHeight;
    private double girlID;
    public Girl(String girlName, double girlAge, double girlHeight, double girlID){
         this.girlName = girlName;
         this.girlAge = girlAge;
         this.girlHeight = girlHeight;
         this.girlID = girlID;
    }

    public void setGirlName(String girlName) {
        this.girlName = girlName;
    }

    public void setGirlAge(double girlAge) {
        this.girlAge = girlAge;
    }

    public void setGirlHeight(double girlHeight) {
        this.girlHeight = girlHeight;
    }

    public void setGirlID(double girlID) {
        this.girlID = girlID;
    }

    public String getGirlName() {
        return girlName;
    }

    public double getGirlAge() {
        return girlAge;
    }

    public double getGirlHeight() {
        return girlHeight;
    }

    public double getGirlID() {
        return girlID;
    }
}