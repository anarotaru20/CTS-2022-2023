package factory.produs;

public class ProdusIgienic implements IProdus {

    private String numeProdusAlimentar;
    private float pret;
    private float valoareTva;

    public ProdusIgienic(String numeProdusAlimentar, float pret, float valoareTva) {
        this.numeProdusAlimentar = numeProdusAlimentar;
        this.pret = pret;
        this.valoareTva = valoareTva;
    }

    public void setNumeProdusAlimentar(String numeProdusAlimentar) {
        this.numeProdusAlimentar = numeProdusAlimentar;
    }

    @Override
    public float getPret() {
        return this.pret;
    }

    @Override
    public String getDenumireProdus() {
        return this.numeProdusAlimentar;
    }

    @Override
    public float getValoareTVA(int procentTVA) {
        return valoareTva;
    }
}
