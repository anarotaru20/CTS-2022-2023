package factory.mijlocTransport;

public class Main {

    private static void afisareMijlocTransport(Factory factory, String nrInmatriculare) {
        MijlocTransport mijTransp = factory.getMijlocTransport(nrInmatriculare);
        System.out.println(mijTransp.toString());
    }


    public static void main(String[] args) {

//        Factory factoryAutobuz = new AutobuzFactory();
//        Factory factoryTramvai = new TramvaiFactory();
//        System.out.println(factoryAutobuz.getMijlocTransport("B 100 STB"));
//        System.out.println(factoryTramvai.getMijlocTransport("B 10 TRAM"));

        afisareMijlocTransport(new AutobuzFactory(), "B 100 STB");
        afisareMijlocTransport(new TramvaiFactory(), "B 10 TRAM");

    }

}
