package assignment.assignment8_Interface_Employee;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void addEmployee() {
        System.out.println("Add Employee");
    }

    @Override
    public void viewEmployee() {
        System.out.println("View Employee");
    }
}
