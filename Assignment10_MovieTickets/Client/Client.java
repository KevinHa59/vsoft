package assignment.Assignment10_MovieTickets.Client;

import java.util.Scanner;

import assignment.Assignment10_MovieTickets.details.AdminDetail;
import assignment.Assignment10_MovieTickets.details.CustomerDetail;

public class Client {
    static Scanner sc = new Scanner(System.in);
    static AdminDetail adminDetail = new AdminDetail();
    static CustomerDetail customerDetail = new CustomerDetail();

    public static void main(String[] args) {
        menu();
    }

    static void log(String message){
        System.out.println(message);
    }
    static int toInt(String message){
        System.out.print(message);
        return sc.nextInt();
    }
    static String toString(String message){
        System.out.print(message);
        return sc.next();
    }
    public static void menu() {

        log("**********");
        log("1) Admin\n2) Customer\n3) Exit");
        log("**********");
        int select = toInt("-Enter Your Selection: ");
        switch (select) {
            case 1:
                adminDetail.menu();
                break;
            case 2:
                customerDetail.menu();
                break;
            case 3:
                System.exit(0);

            default:
                log("Selection between 1-3 only");
        }
        menu();
    }
}
