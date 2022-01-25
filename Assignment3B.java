package assignment;

import java.util.Scanner;

// Main Class
public class Assignment3B {
    static int totalBill = 0;

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        mainMenu();
    }

    static void displayMenu(String[] menu){
        String design = "";

        design += "*******Menu*******";
        for(int i = 0; i < menu.length; i++){
            design += "\n"+(i+1)+") " + menu[i];
        }
        design += "\n******************";

        System.out.println(design);
    }

    static void mainMenu(){
        String[] menuItem = new String[]{"Birayni", "Drinks", "IceCream", "Bill", "Exit"};
        displayMenu(menuItem);
        System.out.print("Enter your selection: ");
        int selection = sc.nextInt();

        switch (selection){
            case 1:
                Birayni.birayniMenu();
                break;
            case 2:
                Drinks.drinksMenu();
                break;
            case 3:
                IceCream.iceCreamMenu();
                break;
            case 4:
                displayBill();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Please number between 1-5 only");
                mainMenu();
        }

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

// Class Birayni
class Birayni{
    static int chickenBnQty;
    static int chickenBnPrz = 8;
    static int vegBnQty;
    static int vegBnPrz = 6;
    static int fishBnQty;
    static int fishBnPrz = 9;

    static void birayniMenu(){
        String[] menuItem = new String[]{"ChickenBn", "VegBn", "FishBn", "Back"};
        Assignment3B.displayMenu(menuItem);
        System.out.print("Enter your selection: ");
        int selection = Assignment3B.sc.nextInt();

        switch (selection){
            case 1:
            	Assignment3B.getInput(chickenBnQty, chickenBnPrz);
                break;
            case 2:
            	Assignment3B.getInput(vegBnQty, vegBnPrz);
                break;
            case 3:
            	Assignment3B.getInput(fishBnQty, fishBnPrz);
                break;
            case 4:
            	Assignment3B.mainMenu();
                break;
            default:
                System.out.println("Please number between 1-4 only");

        }
        birayniMenu();
    }
}

// Class Drinks
class Drinks{

    static void drinksMenu(){
        String[] menuItem = new String[]{"Soft Drinks", "Hot Drinks", "Back"};
        Assignment3B.displayMenu(menuItem);
        System.out.print("Enter your selection: ");
        int selection = Assignment3B.sc.nextInt();

        switch (selection){
            case 1:
            	SoftDrinks.softDrinksMenu();
                break;
            case 2:
            	HotDrinks.hotDrinksMenu();
                break;
            case 3:
            	Assignment3B.mainMenu();
                break;
            default:
                System.out.println("Please number between 1-3 only");

        }
        drinksMenu();
    }
}

// Class Soft Drinks
class SoftDrinks{
    static int spriteQty;
    static int spritePrz = 3;
    static int thumsUpQty;
    static int thumsUpPrz = 4;

    static void softDrinksMenu(){
        String[] menuItem = new String[]{"Sprite", "Thums Up", "Back"};
        Assignment3B.displayMenu(menuItem);
        System.out.print("Enter your selection: ");
        int selection = Assignment3B.sc.nextInt();

        switch (selection){
            case 1:
            	Assignment3B.getInput(spriteQty, spritePrz);
                break;
            case 2:
            	Assignment3B.getInput(thumsUpQty, thumsUpPrz);
                break;
            case 3:
            	Drinks.drinksMenu();
                break;
            default:
                System.out.println("Please number between 1-3 only");
                softDrinksMenu();
        }
    }
}

// Class Hot Drinks
class HotDrinks{
    static int teaQty;
    static int teaPrz = 3;
    static int coffeeQty;
    static int coffeePrz = 5;

    static void hotDrinksMenu(){
        String[] menuItem = new String[]{"Tea", "Coffee", "Back"};
        Assignment3B.displayMenu(menuItem);
        System.out.print("Enter your selection: ");
        int selection = Assignment3B.sc.nextInt();

        switch (selection){
            case 1:
            	Assignment3B.getInput(teaQty, teaPrz);
                break;
            case 2:
            	Assignment3B.getInput(coffeeQty, coffeePrz);
                break;
            case 3:
            	Drinks.drinksMenu();
                break;
            default:
                System.out.println("Please number between 1-3 only");
                hotDrinksMenu();
        }
    }
}

// Class IceCream
class IceCream{
    static int butterQty;
    static int butterPrz = 6;
    static int vanilaQty;
    static int vanilaPrz = 7;

    static void iceCreamMenu(){
        String[] menuItem = new String[]{"Butter IceCream", "Vanila IceCream", "Back"};
        Assignment3B.displayMenu(menuItem);
        System.out.print("Enter your selection: ");
        int selection = Assignment3B.sc.nextInt();

        switch (selection){
            case 1:
            	Assignment3B.getInput(butterQty, butterPrz);
                break;
            case 2:
            	Assignment3B.getInput(vanilaQty, vanilaPrz);
                break;
            case 3:
            	Assignment3B.mainMenu();
                break;
            default:
                System.out.println("Please number between 1-3 only");

        }
        iceCreamMenu();
    }
}
