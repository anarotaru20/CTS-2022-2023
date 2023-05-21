package facade;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Stella");
        CompanieAeriana companieAeriana = new CompanieAeriana("Wizz");
        Zbor zbor = new Zbor("Spania");

        Facade facade = new Facade(hotel, companieAeriana, zbor);
        facade.getRezervare();
        facade.getCompanie();
        facade.getZbor();
    }
}
