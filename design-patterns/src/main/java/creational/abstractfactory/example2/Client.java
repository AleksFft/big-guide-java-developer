package creational.abstractfactory.example2;

public class Client {
    private AbstractProductA productA;
    private AbstractProductB productB;

    public Client(AbstractFactory factory) {
        this.productA = factory.createProductA();
        this.productB = factory.createProductB();
    }

    void execute() {
        productB.interact(productA);
    }
}
