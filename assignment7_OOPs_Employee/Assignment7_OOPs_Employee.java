package assignment.assignment7_OOPs_Employee;

public class Assignment7_OOPs_Employee {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Tong Ha");

        AccountDepartment accountDepartment = new AccountDepartment(employee);
        System.out.println(accountDepartment.toString() + " Salary: $" + accountDepartment.CalculateSalary());

        ItDepartment itDepartment = new ItDepartment(employee);
        System.out.println(itDepartment.toString() + " Salary: $" + itDepartment.CalculateSalary());

        HrDepartment hrDepartment = new HrDepartment(employee);
        System.out.println(hrDepartment.toString() + " Salary: $" +hrDepartment.CalculateSalary());
    }
}
