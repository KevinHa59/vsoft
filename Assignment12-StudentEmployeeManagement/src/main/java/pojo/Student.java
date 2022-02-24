package pojo;


import javax.persistence.*;

@Entity
@Table (name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double courseFee;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="houseNumber", column = @Column(name = "house_number")),
            @AttributeOverride(name="street", column = @Column(name = "street_name"))

    })

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(int id, String name, double courseFee) {
        this.id = id;
        this.name = name;
        this.courseFee = courseFee;
    }

    public Student() {
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

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courseFee=" + courseFee +
                ", address=" + address +
                '}';
    }
}
