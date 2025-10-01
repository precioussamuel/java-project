public class Gadgets {
    private String gadgetsModel;
    private String gadgetsYear;
    private String gadgetsType;
    private double gadgetsPrice;
    private int gadgetsID;

    public Gadgets(String gadgetsModel, String gadgetsYear, String gadgetsType, double gadgetsPrice, int gadgetsID) {
        this.gadgetsModel = gadgetsModel;
        this.gadgetsYear = gadgetsYear;
        this.gadgetsType = gadgetsType;
        this.gadgetsPrice = gadgetsPrice;
        this.gadgetsID = gadgetsID;

    }

    public void setGadgetsModel(String gadgetsModel) {
        this.gadgetsModel = gadgetsModel;
    }

    public void setGadgetsYear(String gadgetsYear) {
        this.gadgetsYear = gadgetsYear;

    }

    public void setGadgetsType(String gadgetsType) {
        this.gadgetsType = gadgetsType;
    }

    public void setGadgetsPrice(double gadgetsPrice) {
        this.gadgetsPrice = gadgetsPrice;
    }

    public void setGadgetsID(int gadgetsID) {
        this.gadgetsID = gadgetsID;
    }

    public String getGadgetsModel() {
        return gadgetsModel;
    }

    public String getGadgetsYear() {
        return gadgetsYear;
    }

    public String getGadgetsType() {
        return gadgetsType;
    }

    public double getGadgetsPrice() {
        return gadgetsPrice;
    }

    public int getGadgetsID() {
        return gadgetsID;
    }
}