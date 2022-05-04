import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {

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

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Passenger> passengerList = new ArrayList<>();
        while (true) {
        System.out.println("Would you like to add a Passenger? y / n");
        String str = input.nextLine();

        if(str.equals("y")) {


                System.out.println("Enter your Name here: ");

                String name = input.nextLine();

                System.out.println("Enter your mobile number here: ");

                int mobileNumber = Integer.valueOf(input.nextLine());

                Passenger newPassenger = new Passenger(name, mobileNumber, setUniqueId().get(0));
                passengerList.add(newPassenger);

            }  if(str.equals("")){
                break;
            }

            System.out.println(passengerList);

        }




    }



}
