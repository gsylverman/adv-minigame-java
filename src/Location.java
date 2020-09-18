import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int id;
    private final String locationDescription;
    private Map<String, Integer> exits;

    public Location(int id, String locationDescription, Map<String, Integer> exits) {
        this.id = id;
        this.locationDescription = locationDescription;
        this.exits = exits;
    }

    public int getId() {
        return id;
    }

    public void addExit(String direction, int id) {
        this.exits.put(direction, id);
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}
