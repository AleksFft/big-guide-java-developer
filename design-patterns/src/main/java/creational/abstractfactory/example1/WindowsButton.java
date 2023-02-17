package creational.abstractfactory.example1;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("created windows button");
    }
}
