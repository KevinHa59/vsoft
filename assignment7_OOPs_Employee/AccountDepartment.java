package assignment.assignment7_OOPs_Employee;

public class AccountDepartment extends Employee {

    public AccountDepartment(Employee employee) {
        setId(employee.getId());
        setName(employee.getName());
        setdName("Account Department");
    }

    public double CalculateSalary(){

        return 4500;
    }
}
