package facade;

public class Hotel {
    private String name;

    public Hotel(String name) {
        this.name = name;
    }

    public void rezervare() {
        System.out.println("Hotel: " + name);

    }
}
