package factory.mijlocTransport;

public class TramvaiFactory implements Factory {

    @Override
    public MijlocTransport getMijlocTransport(String nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }


}
