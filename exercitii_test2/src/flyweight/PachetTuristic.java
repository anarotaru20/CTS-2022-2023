package flyweight;

public class PachetTuristic implements IPachetTuristic {
    private String hotel;
    private String destination;
    boolean breakfast;

    public PachetTuristic(String hotel, String destination, boolean breakfast) {
        this.hotel = hotel;
        this.destination = destination;
        this.breakfast = breakfast;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean isBreakfast() {
        return breakfast;
    }

    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }


    @Override
    public void afisarePachetTuristic(PachetTuristic pachetTuristic) {
        System.out.println("Pachet turistic:" + "\nHotel: " + hotel +
                "\nDestination: " + destination + "\nBreakfast: " + breakfast);
    }
}
