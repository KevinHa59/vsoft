package assignment.assignment7_OOPs_Employee;

public class HrDepartment extends Employee {

    public HrDepartment(Employee employee) {
        setId(employee.getId());
        setName(employee.getName());
        setdName("HR Department");
    }

    public double CalculateSalary(){
        return 3800;
    }
}
