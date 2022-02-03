package assignment.assignment7_OOPs_Student;

public class CorporateWeekendBatchStudent extends Student {

    public CorporateWeekendBatchStudent(Student student){
        setId(student.getId());
        setName(student.getName());
        setPhone(student.getPhone());
        setAddress(student.getAddress());
        setCourse("Corporate Weekend Batch");
    }

    public double CalculateFee(){
        return 270.00;
    }
}
