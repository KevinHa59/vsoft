package ProductDAO;

import pojo.Product;

import java.util.List;

public interface ProductDao {

    void addProduct(Product product);
    List<Product> viewAllProducts();
    Product viewProduct(int id);
    boolean deleteProduct(int id);
}
