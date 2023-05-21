package decorator;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachetTuristic = new PachetCazare(2,250.99);
        pachetTuristic = new OfertaPachetCazare(pachetTuristic);
        System.out.println("Nr. oameni: " + pachetTuristic.getNumberPpl());
        System.out.println("Pret: " + pachetTuristic.getPrice() + " RON");
    }
}
