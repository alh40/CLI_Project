
import java.util.*;

public class Main {


    public static void main(String[] args) {
        start("-");
    }


    public static void start(String message) {
        Scanner input = new Scanner(System.in);
        NavDisplay.navigationDisplay(message);
        selectOption(input);
    }


    public static void selectOption(Scanner input) {

        String message = "-";
        Input.writeToFile();

        String s = input.nextLine();

        switch (s) {
            case "0":
                Input.displayAllFlights();
                break;
            case "1":
                Input.displayAllPassengers();
                break;
            case "2":
                Input.addPassengerInput(input);
                break;
            case "3":
                Input.addNewFlightInput(input);
                break;
            case "4":
                Input.cancelFlight(input);
                break;
            case "5":
                Input.createBooking(input);
                break;
            case "6":
                Input.searchFlightByDestination(input);
                break;
            case "7":
                Input.viewAllBookings(input);
                break;
            case "exit":
                return;
            default:
                message = "Not an option. Please try again!";
                break;
        }

        start(message);

    }

}

