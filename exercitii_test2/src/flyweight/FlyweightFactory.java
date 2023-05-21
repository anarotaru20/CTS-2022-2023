package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<String, PachetTuristic> pachete = new HashMap<>();

    public static PachetTuristic getPachetTuristic(String key, String hotel, String destination, boolean breakfast) {
        PachetTuristic pachetTuristic = pachete.get(key);
        if (pachetTuristic == null) {
            pachetTuristic = new PachetTuristic(hotel, destination, breakfast);
            pachete.put(key, pachetTuristic);
        }
        return pachetTuristic;
    }

}
