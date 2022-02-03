package assignment.assignment7_OOPs_Student;

public class FastTrackBatchStudent extends Student{

    public FastTrackBatchStudent(Student student){
       setId(student.getId());
       setName(student.getName());
       setPhone(student.getPhone());
       setAddress(student.getAddress());
       setCourse("Fast Track Batch");
    }

    public double CalculateFee(){
        return 300.00;
    }
}
