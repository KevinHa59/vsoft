package DAO.Impl;

import DAO.EmployeeDAO;
import Ultility.SessionUlitily;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Employee;
import pojo.Student;

import javax.persistence.Query;
import java.util.List;

public class EmployeeImpl implements EmployeeDAO {
    private Session ses = SessionUlitily.getSession();
    Transaction tx = ses.beginTransaction();

    public void addEmployee(Employee employee) {
        ses = SessionUlitily.getSession();
        ses.save(employee);
        ses.close();
    }

    public List<Employee> viewAllEmployees() {
        ses = SessionUlitily.getSession();
        Query query = ses.createQuery("from Employee");
        List<Employee> employees = query.getResultList();
        return employees;
    }


    public Employee searchEmployee(int id) {
        ses = SessionUlitily.getSession();
        Query query = ses.createQuery("from Employee where id=:sId");
        query.setParameter("sId", id);
        Employee employee = (Employee) query.getSingleResult();
        return employee;
    }


    public boolean deleteEmployee(int id) {
        ses = SessionUlitily.getSession();
        tx = ses.beginTransaction();
        Query query = ses.createQuery("delete Employee where id=:sId");
        query.setParameter("sId", id);
        int count = query.executeUpdate();
        tx.commit();
        if(count > 0){
            return true;
        }
        return false;

    }

}
