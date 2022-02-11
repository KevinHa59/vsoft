package assignment.Assignment10_MovieTickets.details;

import java.util.Scanner;

import assignment.Assignment10_MovieTickets.Client.Client;
import assignment.Assignment10_MovieTickets.dao.impl.CustomerDAOImpl;
import assignment.Assignment10_MovieTickets.pojo.Movie;

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

    public void menu() {

        log("**********");
        log("1) View All Movies\n2) View Booked Movie\n3) Book Ticket\n4) Cancel Ticket\n5) Back");
        log("**********");
        int select = toInt("-Enter Your Selection: ");
        switch (select) {
            case 1:
                for(Movie b : customerDAO.viewAllMovies()){
                    System.out.println(b);
                }
                break;
            case 2:
                if(customerDAO.viewTicketBooked() != null){
                    System.out.println(customerDAO.viewTicketBooked());
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
