package sample;

public class transportation {
    private String countryName;
    private int population;
    private String transportationData; //receiving or supplying
    private double numFood;
    private String receivingCountry;


    public transportation( String countryName,int population,String transportationData,double numFood,String receivingCountry) {
        this.countryName = countryName;
        this.population = population;
        this.transportationData = transportationData;
        this.numFood = numFood;
        this.receivingCountry = receivingCountry;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    //--------------------------------------------------------------------------

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    //--------------------------------------------------------------------------

    public String getTransportationData() {
        return transportationData;
    }

    public void setTransportationData(String transportationData) {
        this.transportationData = transportationData;
    }

    //--------------------------------------------------------------------------

    public double getNumFood() {
        return numFood;
    }

    public void setNumFood(double numFood) {
        this.numFood = numFood;
    }

    //--------------------------------------------------------------------------

    public String getReceivingCountry() {
        return receivingCountry;
    }

    public void setReceivingCountry(String receivingCountry) {
        this.receivingCountry = receivingCountry;
    }
}
