package proxy;

public class PachetTransport implements PachetTuristic{
    @Override
    public void rezervare(int varsta) {
        System.out.println("Rezervare pt persoana cu varsta de: " + varsta);
    }
}
