package assignment.assignment8_Interface_Customer;

import java.util.Arrays;

public class CustomerDaoImpl implements CustomerDao{

    private Customer[] customers;


    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public CustomerDaoImpl(){
        customers = new Customer[0];
    }

    @Override
    public void addCustomer(Customer customer) {
        Customer[] _temp = Arrays.copyOf(customers, customers.length+1);
        _temp[_temp.length-1] = customer;
        setCustomers(_temp);

    }

    @Override
    public Customer[] viewAllCustomers() {
        return customers;
    }

    @Override
    public Customer viewCustomer(String name) {
        for(Customer c: customers){
            if(c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }
}
