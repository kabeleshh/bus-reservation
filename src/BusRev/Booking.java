package BusRev;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        passengerName = s.nextLine();

        System.out.println("Enter the Bus Number : ");
        busNo = s.nextInt();

        System.out.println("Enter the date(dd/MM/yy) : ");
        String d = s.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        try {
            date = dateFormat.parse(d);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    public boolean isAvailable(ArrayList<Bus> bus,ArrayList<Booking> bookings){
        int capacity=0;
        for(Bus b:bus){
            if(b.getbusNo() == busNo){                                         
                capacity = b.getCapacity();
            }
        }

        int booked=0;
        for(Booking book:bookings){
            if(book.busNo == busNo && book.date.equals(bookings)){
                booked++;
            }
        }
        return booked<capacity?true:false;
    }
}
