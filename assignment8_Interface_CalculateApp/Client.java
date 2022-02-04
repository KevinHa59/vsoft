package assignment.assignment8_Interface_CalculateApp;

public class Client {

    public static void main(String[] args) {
        CalculateAppImpl calculateApp = new CalculateAppImpl();
        calculateApp.add();
        calculateApp.sub();
        calculateApp.mul();
    }

}
