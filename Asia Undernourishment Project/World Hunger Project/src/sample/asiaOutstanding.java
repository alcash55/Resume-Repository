package sample;

public class asiaOutstanding {
    private int outstandingUndernourishmentPercent;
    private double totalFood;
    private String outstandingCountryName;

    public asiaOutstanding(int outstandingUndernourishmentPercent,double totalFood, String outstandingCountryName){
        this.outstandingCountryName = outstandingCountryName;
        this.totalFood = totalFood;
        this.outstandingUndernourishmentPercent = outstandingUndernourishmentPercent;
    }

    //--------------------------------------------------------------------------

    public int getOutstandingUndernourishmentPercent() {
        return outstandingUndernourishmentPercent;
    }

    public void setOutstandingUndernourishmentPercent(int outstandingUndernourishmentPercent) {
        this.outstandingUndernourishmentPercent = outstandingUndernourishmentPercent;
    }

    //--------------------------------------------------------------------------

    public double getTotalFood() {
        return totalFood;
    }

    public void setTotalFood(double totalFood){
        this.totalFood = totalFood;
    }

    //--------------------------------------------------------------------------

    public String getOutstandingCountryName() {
        return outstandingCountryName;
    }

    public void setOutstandingCountryName(String outstandingCountryName) {
        this.outstandingCountryName = outstandingCountryName;
    }
}
