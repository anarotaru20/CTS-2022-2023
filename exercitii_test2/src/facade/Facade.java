package facade;

public class Facade {
    private Hotel hotel;
    private CompanieAeriana companieAeriana;
    private Zbor zbor;

    public Facade(Hotel hotel, CompanieAeriana companieAeriana, Zbor zbor) {
        this.hotel = hotel;
        this.companieAeriana = companieAeriana;
        this.zbor = zbor;
    }

    public void getRezervare() {
        hotel.rezervare();
    }

    public void getCompanie() {
        companieAeriana.getCompanieAeriana();
    }

    public void getZbor() {
        zbor.zbor();
    }

}
