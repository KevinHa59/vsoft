package assignment.assignment5C;

import java.util.Arrays;
import java.util.Scanner;

public class StudentController {

    static Student[] students;
    static Scanner sc = new Scanner(System.in);

    public StudentController(){
        students = new Student[]{};
    }

    //add Student
    public void addStudent(Student student){
        Student[] temp = Arrays.copyOf(students, students.length+1);
        temp[temp.length-1] = student;
        students = temp;
    }

    //view all student
    public Student[] viewAllStudent(){
        return students;
    }

    //search student
    public Student searchStudent(String name){
        for(Student i : students){
            if(i.getName().equals(name)){
                return i;
            }
        }

        return null;
    }

    // update student
    public boolean updateStudent(Long no, Student student){
        for(int i = 0; i < students.length; i++){
            if(students[i].getNo() == no){
                students[i] = student;
                return true;
            }
        }

        return false;
    }

    // delete student
    public boolean deleteStudent(String name){
        if(searchStudent(name) == null){
            return false;
        }

        Student[] temp = new Student[students.length-1];
        int counter = 0;
        for(int i = 0; i<students.length; i++){
            if(!students[i].getName().equals(name)){
                temp[counter] = students[i];
                counter++;
            }
        }
        students = temp;
        return true;
    }

}
