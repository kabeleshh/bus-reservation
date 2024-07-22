package BusRev;

public class Bus{
    private int busNo;
    private int capacity;
    private boolean airC;
    
    Bus(int no,int cap,boolean ac){
        this.busNo = no;
        this.capacity = cap;
        this.airC = ac;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int cap){
        capacity = cap;
    }

    public int getbusNo(){
        return busNo;
    }

    public boolean getac(){
        return airC;
    }

    public void setac(boolean ac){
        airC = ac;
    }

    public void busDisplay(){
        System.out.println("Bus Number : "+busNo+" Capacity : "+capacity+" AC :"+airC);
    }
}