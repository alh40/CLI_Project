import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Passenger {


    private String name;
    private int contactInformation;
    private int uniqueId;

    public Passenger(String name, int contactInformation, int uniqueId) {
        this.name = name;
        this.contactInformation = contactInformation;
        this.uniqueId = uniqueId;
    }

    public static ArrayList<Passenger> passengersList(){

        ArrayList<Passenger> passengerList = new ArrayList<>();
        Passenger Passenger1 = Passenger.getPassenger1();
        Passenger Passenger2 = Passenger.getPassenger2();
        Passenger Passenger3 = Passenger.getPassenger3();
        Passenger Passenger4 = Passenger.getPassenger4();

            passengerList.add(Passenger1);
            passengerList.add(Passenger2);
            passengerList.add(Passenger3);
            passengerList.add(Passenger4);

            return passengerList;
    }

    public static HashMap<Integer, Passenger> passengerHashMap(){
        ArrayList<Passenger> passengerList = Passenger.passengersList();

            HashMap<Integer, Passenger> passengerHashMap = new HashMap<>();
        passengerHashMap.put(passengerList.get(0).getUniqueId(), passengerList.get(0));
        passengerHashMap.put(passengerList.get(1).getUniqueId(), passengerList.get(1));
        passengerHashMap.put(passengerList.get(2).getUniqueId(), passengerList.get(2));
        passengerHashMap.put(passengerList.get(3).getUniqueId(), passengerList.get(3));
            return passengerHashMap;

    }


    public static Passenger getPassenger1(){
            Passenger Passenger1 = new Passenger("Alex", 01234, 01234);
            return Passenger1;
    }

    public static Passenger getPassenger2(){
        Passenger Passenger2 = new Passenger("Harry", 452834, 01235);
        return Passenger2;
    }
    public static Passenger getPassenger3() {
        Passenger Passenger3 = new Passenger("Becca", 2348234, 01236);
        return Passenger3;
    }

    public static Passenger getPassenger4() {
        Passenger Passenger4 = new Passenger("Maisha", 678234, 01237);
        return Passenger4;
    }



    public int getUniqueId() {
        return uniqueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(int contactInformation) {
        this.contactInformation = contactInformation;
    }


    @Override
    public String toString() {
        return  "Passenger: [Name:" + name + " -" +
                " Contact:" + contactInformation + " -" +
                " ID:" + uniqueId + "]";
    }
}
