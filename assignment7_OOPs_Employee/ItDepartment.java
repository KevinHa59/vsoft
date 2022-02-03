package assignment.assignment7_OOPs_Employee;

public class ItDepartment extends Employee{

    public ItDepartment(Employee employee) {
        setId(employee.getId());
        setName(employee.getName());
        setdName("IT Department");
    }

    public double CalculateSalary(){
        setdName("IT Department");
        return 7200;
    }
}
