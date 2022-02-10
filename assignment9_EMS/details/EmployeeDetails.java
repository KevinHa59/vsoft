package assignment.assignment9_EMS.details;

import java.util.List;
import java.util.Scanner;

import assignment.assignment9_EMS.Client.EmployeeClient;
import assignment.assignment9_EMS.dao.EmployeeDAO;
import assignment.assignment9_EMS.dao.impl.EmployeeDAOImpl;
import assignment.assignment9_EMS.pojo.Employee;

public class EmployeeDetails {
    EmployeeDAO dao = new EmployeeDAOImpl();
    EmployeeClient client = new EmployeeClient();
    Scanner sc = new Scanner(System.in);
    public  void menuDetail(){
        int choice = 1;
        System.out.println("**************");
        System.out.println("1) Add Employee");
        System.out.println("2) View All Employees");
        System.out.println("3) Search Employee by Number");
        System.out.println("4) Update Employee");
        System.out.println("5) Delete Employee");
        System.out.println("6) Back");
        System.out.println("**************");

        System.out.print("-Enter Your Choice: ");
        choice = sc.nextInt();
        switch (choice){
            case 1:
                dao.addEmployee();
                break;
            case 2:
                List<Employee> employees = dao.viewAllEmployee();
                if(employees.size() >0){
                    for(Employee e : employees){
                        System.out.println(e);
                    }
                }else {
                    System.out.println("+++There is no employee+++");
                }
                break;
            case 3:
                Employee employee = dao.viewEmployee();
                if(employee != null){
                    System.out.println(employee);
                }
                else {
                    System.out.println("+++Employee not found+++");
                }
                break;
            case 4:
                dao.updateEmployee();
                break;
            case 5:
                dao.deleteEmployee();
                break;
            case 6:
                client.menu();
                break;
            default:
                System.out.print("+++1 to 6 only+++");

        }
        menuDetail();
    }


}
