public class Monitor {

    String companyName = "my company";
    int year = 2023;
    private Monitor() {
    }

    private static Monitor instance;

    public static Monitor getInstance() {
        if (instance == null)
            instance = new Monitor();
        return instance;
    }

    public String showStatus() {
        return String.format("This is my monitor:%s and it gives data for year:%d", companyName, year);
    }
}
