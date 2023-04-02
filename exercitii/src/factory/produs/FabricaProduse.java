package factory.produs;

public class FabricaProduse {
    public IProdus getProdus(TipProdus tip, String nume){
        switch (tip) {
            case produsIgienic: return new ProdusIgienic(nume, 20.2f, 0.19f);
            case produsBirotica: return new ProdusBirotica(nume, 21.9f, 0.19f);
            case produsAlimentar: return new ProdusAlimentar(nume, 18.3f, 0.19f);
            default: return new ProdusAlimentar(nume, 20.6f, 0.19f);
        }
    }
}
