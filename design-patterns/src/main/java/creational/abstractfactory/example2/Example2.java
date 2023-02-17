package creational.abstractfactory.example2;

public class Example2 {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        Client client1 = new Client(factory1);
        client1.execute();
    }
}
