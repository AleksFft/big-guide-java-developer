package creational.abstractfactory.example1;

public class MacOSCheckbox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("created MacOSCheckbox");
    }
}
