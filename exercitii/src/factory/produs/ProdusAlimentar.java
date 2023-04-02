package factory.produs;

public class ProdusAlimentar implements IProdus {

    private String numeProdusAlimentar;
    private float pret;
    private float valoareTva;

    public ProdusAlimentar(String numeProdusAlimentar, float pret, float valoareTva) {
        this.numeProdusAlimentar = numeProdusAlimentar;
        this.pret = pret;
        this.valoareTva = valoareTva;
    }

    @Override
    public String toString() {
        return "ProdusAlimentar{" +
                "numeProdusAlimentar='" + numeProdusAlimentar + '\'' +
                ", pret=" + pret +
                '}';
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
        return procentTVA;
    }
}