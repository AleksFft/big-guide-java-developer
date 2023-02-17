package creational.abstractfactory.example1;

public class WindowsCheckbox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("created WindowsCheckbox");
    }
}
