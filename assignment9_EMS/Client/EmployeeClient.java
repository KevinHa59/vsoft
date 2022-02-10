package assignment.assignment9_EMS.Client;

import java.util.Scanner;

import assignment.assignment9_EMS.details.EmployeeDetails;

public class EmployeeClient {
    static Scanner sc = new Scanner(System.in);
    static EmployeeDetails details = new EmployeeDetails();

    public static void main(String[] args) {
        menu();

    }

    public static void menu(){
        System.out.println("*******************");
        System.out.println("1) Employee");
        System.out.println("2) Exit");
        System.out.println("*******************");
        System.out.print("-Enter Your Selection: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                details.menuDetail();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.print("+++1 to 2 only+++");
        }
        menu();

    }
}
