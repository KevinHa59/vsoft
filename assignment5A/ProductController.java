package assignment.assignment5A;

import java.util.Arrays;

public class ProductController {

    private Product[] products;

    public ProductController() {
        products = new Product[]{};
    }

    public void addProduct(Product product){
        Product[] tempProducts = Arrays.copyOf(products, products.length+1);
        tempProducts[tempProducts.length-1] = product;
        products = tempProducts;
    }

    public Product[] getAllProducts(){
        return products;
    }

    public Product viewProduct(String name){
        for(int i = 0; i < products.length; i++){
            if(products[i].getName().equals(name)){
                return products[i];
            }
        }

        return null;
    }
}
