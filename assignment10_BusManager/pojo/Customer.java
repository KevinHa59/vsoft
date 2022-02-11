package assignment.assignment10_BusManager.pojo;

import java.util.List;

public class Customer {

    private Bus bookedBus;


    public Customer(Bus bookedBus) {
        this.bookedBus = bookedBus;
    }

    public Customer() {
    }

    public Bus getBookedBus() {
        return bookedBus;
    }

    public void setBookedBus(Bus bookedBus) {
        this.bookedBus = bookedBus;
    }


}
