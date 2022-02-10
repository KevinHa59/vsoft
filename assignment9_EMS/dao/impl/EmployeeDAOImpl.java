package assignment.assignment9_EMS.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import assignment.assignment9_EMS.dao.EmployeeDAO;
import assignment.assignment9_EMS.pojo.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
    List<Employee> employees = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // custom input
    int setInt(String message){
        System.out.print(message);
        return sc.nextInt();
    }
    String setString(String message){
        System.out.print(message);
        return sc.next();
    }

    @Override
    public void addEmployee() {
        int choice = 1;
        while(choice == 1){
            int eno = setInt("-Enter Employee Number: ");
            String name = setString("-Enter Name: ");
            String address = setString("-Enter Address: ");
            int phone = setInt("-Enter Phone Number: ");
            String email = setString("-Enter Email: ");
            employees.add(new Employee(eno,name,address,phone,email));
            System.out.println("+++Employee Added+++");
            System.out.println("Add another employee?\n1) Yes\n2) No");
            System.out.print("-Enter Your Selection: ");
            choice = sc.nextInt();
        }
    }

    @Override
    public List<Employee> viewAllEmployee() {
        return employees;
    }

    @Override
    public Employee viewEmployee() {
        int eno = setInt("-Enter Employee Number: ");
        for(Employee e : employees){
            if(e.getEno() == eno){
                return e;
            }
        }
        return null;
    }

    @Override
    public void updateEmployee() {
        Employee e = viewEmployee();

        if(e != null){
            int index = employees.indexOf(e);
            employees.get(index).setEname(setString("-Enter Name: "));
            employees.get(index).setEaddress(setString("-Enter Address: "));
            employees.get(index).setMobileNumber(setInt("-Enter Phone Number: "));
            employees.get(index).setEmail(setString("-Enter Email: "));
            System.out.println("+++Employee Updated+++");
        }else {
            System.out.println("+++Employee does not exist+++");
        }
    }

    @Override
    public void deleteEmployee() {
        Employee e = viewEmployee();
        if(e!= null){

            employees.remove(e);
            System.out.println("+++Deleted Employee+++");
        }else {
            System.out.println("+++Employee not found+++");
        }

    }
}
