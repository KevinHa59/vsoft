package assignment.assignment8_Interface_Employee;

public class EmployeeClient {
    public static void main(String[] args) {
        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
        employeeDao.addEmployee();
        employeeDao.viewEmployee();
    }
}
