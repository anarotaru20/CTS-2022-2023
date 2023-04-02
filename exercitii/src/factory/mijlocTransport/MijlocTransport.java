package factory.mijlocTransport;

public class MijlocTransport {

    private String nrInmatriculare;

    public MijlocTransport(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    @Override
    public String toString() {
        return "MijlocTransport{" +
                "nrInmatriculare='" + nrInmatriculare + '\'' +
                '}';
    }
}
