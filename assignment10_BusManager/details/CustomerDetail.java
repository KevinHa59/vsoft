package assignment.assignment10_BusManager.details;

import java.util.Scanner;

import assignment.assignment10_BusManager.Client.Client;
import assignment.assignment10_BusManager.dao.impl.CustomerDAOImpl;
import assignment.assignment10_BusManager.pojo.Bus;

public class CustomerDetail {
    Scanner sc = new Scanner(System.in);
    CustomerDAOImpl customerDAO = new CustomerDAOImpl();
    void log(String message){
        System.out.println(message);
    }
    int toInt(String message){
        System.out.print(message);
        return sc.nextInt();
    }
    String toString(String message){
        System.out.print(message);
        return sc.next();
    }
    public void menu() {

        log("**********");
        log("1) View All Buses\n2) View Booked Bus\n3) Book Ticket\n4) Cancel Ticket\n5) Back");
        log("**********");
        int select = toInt("-Enter Your Selection: ");
        switch (select) {
            case 1:
                for(Bus b : customerDAO.viewAllBuses()){
                    System.out.println(b);
                }
                break;
            case 2:
                if(customerDAO.viewBusBooked() == null){
                    System.out.println(customerDAO.viewBusBooked());
                }else {
                    System.out.println("You do not have any ticket");
                }
                break;
            case 3:
                customerDAO.bookTicket();
                break;
            case 4:
                customerDAO.cancelTicket();
                break;
            case 5:
                Client.menu();
                break;
            default:
                log("Selection between 1-5 only");
        }
        menu();
    }
}
