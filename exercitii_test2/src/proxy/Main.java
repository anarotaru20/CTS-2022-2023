package proxy;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachet1 = new PachetProxy();

        pachet1.rezervare(23);
        pachet1.rezervare(66);


//        pachet2.rezervare(67);


    }
}
