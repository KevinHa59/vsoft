package assignment.assignment7_OOPs_Student;

public class Student {
    private int id;
    private String name;
    private int phone;
    private String address;
    private String course;

    public Student() {
    }

    public Student(Student student) {
        this.id = student.id;
        this.name = student.name;
        this.phone = student.phone;
        this.address = student.address;
        this.course = student.course;
    }

    public Student(int id, String name, int phone, String address, String course) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.course = course;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double CalculateFee(){
        return 0.00;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
