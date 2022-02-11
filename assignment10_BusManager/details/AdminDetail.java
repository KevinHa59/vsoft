package assignment.assignment10_BusManager.details;

import java.util.Scanner;

import assignment.assignment10_BusManager.Client.Client;
import assignment.assignment10_BusManager.dao.impl.BusDAOImpl;
import assignment.assignment10_BusManager.pojo.Bus;

public class AdminDetail {
    Scanner sc = new Scanner(System.in);
    BusDAOImpl busDAO = new BusDAOImpl();

    // custom input
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

    public void menu(){

        log("**********");
        log("1) Add Bus\n2) View All Buses\n3) View Bus\n4) Update Bus\n5) Delete Bus\n6) Back");
        log("**********");
        int select = toInt("-Enter Your Selection: ");
        switch (select){
            case 1:
                busDAO.addBus();
                break;
            case 2:
                for(Bus b : busDAO.viewAllBuses()){
                    System.out.println(b);
                }
                break;
            case 3:
                System.out.println(busDAO.viewBus());

                break;
            case 4:
                busDAO.updateBus();
                break;
            case 5:
                busDAO.deleteBus();
                break;
            case 6:
                Client.menu();
                break;
            default:
                log("Selection between 1-6 only");
        }
        menu();
    }

}
