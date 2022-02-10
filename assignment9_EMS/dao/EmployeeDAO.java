package assignment.assignment9_EMS.dao;

import java.util.List;

import assignment.assignment9_EMS.pojo.Employee;

public interface EmployeeDAO {
    public void addEmployee();
    List<Employee> viewAllEmployee();
    Employee viewEmployee();
    void updateEmployee();
    void deleteEmployee();
}
