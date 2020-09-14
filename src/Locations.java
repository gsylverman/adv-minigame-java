import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new HashMap<>();
    static {
        locations.put(0, new Location(0, "Home", new HashMap<>()));
        Map<String, Integer> tempExit = new HashMap<>();
        tempExit.put("E", 3);
        tempExit.put("S", 2);
        tempExit.put("V", 1);
        locations.put(1, new Location(1, "In the forest", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("E", 1);
        tempExit.put("N", 3);
        tempExit.put("S", 1);
        locations.put(2, new Location(2, "In the road", tempExit));
        tempExit = new HashMap<>();
        tempExit.put("E", 1);
        tempExit.put("V", 3);
        tempExit.put("N", 1);
        locations.put(3, new Location(3, "Climbing the mountain", tempExit));
    }
    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
