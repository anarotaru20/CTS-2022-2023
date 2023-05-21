package facade;

public class Zbor {
    private String destination;

    public Zbor( String destination) {
        this.destination = destination;
    }

    public void zbor() {
        System.out.println("Destinatie: " + destination);
    }
}
