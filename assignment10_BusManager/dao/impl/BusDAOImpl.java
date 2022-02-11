package assignment.assignment10_BusManager.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import assignment.assignment10_BusManager.dao.BusDAO;
import assignment.assignment10_BusManager.pojo.Bus;

public class BusDAOImpl implements BusDAO {

    Scanner sc = new Scanner(System.in);

    static List<Bus> buses = new ArrayList<>();

    public static List<Bus> getBuses() {
        return buses;
    }

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
    public void addBus() {
        int no = toInt("-Enter Bus Number: ");
        String from = toString("-Enter Departure: ");
        String to = toString("-Enter Destination: ");
        String startTime = toString("-Enter Start Time 'hh:mm': ");
        buses.add(new Bus(no, from, to, startTime));
        System.out.println("+++Add bus success+++");
    }

    @Override
    public List<Bus> viewAllBuses() {
        return buses;
    }

    @Override
    public Bus viewBus() {
        int busNumber = toInt("-Enter Bus Number: ");
        for(Bus b : buses){
            if(b.getbNo() == busNumber){
                return b;
            }
        }
        return null;
    }

    @Override
    public void updateBus() {
        Bus b = viewBus();
        if(b == null){
            System.out.println("Bus does not exist");
        }else {
            int busIndex = buses.indexOf(b);
            buses.get(busIndex).setbFrom(toString("-Enter Departure: "));
            buses.get(busIndex).setbTo(toString("-Enter Destination: "));
            buses.get(busIndex).setbStart(toString("-Enter Start Time 'hh:mm': "));
            System.out.println("+++Update bus success+++");
        }
    }

    @Override
    public void deleteBus() {
        Bus b = viewBus();
        if(b == null){
            System.out.println("Bus does not exist");
        }else {
            buses.remove(b);
            System.out.println("+++Delete bus success+++");
        }
    }
}
