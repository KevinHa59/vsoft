package assignment.assignment5B;

import java.util.Scanner;

public class Assignment5B {

    static UserController userController = new UserController();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    // custom input
    static int setInt(String message){
        System.out.print(message);
        return sc.nextInt();
    }

    static Long setLong(String message){
        System.out.print(message);
        return sc.nextLong();
    }

    static String setString(String message){
        System.out.print(message);
        return sc.next();
    }

    // menu
    static void menu(){
        System.out.println("**************************");
        System.out.println("1) Register\n2) Login \n3) Exit");
        System.out.println("**************************");
        int selection = setInt("Enter Your Selection: ");
        switch (selection){
            case 1:
                register();
                break;
            case 2:
                login();
                break;
            case 3:
                System.exit(0);
                break;
        }
        menu();
    }

    // Register
    static void register(){
        Long id = setLong("-Enter User ID: ");
        String firstName = setString("-Enter First Name: ");
        String lastName = setString("-Enter Last Name: ");
        String email = setString("-Enter Email: ");
        String username = setString("-Enter Username: ");
        String password = setString("-Enter Password: ");
        userController.register(new User(id, firstName,lastName,email,username,password));

    }

    // Login
    static void login(){
        String username = setString("-Enter Username: ");
        String password = setString("-Enter Password: ");
        boolean check =  userController.login(username, password);
        if(check)
            System.out.println("Login Success");
        else
            System.out.println("Login fail");
    }
}
