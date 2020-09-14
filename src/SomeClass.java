import java.util.Scanner;

public class SomeClass {
    private static Locations locations = new Locations();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        locations.put(0, new Location(0, "Home"));

        locations.put(1, new Location(1, "In the forest"));
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 2);
        locations.get(1).addExit("V", 1);

        locations.put(2, new Location(2, "In the road"));
        locations.get(2).addExit("V", 1);
        locations.get(2).addExit("S", 2);
        locations.get(2).addExit("N", 3);
        locations.put(3, new Location(3, "Climbing the mountain"));
        locations.get(3).addExit("S", 2);
        locations.get(3).addExit("E", 3);

        int postition = 1;

        while (true) {
            System.out.println("enter new id");
            String pct = scanner.nextLine().toUpperCase();
            if (locations.get(postition).getExits().containsKey(pct)) {
                postition = locations.get(postition).getExits().get(pct);
                System.out.println(postition);
                printExits(locations.get(postition));
                System.out.println(locations.get(postition).getLocationDescription());
            } else {
                System.out.println("Not allowed in that direction");
            }

            if (postition == 0) {
                break;
            }
        }
    }

    private static void printExits(Location location) {
        System.out.println("Available exits");
        for (String pct : location.getExits().keySet()) {
            System.out.print(pct + " ");
        }
        System.out.println();
    }
}
