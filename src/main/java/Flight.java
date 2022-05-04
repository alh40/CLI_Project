import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;

public class Flight {

    private String destination;
    private int id;
    private ArrayList<Passenger> passengerList;


    public Flight(String destination, int id, ArrayList<Passenger> passengerList) {
        this.destination = destination;
        this.id = id;
        this.passengerList = passengerList;
    }

    public static ArrayList<Integer> setUniqueId(){
        LinkedHashSet<Integer> uniqueIdSet = new LinkedHashSet<>();
        Random uniqueId = new Random();

        while(uniqueIdSet.size() < 1000){
            uniqueIdSet.add(uniqueId.nextInt(1000 - 0 + 1));
        }
        ArrayList<Integer> uniqueIdList = new ArrayList<>();
        uniqueIdList.addAll(uniqueIdSet);

        return uniqueIdList;
    }


    public String getDestination() {
        return destination;
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

    public void setPassengerList(ArrayList<Passenger> passengerList) {
        this.passengerList = passengerList;
    }
}
