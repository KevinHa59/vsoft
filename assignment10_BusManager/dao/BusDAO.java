package assignment.assignment10_BusManager.dao;

import java.util.List;

import assignment.assignment10_BusManager.pojo.Bus;

public interface BusDAO {
    void addBus();
    List<Bus> viewAllBuses();
    Bus viewBus();
    void updateBus();
    void deleteBus();
}
