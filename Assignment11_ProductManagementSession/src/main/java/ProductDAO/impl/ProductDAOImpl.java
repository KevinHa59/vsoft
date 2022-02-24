package ProductDAO.impl;

import ProductDAO.ProductDao;
import Ultility.SessionUlitily;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.persistence.Query;
import pojo.Product;

import java.util.List;



public class ProductDAOImpl implements ProductDao {

    private Session ses = SessionUlitily.getSession();
    private Transaction tx;

    public void addProduct(Product product) {
        ses = SessionUlitily.getSession();
        ses.save(product);
        ses.close();

    }

    public List<Product> viewAllProducts() {
        ses = SessionUlitily.getSession();
        Query query = ses.createQuery("from Product");
        List<Product> products = query.getResultList();
        ses.close();
        return products;
    }

    public Product viewProduct(int id) {
        ses = SessionUlitily.getSession();
        Query query = ses.createQuery("from Product where id=:pId");
        query.setParameter("pId",id);
        Product product = (Product) query.getSingleResult();
        ses.close();
        return product;
    }

    public boolean deleteProduct(int id) {
        ses = SessionUlitily.getSession();
        tx = ses.beginTransaction();
       
		Query query = ses.createQuery("delete from Product where id=:pId");
        query.setParameter("pId", id);
        int count = query.executeUpdate();
        tx.commit();
        if(count > 0){
            return true;
        }
        return false;
    }
}
