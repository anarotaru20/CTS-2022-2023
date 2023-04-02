package factory.produs;

// Pentru un magazin general se dorește implementarea unei aplicații care să ajute gestionarii de
//marfă la așezarea produselor pe rafturi. Astfel în cadrul aplicației gestionarii au posibilitatea
//creării produselor în funcție de tipul acestora: alimentar, igienic, birotica, etc. Orice produs din
//magazin implementează interfața IProdus. Să se implementeze modulul care îi va ajuta pe
//gestionari în procesul de creare al obiectelor.


public class Main {
    public static void main(String[] args) {

        FabricaProduse factory = new FabricaProduse();
        IProdus pa1 = factory.getProdus(TipProdus.produsAlimentar, "Pate");
        IProdus pa2 = factory.getProdus(TipProdus.produsAlimentar, "Salam");
        IProdus pa3 = factory.getProdus(TipProdus.produsAlimentar, "Branza");


        System.out.println("Produse alimentare: ");

        System.out.println(pa1.getDenumireProdus() + " " + pa1.getPret() + " " + pa1.getValoareTVA(9));
        System.out.println(pa2.getDenumireProdus() + " " + pa1.getPret() + " " + pa1.getValoareTVA(11));
        System.out.println(pa3.getDenumireProdus() + " " + pa1.getPret() + " " + pa1.getValoareTVA(7));


        IProdus pi1 = factory.getProdus(TipProdus.produsIgienic, "Deodorant");
        IProdus pi2 = factory.getProdus(TipProdus.produsIgienic, "Sampon");
        IProdus pi3 = factory.getProdus(TipProdus.produsIgienic, "Dezinfectant");

        System.out.println("\n");

        System.out.println("Produse de igiena:");

        System.out.println(pi1.getDenumireProdus() + " " + pa1.getPret() + " " + pa1.getValoareTVA(19));
        System.out.println(pi2.getDenumireProdus() + " " + pa1.getPret() + " " + pa1.getValoareTVA(16));
        System.out.println(pi3.getDenumireProdus() + " " + pa1.getPret() + " " + pa1.getValoareTVA(17));











    }
}
