package assignment.assignment10_BusManager.dao.impl;

import java.util.List;
import java.util.Scanner;

import assignment.assignment10_BusManager.dao.CustomerDAO;
import assignment.assignment10_BusManager.pojo.Bus;

public class CustomerDAOImpl implements CustomerDAO {
    private Bus b;
    Scanner sc = new Scanner(System.in);

    // custom input
    int toInt(String message){
        System.out.print(message);
        return sc.nextInt();
    }
    String toString(String message){
        System.out.print(message);
        return sc.next();
    }


    @Override
    public List<Bus> viewAllBuses() {
        return BusDAOImpl.buses;
    }

    @Override
    public Bus viewBusBooked() {
        return b;
    }

    @Override
    public void bookTicket() {
        List<Bus> buses = BusDAOImpl.getBuses();
        if(buses.size() == 0) {
            System.out.println("There is no bus available");
            return;
        }

        System.out.println("Bus List: ");
        for(Bus b : buses){
            System.out.println(b);
        }
        int busNo = toInt("-Enter Bus Number to book: ");
        for(Bus b : buses){
            if(b.getbNo() == busNo){
                this.b = b;
                System.out.println("+++Book bus success+++");
                break;
            }
        }
    }

    @Override
    public void cancelTicket() {
        if(b == null){
            System.out.println("You do not have any bus ticket to cancel.");
            return;
        }
        b = null;
    }
}
