package flyweight;

public class Optionale implements IPachetTuristic {
    private int nrExcursii;

    public Optionale(int nrExcursii) {
        this.nrExcursii = nrExcursii;
    }

    public int getNrExcursii() {
        return nrExcursii;
    }

    public void setNrExcursii(int nrExcursii) {
        this.nrExcursii = nrExcursii;
    }

    @Override
    public String toString() {
        return "(Optional): " + nrExcursii + "nr. excursii";
    }

    @Override
    public void afisarePachetTuristic(PachetTuristic pachetTuristic) {
        System.out.println(toString());
    }
}
