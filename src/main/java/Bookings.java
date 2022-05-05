import java.io.*;
import java.util.Map;
import java.util.Scanner;


public class Bookings {

        public static void writeFile() throws IOException{

            File bookings = new File("/Users/Alex/Documents/Bookings.txt");

            bookings.createNewFile();

            BufferedWriter writeBookings = new BufferedWriter(new FileWriter(bookings));

            for(int i = 0; i < Main.fileOutput.size(); i++){
                writeBookings.write(Main.fileOutput.get(i));
                writeBookings.newLine();
            }

            writeBookings.flush();

                writeBookings.close();

        }

        public static void readFile() throws FileNotFoundException {

            File bookings = new File("/Users/Alex/Documents/Bookings.txt");

            Scanner scanner = new Scanner(bookings);

            while(scanner.hasNextLine()){

                System.out.println(scanner.nextLine());
            }
        }



}

