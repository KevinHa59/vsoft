package DAO;

import pojo.Student;

import java.util.List;

public interface StudentDAO {

    void addStudent(Student student);
    List<Student> viewAllStudents();
    Student searchStudent(int id);
    boolean deleteStudent(int id);
}
