package assignment.assignment8_Interface_Customer;

import java.util.Scanner;

public class CustomerClient {
    static Scanner sc = new Scanner(System.in);
    static CustomerDaoImpl customerDao = new CustomerDaoImpl();

    public static void main(String[] args) {
        menu();
    }

    // custom input and print
    static void log(Object object){
        System.out.print(object);
    }

    static void logln(Object object){
        System.out.println(object);
    }
    static String setString(String message){
        log(message);
        return sc.next();
    }
    static int setInt(String message){
        log(message);
        return sc.nextInt();
    }


    static void menu(){
        logln("*************");
        logln("1) Add Customer\n2) View All Customer\n3) Search Customer by Name\n4) Exit");
        logln("*************");

        int selection = setInt("Enter Your Selection: ");
        switch (selection){
            case 1:
                addECustomer();
                break;
            case 2:
                viewAllCustomer();
                break;
            case 3:
                searchCustomer();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                logln("There is no selection of " + selection +". Please enter number from 1 to 4 only");
                break;
        }
        menu();
    }

    static void addECustomer(){
        Customer emp = new Customer();
        emp.setId(setInt("-Enter Customer ID: "));
        emp.setName(setString("-Enter Customer Name: "));
        emp.setAddress(setString(("-Enter Customer Address: ")));
        emp.setEmail(setString(("-Enter Customer Email: ")));
        customerDao.addCustomer(emp);
    }

    static void viewAllCustomer(){
        Customer[] customers = customerDao.viewAllCustomers();
        if(customers.length > 0){
            for(Customer c : customers){
                System.out.println(c);
            }
        }else {
            logln("There is no customer");
        }
    }

    static void searchCustomer(){
        String name = setString("-Enter Customer Name to search: ");
        Customer c = customerDao.viewCustomer(name);
        if(c != null){
            logln(c);
        }else {
            logln("Customer " + name + " does not exist");
        }
    }

}
