import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {
    private static final Map<Integer, Location> locations = new HashMap<>();

    static {
        //READ FILE
        Scanner scanner = null;
        try {
            System.out.println("try to read");
            FileReader dirFile = new FileReader("locations.txt");
            scanner = new Scanner(dirFile);
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                int nr = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String locationDescription = scanner.nextLine();
                Map<String, Integer> tempExist = new HashMap<>();
                locations.put(nr, new Location(nr, locationDescription, tempExist));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        try {
            scanner = new Scanner(new BufferedReader(new FileReader("directions.txt")));
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                String input = scanner.nextLine();
                String[] data = input.split(",");
                int index = Integer.parseInt(data[0]);
                String direct = data[1];
                int pointTo = Integer.parseInt(data[2]);

//                int index = scanner.nextInt();
//                scanner.skip(scanner.delimiter());
//                String direct = scanner.next();
//                scanner.skip(scanner.delimiter());
//                int pointTo = Integer.parseInt(scanner.nextLine());
                locations.get(index).addExit(direct, pointTo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        //**************************
//        locations.put(0, new Location(0, "Home", new HashMap<>()));
//        Map<String, Integer> tempExit = new HashMap<>();
//        tempExit.put("E", 3);
//        tempExit.put("S", 2);
//        tempExit.put("V", 1);
//        locations.put(1, new Location(1, "In the forest", tempExit));
//
//        tempExit = new HashMap<>();
//        tempExit.put("E", 1);
//        tempExit.put("N", 3);
//        tempExit.put("S", 1);
//        locations.put(2, new Location(2, "In the road", tempExit));
//        tempExit = new HashMap<>();
//        tempExit.put("E", 1);
//        tempExit.put("V", 3);
//        tempExit.put("N", 1);
//        locations.put(3, new Location(3, "Climbing the mountain", tempExit));
    }

    public static void main(String[] args) throws IOException {
        //WRITE FILE
//            try (FileWriter locationsWriter = new FileWriter("locations.txt");
//                FileWriter directionsWriter = new FileWriter("directions.txt")){
//                for (Location location : locations.values()) {
//                    locationsWriter.write(location.getId()+", "+location.getLocationDescription()+"\n");
//                    for (String direction : location.getExits().keySet()) {
//                        directionsWriter.write(location.getId()+ "," + direction+"," + location.getExits().get(direction) + "\n");
//                    }
//                }
//            }

//        FileWriter fileWriter = null;
//        try {
//            System.out.println("Writing the file");
//            fileWriter = new FileWriter("locations.txt");
//            for (Location location : locations.values()) {
//                fileWriter.write(location.getId() + ", " + location.getLocationDescription() + "\n");
//            }
//
//        } finally {
//            if (fileWriter != null) {
//                System.out.println("Attempting to close the file");
//                fileWriter.close();
//                System.out.println("File closed");
//
//            }
//        }
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
