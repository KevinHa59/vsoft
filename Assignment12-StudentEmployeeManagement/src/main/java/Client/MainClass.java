package Client;

import DAO.Impl.EmployeeImpl;
import DAO.Impl.StudentImpl;
import pojo.Address;
import pojo.Employee;
import pojo.Student;

import java.util.List;
import java.util.Scanner;

public class MainClass {
    static StudentImpl student = new StudentImpl();
    static EmployeeImpl employee = new EmployeeImpl();

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        MainMenu();
    }

    //Custom Input
    static int toInt(String mes){
        System.out.print(mes);
        return sc.nextInt();
    }
    static String toString(String mes){
        System.out.print(mes);
        return sc.next();
    }
    static Double toDouble(String mes){
        System.out.print(mes);
        return sc.nextDouble();
    }
    static void log(String mes){
        System.out.println(mes);
    }

    static void MainMenu(){
        log("----------------------");
        log("1) Student\n2) Employee\n3) Exit");
        log("----------------------");

        int selection = toInt("Enter Your Selection: ");
        switch (selection){
            case 1:
                StudentMenu();
                break;
            case 2:
                EmployeeMenu();
                break;
            case 3:
                System.exit(0);
        }
        log(">> Enter Selection between 1-3 only.");
        MainMenu();
    }

    static void StudentMenu(){
        log("----------------------");
        log("1) Add Student\n2) View All Student\n3) Search Student\n4) Delete Student\n5) Back");
        log("----------------------");

        int selection = toInt("Enter Your Selection: ");
        switch (selection){
            case 1:
                addStudent();
                break;
            case 2:
                viewAllStudent();
                break;
            case 3:
                searchStudent();
                break;
            case 4:
                deleteStudent();
                break;
            case 5:
                MainMenu();
                break;
            default:
                log(">> Enter Selection between 1-3 only.");
        }

        StudentMenu();
    }

    static void EmployeeMenu(){
        log("----------------------");
        log("1) Add Employee\n2) View All Employee\n3) Search Employee\n4) Delete Employee\n5) Back");
        log("----------------------");

        int selection = toInt("Enter Your Selection: ");
        switch (selection){
            case 1:
                addEmployee();
                break;
            case 2:
                viewAllEmployee();
                break;
            case 3:
                searchEmployee();
                break;
            case 4:
                deleteEmployee();
                break;
            case 5:
                MainMenu();
                break;
            default:
                log(">> Enter Selection between 1-3 only.");
        }
        EmployeeMenu();
    }

    // Student function
    static void addStudent(){
        Student st = new Student();
        Address ad = new Address();
        st.setName(toString("Enter Student Name: "));
        st.setCourseFee(toDouble("Enter Course Fee: "));

        ad.setHouseNumber(toInt("Enter Address Number: "));
        ad.setStreet(toString("Enter Street Name: "));
        st.setAddress(ad);
        student.addStudent(st);
    }

    static void viewAllStudent(){
        List<Student> students = student.viewAllStudents();
        if(students.size() > 0){
            for(Student s : students){
                System.out.println(s);
            }
        }else {
            log("There is no student");
        }
    }

    static void searchStudent(){
        int id = toInt("Enter Student ID: ");
        Student _student = student.searchStudent(id);
        if(_student != null){
            System.out.println(_student);
        }else {
            log("Student not found");
        }
    }

    static void deleteStudent(){
        int id = toInt("Enter Student ID: ");
        boolean deleted = student.deleteStudent(id);
        if(deleted == true){
            log("Student deleted");
        }else {
            log("Student not found");
        }
    }

    // Employee function
    static void addEmployee(){
        Employee em = new Employee();
        Address ad = new Address();
        em.setName(toString("Enter Employee Name: "));
        em.setSalary(toDouble("Enter Salary: "));
        em.setDesignation(toString("Enter Position: "));

        ad.setHouseNumber(toInt("Enter Address Number: "));
        ad.setStreet(toString("Enter Street Name: "));
        em.setAddress(ad);
        employee.addEmployee(em);
    }

    static void viewAllEmployee(){
        List<Employee> employees = employee.viewAllEmployees();
        if(employees.size() > 0){
            for(Employee s : employees){
                System.out.println(s);
            }
        }else {
            log("There is no employee");
        }
    }

    static void searchEmployee(){
        int id = toInt("Enter Employee ID: ");
        Employee _employee = employee.searchEmployee(id);
        if(_employee != null){
            System.out.println(_employee);
        }else {
            log("Employee not found");
        }
    }

    static void deleteEmployee(){
        int id = toInt("Enter Employee ID: ");
        boolean deleted = employee.deleteEmployee(id);
        if(deleted == true){
            log("Employee deleted");
        }else {
            log("Employee not found");
        }
    }
}
