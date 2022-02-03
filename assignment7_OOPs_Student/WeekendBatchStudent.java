package assignment.assignment7_OOPs_Student;

public class WeekendBatchStudent extends Student{

    public WeekendBatchStudent(Student student){
        setId(student.getId());
        setName(student.getName());
        setPhone(student.getPhone());
        setAddress(student.getAddress());
        setCourse("Weekend Batch");
    }

    public double CalculateFee(){
        return 230.00;
    }
}
