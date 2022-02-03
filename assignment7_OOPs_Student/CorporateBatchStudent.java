package assignment.assignment7_OOPs_Student;

public class CorporateBatchStudent extends Student{

    public  CorporateBatchStudent(Student student){
        setId(student.getId());
        setName(student.getName());
        setPhone(student.getPhone());
        setAddress(student.getAddress());
        setCourse("Corporate Batch");
    }

    public double CalculateFee(){
        return 120.00;
    }
}
