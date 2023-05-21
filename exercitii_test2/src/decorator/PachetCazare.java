package decorator;

public class PachetCazare implements PachetTuristic{
    private int nrPeople;
    private double price;
    public PachetCazare(int nrPeople, double price) {
        this.nrPeople = nrPeople;
        this.price = price;
    }
    @Override
    public int getNumberPpl() {
        return nrPeople;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
