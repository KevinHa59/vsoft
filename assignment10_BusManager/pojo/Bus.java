package assignment.assignment10_BusManager.pojo;

public class Bus {
    private int bNo;
    private String bFrom;
    private String bTo;
    private String bStart;

    public Bus(int bNo, String bFrom, String bTo, String bStart) {
        this.bNo = bNo;
        this.bFrom = bFrom;
        this.bTo = bTo;
        this.bStart = bStart;
    }

    public Bus() {
    }

    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public String getbFrom() {
        return bFrom;
    }

    public void setbFrom(String bFrom) {
        this.bFrom = bFrom;
    }

    public String getbTo() {
        return bTo;
    }

    public void setbTo(String bTo) {
        this.bTo = bTo;
    }

    public String getbStart() {
        return bStart;
    }

    public void setbStart(String bStart) {
        this.bStart = bStart;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "Bus Number: " + bNo +
                ", From: '" + bFrom + '\'' +
                ", To: '" + bTo + '\'' +
                ", Start Time: '" + bStart + '\'' +
                '}';
    }
}
