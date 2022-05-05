import java.util.ArrayList;
import java.util.HashMap;

public class Test {

    public static ArrayList<Flight> flightList = Flight.flightList();

    public static HashMap<Integer, ArrayList<Flight>> flightListForPrintToFile = new HashMap<>();

    public static Passenger passenger = new Passenger("A", 123, 123);
    public static Passenger passenger2 = new Passenger("B", 321, 250);
    public static Passenger passenger3 = new Passenger("C", 213, 999);

    public static void main(String[] args) {
        System.out.println("====== ADD NEW TEST =====");
        passengerBookFlightTest_addNew();
        System.out.println("=========================================");
        System.out.println("");
        System.out.println("====== ADD REPEAT TEST =====");
        passengerBookFlightTest_addRepeat();
        System.out.println("=========================================");
        System.out.println("====== MULTIPLE PASSENGER BOOK ONE FLIGHT TEST =====");
        passengerBookFlightTest_multiplePassengerBookTheSameFlight();
        System.out.println("=========================================");
        System.out.println("====== MULTIPLE PASSENGER BOOK DIFFERENT FLIGHT TEST =====");
        passengerBookFlightTest_multiplePassengerBookDifferentFlight();
        System.out.println("=========================================");

        System.out.println("====== SEARCH FLIGHT TEST ======");
        searchFlightTest_ByDestination();
        System.out.println("=========================================");
        System.out.println("====== SEARCH FLIGHT TEST BY ID =====");
        searchFlightTest_ById();
        System.out.println("=========================================");
    }

    // ----- Passenger Book Flight Function ---------------------------------------------------------------------------
    public static String passengerBookFlight(Passenger passenger, Flight flight) {

        for (Flight f: flightList) {
            if (f.getId() == flight.getId()) {
                if (f.addPassenger(passenger)) {
                    addToFlightMap(passenger, flight);
                    return "Passenger " +
                            passenger.getName() +
                            " successfully added to flight " +
                            flight.getId() +
                            " with destination " +
                            flight.getDestination() + ".";
                }
                else {
                    return "Something has gone wrong. Passenger " +
                            passenger.getName() +
                            " may have already booked this flight.";
                }
            }
        }
        return "Something has gone wrong. Please try again.";
    }
    // ----- Passenger Book Flight Function ---------------------------------------------------------------------------

    public static void addToFlightMap(Passenger passenger, Flight flight) {
        if (!flightListForPrintToFile.containsKey(passenger.getUniqueId())){
            flightListForPrintToFile.put(passenger.getUniqueId(), new ArrayList<>());
        }
        flightListForPrintToFile.get(passenger.getUniqueId()).add(flight);
    }


    // ------ SEARCH FLIGHT -------------------------------------------------------------------------------------------
    public static void searchFlight(String destination) {
        ArrayList<Flight> foundFlight = new ArrayList<>();

        flightList.forEach(flight -> {
            if (destination.equalsIgnoreCase(flight.getDestination())){
                foundFlight.add(flight);
            }
        });

        printSearchResult(foundFlight);
    }

    public static void searchFlight(Integer id) {
        ArrayList<Flight> foundFlight = new ArrayList<>();

        flightList.forEach(flight -> {
            if (flight.getId() == id) {
                foundFlight.add(flight);
            }
        });

        printSearchResult(foundFlight);
    }

    public static void printSearchResult(ArrayList<Flight> foundFlight) {
        if (!foundFlight.isEmpty()) {
            System.out.println("Flight(s) found.");
            for (Flight flight: foundFlight) {
                System.out.println(flight.toString());
            }
            return;
        }
        System.out.println("No flight found! Please try again.");
    }
    // ------ SEARCH FLIGHT -------------------------------------------------------------------------------------------


    // ----------- TEST -----------------------------------------------------------------------------------------------

    // Test
    public static void passengerBookFlightTest_addNew() {
        flightList = Flight.flightList();
        flightListForPrintToFile = new HashMap<>();

        System.out.println(passengerBookFlight(passenger2, flightList.get(0)));

        System.out.println("--- ArrayList");
        System.out.println(flightList.toString());
        System.out.println("--- HashMap");
        System.out.println(flightListForPrintToFile);
    }

    // Test
    public static void passengerBookFlightTest_addRepeat() {
        flightList = Flight.flightList();
        flightListForPrintToFile = new HashMap<>();

        System.out.println(passengerBookFlight(passenger2, flightList.get(0)));
        System.out.println(passengerBookFlight(passenger2, flightList.get(0)));

        System.out.println("--- ArrayList");
        System.out.println(flightList.toString());
        System.out.println("--- HashMap");
        System.out.println(flightListForPrintToFile);
    }

    // Test
    public static void passengerBookFlightTest_multiplePassengerBookTheSameFlight() {
        flightList = Flight.flightList();
        flightListForPrintToFile = new HashMap<>();

        System.out.println(passengerBookFlight(passenger, flightList.get(0)));
        System.out.println(passengerBookFlight(passenger2, flightList.get(0)));

        System.out.println("--- ArrayList");
        System.out.println(flightList.toString());
        System.out.println("--- HashMap");
        System.out.println(flightListForPrintToFile);
    }

    // Test
    public static void passengerBookFlightTest_multiplePassengerBookDifferentFlight() {
        flightList = Flight.flightList();
        flightListForPrintToFile = new HashMap<>();

        System.out.println(passengerBookFlight(passenger, flightList.get(0)));
        System.out.println(passengerBookFlight(passenger2, flightList.get(1)));

        System.out.println("--- ArrayList");
        System.out.println(flightList.toString());
        System.out.println("--- HashMap");
        System.out.println(flightListForPrintToFile);
    }

    // Test
    public static void searchFlightTest_ByDestination() {
        flightList = Flight.flightList();
        searchFlight("Berlin");
    }

    // Test
    public static void searchFlightTest_ById() {
        flightList = Flight.flightList();
        searchFlight(2);
    }

    // ----------- TEST -----------------------------------------------------------------------------------------------
}
