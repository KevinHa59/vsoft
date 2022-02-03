package assignment.assignment7_OOPs_Student;

public class Assignment7_OOPs_Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1);
        student.setName("Tong Ha");
        student.setPhone(1236541234);
        student.setAddress("123 abcd");

        FastTrackBatchStudent fastTrackBatchStudent = new FastTrackBatchStudent(student);
        System.out.println(fastTrackBatchStudent.toString() +": Fee $" + fastTrackBatchStudent.CalculateFee());
        CorporateBatchStudent corporateBatchStudent = new CorporateBatchStudent(student);
        System.out.println(corporateBatchStudent.toString() +": Fee $" + corporateBatchStudent.CalculateFee());
        WeekendBatchStudent weekendBatchStudent = new WeekendBatchStudent(student);
        System.out.println(weekendBatchStudent.toString() +": Fee $" + weekendBatchStudent.CalculateFee());
        CorporateWeekendBatchStudent corporateWeekendBatchStudent = new CorporateWeekendBatchStudent(student);
        System.out.println(corporateWeekendBatchStudent.toString() +": Fee $" + corporateWeekendBatchStudent.CalculateFee());
    }
}
