package assignment.assignment9_EMS.pojo;

public class Employee {
    private int eno;
    private String ename;
    private String eaddress;
    private int mobileNumber;
    private String email;

    public Employee(int eno, String ename, String eaddress, int mobileNumber, String email) {
        this.eno = eno;
        this.ename = ename;
        this.eaddress = eaddress;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    public Employee() {
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEaddress() {
        return eaddress;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                ", eaddress='" + eaddress + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
