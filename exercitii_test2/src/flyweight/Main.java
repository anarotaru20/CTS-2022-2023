package flyweight;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachet1 = FlyweightFactory.getPachetTuristic("1", "Stella", "Londra", false);
        pachet1.afisarePachetTuristic(new PachetTuristic("D", "Spania", true));
    }
}
