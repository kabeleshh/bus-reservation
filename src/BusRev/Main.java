package BusRev;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        ArrayList<Bus> bus = new ArrayList<Bus>();

        bus.add(new Bus(1009,2,true));

        bus.add(new Bus(1010,24,false));

        bus.add(new Bus(1011,36,true));

        ArrayList<Booking> bookings = new ArrayList<Booking>();

        for(Bus b:bus){
            b.busDisplay();
        }
        int opt = 1;
        while(opt==1){
            System.out.println("Press 1 to book ----- Press 2 to Exit");
            opt = s.nextInt();
            if(opt==1){
                Booking booking = new Booking();
                if(booking.isAvailable(bus,bookings)){
                    bookings.add(booking);
                    System.out.println("Booking Confirmed...");
                }
                else{
                    System.out.println("Sorry try with another bus or date");
                }
            }
            else if(opt==2){
                System.out.println("Thank you...");
            }
        }
        s.close();
    }

}
