package DAO;

import pojo.Employee;

import java.util.List;

public interface EmployeeDAO {
    void addEmployee(Employee employee);
    List<Employee> viewAllEmployees();
    Employee searchEmployee(int id);
    boolean deleteEmployee(int id);
}
