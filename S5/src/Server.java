public class Server {

    int port = 8080;
    String name = "my server";

    private Server() {
    }

    private static Server instance;

    public static Server getInstance() {
        if (instance == null)
            instance = new Server();
        return instance;
    }

    public String showStatus() {
        return String.format("This is my server:%s and it runs on port:%d", name, port);
    }
}
