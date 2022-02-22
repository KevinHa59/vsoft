package Client;

import ProductDAO.impl.ProductDAOImpl;
import pojo.Product;

import java.util.List;
import java.util.Scanner;

public class ProductMain {
    static ProductDAOImpl productDAO = new ProductDAOImpl();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        MainMenu();
    }

    //Custom input
    static int toInt(String mes){
        System.out.print(mes);
        return sc.nextInt();
    }
    static Double toDouble(String mes){
        System.out.print(mes);
        return sc.nextDouble();
    }
    static String toString(String mes){
        System.out.print(mes);
        return sc.next();
    }

    static void MainMenu(){
        System.out.println("--------------");
        System.out.println("1) Product\n2) Exit");
        System.out.println("--------------");

        int selection = toInt("Enter your action: ");
        switch (selection){
            case 1:
                ProductMenu();
                break;
            case 2:
                System.exit(0);
        }
        MainMenu();
    }

    static void ProductMenu(){
        System.out.println("--------------");
        System.out.println("1) Add Product\n2) View All Products\n3) Search Product\n4) Delete Product\n5) Back");
        System.out.println("--------------");

        int selection = toInt("Enter your action: ");
        switch (selection){
            case  1:
                AddProduct();
                break;
            case  2:
                ViewAllProduct();
                break;
            case  3:
                SearchProduct();
                break;
            case  4:
                DeleteProduct();
                break;
            case  5:
                MainMenu();
                break;
        }
        ProductMenu();
    }

    static void AddProduct(){
        String name = toString("Enter Product Name: ");
        int qty = toInt("Enter Quantity: ");
        double price = toDouble("Enter Price: ");
        productDAO.addProduct(new Product(0, name, qty,price));
    }

    static void ViewAllProduct(){
        List<Product> list = productDAO.viewAllProducts();
        if(list.size() > 0){
            list.forEach(item -> System.out.println(item));
        }else {
            System.out.println("There is no product");
        }
    }

    static void SearchProduct(){
        int id = toInt("Enter product id: ");
        Product product = productDAO.viewProduct(id);
        if(product != null){
            System.out.println(product);
        }else {
            System.out.println("Product not exist");
        }
    }

    static void DeleteProduct(){
        int id = toInt("Enter product id: ");
        boolean success = productDAO.deleteProduct(id);
        if(success == true){
            System.out.println("Delete product success");
        }else {
            System.out.println("Product not available");
        }
    }
}
