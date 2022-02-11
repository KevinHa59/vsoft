package assignment.assignment10_BusManager.dao;

import java.util.List;

import assignment.assignment10_BusManager.pojo.Bus;

public interface CustomerDAO {
    List<Bus> viewAllBuses();
    Bus viewBusBooked();
    void bookTicket();
    void cancelTicket();
}
