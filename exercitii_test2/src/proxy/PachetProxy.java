package proxy;

public class PachetProxy implements PachetTuristic {
    PachetTuristic pachetTuristic;

    @Override
    public void rezervare(int varsta) {
        if (varsta > 65) {
            pachetTuristic.rezervare(varsta);
        } else {
            System.out.println("Varsta dvs. nu permite inregistrarea rezervarii");
        }
    }
}
