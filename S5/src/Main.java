
public class Main {
    public static void main(String[] args) {
        Server serverInstance = Server.getInstance();
        System.out.println(serverInstance.showStatus());

        Monitor monitorInstance = Monitor.getInstance();
        System.out.println(monitorInstance.showStatus());
    }
}