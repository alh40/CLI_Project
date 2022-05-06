

public class NavDisplay {


    public static void navigationDisplay(String message) {
        clearDisplay();

        System.out.println(" ");
        System.out.println("=================== NAVIGATION ===================");
        System.out.println(" ");
        System.out.println("Please select from the following list of options: ");
        System.out.println(" ");
        System.out.println(" 0 - See all available flights");
        System.out.println(" 1 - See all passengers");
        System.out.println(" 2 - Add a new passenger");
        System.out.println(" 3 - Add a new flight");
        System.out.println(" 4 - Cancel a flight");
        System.out.println(" 5 - Create a booking");
        System.out.println(" 6 - Search for a flight by destination");
        System.out.println(" 7 - View all bookings by passenger");
        System.out.println(" ");
        System.out.println("==================================================");
        System.out.println(" ");
        System.out.println(message);
    }

    public static void clearDisplay() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
