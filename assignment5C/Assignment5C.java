package assignment.assignment5C;

import java.util.Scanner;

public class Assignment5C {
    static Scanner sc = new Scanner(System.in);
    static StudentController studentController = new StudentController();

    public static void main(String[] args) {
        mainMenu();
    }

    // custom input
    static int setInt(String message){
        System.out.print(message);
        return sc.nextInt();
    }
    static Long setLong(String message){
        System.out.print(message);
        return sc.nextLong();
    }
    static String setString(String message){
        System.out.print(message);
        return sc.next();
    }

    // display menu
    static void displayMenu(String[] items){
        String menu = "**************";
        int index = 1;
        for(String i : items){
            menu += "\n" + index +") " + i;
            index++;
        }
        menu += "\n**************";
        //menu += "\nEnter Your Selection: ";
        System.out.println(menu);
    }

    // main menu
    static void mainMenu(){
        String[] items = {"Student", "Exit"};
        displayMenu(items);
        int selection = setInt("Enter Your Selection: ");
        switch (selection){
            case 1:
                controllerMenu();
                break;
            case 2:
                System.exit(0);
                break;
        }
        mainMenu();
    }

    // controller menu
    static  void controllerMenu(){
        String[] items = {"Add Student", "View All Students", "Search Student","Update Student","Delete Student", "Back"};
        displayMenu(items);
        int selection = setInt("Enter Your Selection: ");
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
                updateStudent();
                break;
            case 5:
                deleteStudent();
                break;
            case 6:
                mainMenu();
                break;
        }

        controllerMenu();
    }

    // Add Student
    static void addStudent(){
        Long id = setLong("-Enter Student No: ");
        String name = setString("-Enter Name: ");
        String address = setString("-Enter Address: ");
        Long phone = setLong("-Enter Phone: ");
        String email = setString("-Enter Email: ");
        studentController.addStudent(new Student(id, name, address, email, phone));
    }

    // view all student
    static void viewAllStudent(){
        if(studentController.viewAllStudent().length == 0){
            System.out.println("There is no student");
            return;
        }
        for(Student s : studentController.viewAllStudent()){
            System.out.println(s);
        }
    }

    // search student
    static void searchStudent(){
        String name = setString("-Enter Student Name to Search: ");
        Student student = studentController.searchStudent(name);
        if(student == null){
            System.out.println("Student " + name + " is not existed");
            return;
        }
        System.out.println(student);
    }

    // update student
    static void updateStudent(){
        String name = setString("-Enter Student Name need to update: ");
        Student student = studentController.searchStudent(name);
        if(student == null){
            System.out.println("Student " + name + " is not existed");
            return;
        }
        System.out.println("*Note: Enter '/' to skip update");
        String _name = setString("-Update Name '" + student.getName()+"' to: ");
        String address = setString("-Update Address '" +student.getAddress()+"' to: ");
        String phone = setString("-Update Phone '" + student.getPhone() + "' to: ");
        String email = setString("-Update Email '" + student.getEmail() + "' to: ");
        if(!_name.equals("/")) student.setName(_name);
        if(!address.equals("/")) student.setAddress(address);
        if(!phone.equals("/")) student.setPhone(Long.parseLong(phone));
        if(!email.equals("/")) student.setEmail(email);

        boolean status = studentController.updateStudent(student.getNo(), student);
        if(status == true)
            System.out.println("Update Student Success!");
        else
            System.out.println("Update Student fail!");
    }

    // delete student
    static void deleteStudent(){
        String name = setString("-Enter Student Name need to delete: ");
        boolean status =  studentController.deleteStudent(name);
        if(status == true)
            System.out.println("Delete Student Success!");
        else
            System.out.println("Delete Student fail! Student is not existed");

    }
}
