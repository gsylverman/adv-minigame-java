import java.util.Scanner;

public class SomeClass {
    private static Locations locations = new Locations();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int postition = 1;

        while (true) {
            Location currentLocation = locations.get(postition);
            System.out.println("###############################");
            System.out.println("Please enter new direction");
            printExits(currentLocation);
            String pct = scanner.nextLine().toUpperCase();
            if (currentLocation.getExits().containsKey(pct)) {
                postition = currentLocation.getExits().get(pct);
                printExits(currentLocation);
                System.out.println(currentLocation.getLocationDescription());
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
