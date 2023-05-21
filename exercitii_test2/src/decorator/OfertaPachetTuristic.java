package decorator;

public abstract class OfertaPachetTuristic implements PachetTuristic {
    PachetTuristic pachetTuristic;
    public OfertaPachetTuristic(PachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
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
