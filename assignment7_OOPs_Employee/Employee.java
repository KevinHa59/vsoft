package assignment.assignment7_OOPs_Employee;

public class Employee {
    private int id;
    private String name;
    private String dName;

    public Employee() {
    }

    public Employee(int id, String name, String dName) {
        this.id = id;
        this.name = name;
        this.dName = dName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public double CalculateSalary(){
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + dName + '\'' +
                '}';
    }
}
