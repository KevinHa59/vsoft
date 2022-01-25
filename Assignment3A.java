package assignment;

import java.util.Scanner;

public class Assignment3A {
    static Scanner sc = new Scanner(System.in);
    static int bondaQty = 0;
    static int bondaPrz = 5;
    static int dosaQty = 0;
    static int dosaPrz = 6;
    static int idlyQty = 0;
    static int idlyPrz = 7;
    static int totalBill = 0;
    public static void main(String[] args) {
        mainMenu();
    }
    static void displayMenu(String[] menu){
        String design = "";

        design += "******************";
        for(int i = 0; i < menu.length; i++){
            design += "\n"+(i+1)+") " + menu[i];
        }
        design += "\n******************";

        System.out.println(design);
    }

    static void mainMenu(){
        String[] menuItem = new String[]{"Bonda", "Dosa", "Idly", "Bill", "Exit"};
        displayMenu(menuItem);
        System.out.print("Enter your selection: ");
        int selection = sc.nextInt();

        switch (selection){
            case 1:
                getInput(bondaQty, bondaPrz);
                break;
            case 2:
                getInput(dosaQty, dosaPrz);
                break;
            case 3:
                getInput(idlyQty, idlyPrz);
                break;
            case 4:
                displayBill();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Please number between 1-5 only");
        }
        mainMenu();
    }

    static void getInput(int kind, int priceEach){
        System.out.print("How many order: ");
        int qty = sc.nextInt();
        kind += qty;
        totalBill += qty * priceEach;
    }

    static void displayBill(){
        System.out.println("Total Bill: $" + totalBill);
        mainMenu();
    }
}
