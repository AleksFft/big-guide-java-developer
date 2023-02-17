package creational.abstractfactory.example1;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("created MacOSButton");
    }
}
