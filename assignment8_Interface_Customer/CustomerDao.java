package assignment.assignment8_Interface_Customer;

public interface CustomerDao {
    void addCustomer(Customer customer);
    Customer[] viewAllCustomers();
    Customer viewCustomer(String name);
}
