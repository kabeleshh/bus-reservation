package BusRev;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Bus> busList = new ArrayList<Bus>();
        busList.add(new Bus(1009, 2, true));
        busList.add(new Bus(1010, 24, false));
        busList.add(new Bus(1011, 36, true));

        ArrayList<Booking> bookings = new ArrayList<Booking>();

        // Display available buses
        for (Bus b : busList) {
            b.busDisplay();
        }

        int opt = 1;
        while (opt == 1) {
            System.out.println("Press 1 to book ----- Press any other key to Exit");
            try {
                opt = s.nextInt();
                if (opt == 1) {
                    Booking booking = new Booking();
                    if (booking.isAvailable(bookings,busList)) {
                        bookings.add(booking);
                        System.out.println("Booking Confirmed...");
                    } else {
                        System.out.println("Sorry, the bus is fully booked or unavailable on this date.");
                    }
                } else {
                    System.out.println("Thank you for using the service.");
                    break; // Exit loop
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                s.next(); // Clear the invalid input
            }
            
        }
        

        s.close();
    }
}
