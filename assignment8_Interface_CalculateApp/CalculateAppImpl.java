package assignment.assignment8_Interface_CalculateApp;

public class CalculateAppImpl implements CalculateApp{
    @Override
    public void add() {
        System.out.println("Add");
    }

    @Override
    public void sub() {
        System.out.println("Sub");
    }

    @Override
    public void mul() {
        System.out.println("Mul");
    }
}
