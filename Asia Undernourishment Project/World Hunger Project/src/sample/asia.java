package sample;

public class asia {
    private int countryAreaCode;
    private int undernourishmentPercent;
    private String countryName;
    private String transportationData;

    public asia(int countryAreaCode, String countryName, int undernourishmentPercent, String transportationData) {
        this.countryAreaCode = countryAreaCode;
        this.undernourishmentPercent = undernourishmentPercent;
        this.countryName = countryName;
        this.transportationData = transportationData;
    }

    //--------------------------------------------------------------------------

    public String getTransportationData() {
        return transportationData;
    }

    public void setTransportationData(String transportationData) {
        this.transportationData = transportationData;
    }

    //--------------------------------------------------------------------------

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    //--------------------------------------------------------------------------

    public int getCountryAreaCode() {
        return countryAreaCode;
    }

    public void setCountryAreaCode(int countryAreaCode) {
        this.countryAreaCode = countryAreaCode;
    }

    //--------------------------------------------------------------------------

    public int getUndernourishmentPercent() {
        return undernourishmentPercent;
    }

    public void setUndernourishmentPercent(int undernourishmentPercent) {
        this.undernourishmentPercent = undernourishmentPercent;
    }
}
