package creational.factorymethod.example1;

public class WebButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello world!'");
    }
}
