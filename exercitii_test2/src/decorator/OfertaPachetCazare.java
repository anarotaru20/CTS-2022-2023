package decorator;

public class OfertaPachetCazare extends OfertaPachetTuristic{
    public OfertaPachetCazare(PachetTuristic pachetTuristic) {
        super(pachetTuristic);
    }
    @Override
    public int getNumberPpl() {
        return pachetTuristic.getNumberPpl();
    }
    @Override
    public double getPrice() {
        return pachetTuristic.getPrice();
    }
}
