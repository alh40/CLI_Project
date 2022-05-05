import java.util.*;

public class Flight {

    private String destination;
    private int id;
    private ArrayList<Passenger> passengerList;


//    public Flight(String destination, int id, ArrayList<Passenger> passengerList) {
    public Flight(String destination, int id) {
        this.destination = destination;
        this.id = id;
        this.passengerList = new ArrayList<>();
    }

    private static ArrayList<Integer> setUniqueId(){
        LinkedHashSet<Integer> uniqueIdSet = new LinkedHashSet<>();
        Random uniqueId = new Random();

        while(uniqueIdSet.size() < 1000){
            uniqueIdSet.add(uniqueId.nextInt(1000 - 0 + 1));
        }
        ArrayList<Integer> uniqueIdList = new ArrayList<>();
        uniqueIdList.addAll(uniqueIdSet);

        return uniqueIdList;
    }


    public static ArrayList<Flight> flightList() {
        ArrayList<Flight> flights = new ArrayList<>();

        Flight flight1 = new Flight("Lisbon", 1);
        Flight flight2 = new Flight("London", 2);
        Flight flight3 = new Flight("Paris", 3);
        Flight flight4 = new Flight("Berlin", 4);
        Flight flight5 = new Flight("Berlin", 5);

        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);
        flights.add(flight5);

        return flights;
    }

    public String getDestination() {
        return this.destination;
    }

    @Override
    public String toString() {
//        return "Flight{" +
//                "destination='" + destination + '\'' +
//                ", id=" + id +
//                ", passengerList=" + passengerList +
//                '}';
        return  "Flight Destination: " + destination +
                " - " + "ID: " + id +
                " - " + "Passenger List: " + passengerList + "\r\n";
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    public boolean addPassenger(Passenger passenger) {
        if (passengerList.contains(passenger)) {
            return false;
        }
        this.passengerList.add(passenger);
        return true;
    }

    public void setPassengerList(ArrayList<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public static void displayAllAvailableFlights(ArrayList<Flight> flightList) {
        System.out.println("All Available Flights: ");
        System.out.println(flightList);
    }

    public static void cancelFlight(Flight flightObject, ArrayList<Flight> flightList){

        flightList.remove(flightObject);
    }

}
