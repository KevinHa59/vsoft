package assignment.assignment5A;

import java.util.Scanner;

public class Assignment5A {

    static Scanner sc = new Scanner(System.in);
    static ProductController pc = new ProductController();
    public static void main(String[] args) {
        mainMenu();
    }

    static void displayMenu(String[] items){
        String menu = "******************";
        int index = 1;
        for(String i : items){
            menu += "\n" + index + ") " + i;
            index++;
        }
        menu += "\n******************";
        menu += "\nEnter your selection: ";
        System.out.print(menu);
    }

    // main menu
    static  void mainMenu(){
        String[] menuItem = {"Product", "Exit"};
        displayMenu(menuItem);
        int selection = sc.nextInt();
        switch (selection){
            case 1:
                controllerMenu();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                mainMenu();
                break;
        }
    }

    // Controller menu
    static  void controllerMenu(){
        String[] menuItem = {"Add Product", "View All Products", "View Product", "Back"};
        displayMenu(menuItem);
        int selection = sc.nextInt();
        switch (selection){
            case 1:
                addProduct();
                break;
            case 2:
                viewAllProducts();
                break;
            case 3:
                viewProduct();
                break;
            case 4:
                mainMenu();
                break;
        }
        controllerMenu();
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
    static Double setDouble(String message){
        System.out.print(message);
        return sc.nextDouble();
    }

    // add product
    static  void addProduct(){
        Long id = setLong("-Enter Product ID: ");
        String name = setString("-Enter Product Name: ");
        int qty = setInt("-Enter Product Quantity: ");
        double price = setDouble("-Enter Product Price: ");
        pc.addProduct(new Product(id, name, qty, price));
    }

    // view all Products
    static void viewAllProducts(){
        Product[] products = pc.getAllProducts();
        for(Product i : products){
            System.out.println(i);
        }
    }

    // view product
    static void viewProduct(){
        String name = setString("Enter Product Name: ");
        Product product = pc.viewProduct(name);
        if(product != null){
            System.out.println(product);
        }else {
            System.out.println("Could not find the product '" + name+"'");
        }
    }
}
