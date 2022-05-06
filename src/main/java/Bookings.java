import java.io.*;
import java.util.Scanner;


public class Bookings {

        public static void writeFile() throws IOException {

//            File bookings = new File("/Users/Alex/Documents/Bookings.txt");
            File bookings = new File("/Users/zhenhaining/Documents/Bookings.txt");

            bookings.createNewFile();

            BufferedWriter writeBookings = new BufferedWriter(new FileWriter(bookings));

            for(int i = 0; i < Input.fileOutput.size(); i++){
                writeBookings.write(Input.fileOutput.get(i));
                writeBookings.newLine();
            }

//            writeBookings.flush();
            writeBookings.close();
        }

        public static void readFile() throws FileNotFoundException {

//            File bookings = new File("/Users/Alex/Documents/Bookings.txt");
            File bookings = new File("/Users/zhenhaining/Documents/Bookings.txt");

            Scanner scanner = new Scanner(bookings);

            while(scanner.hasNextLine()){

                System.out.println(scanner.nextLine());
            }
        }



}

