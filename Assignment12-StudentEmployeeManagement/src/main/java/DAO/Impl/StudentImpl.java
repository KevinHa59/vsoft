package DAO.Impl;

import DAO.StudentDAO;
import Ultility.SessionUlitily;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Student;
import javax.persistence.Query;
import java.util.List;

public class StudentImpl implements StudentDAO {
    private Session ses = SessionUlitily.getSession();
    Transaction tx = ses.beginTransaction();

    public void addStudent(Student student) {
        ses =SessionUlitily.getSession();
        ses.save(student);
        ses.close();

    }

    public List<Student> viewAllStudents() {
        ses = SessionUlitily.getSession();
        Query query = ses.createQuery("from Student");
        List<Student> students = query.getResultList();
        return students;
    }


    public Student searchStudent(int id) {
        ses = SessionUlitily.getSession();
        Query query = ses.createQuery("from Student where id=:sId");
        query.setParameter("sId", id);
        Student student = (Student) query.getSingleResult();
        return student;
    }


    public boolean deleteStudent(int id) {
        ses = SessionUlitily.getSession();
        tx = ses.beginTransaction();
        Query query = ses.createQuery("delete Student where id=:sId");
        query.setParameter("sId", id);
        int count = query.executeUpdate();
        tx.commit();
        if(count > 0){
            return true;
        }
            return false;

    }
    
    
}
