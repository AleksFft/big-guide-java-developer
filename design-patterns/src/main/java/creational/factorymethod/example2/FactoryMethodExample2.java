package creational.factorymethod.example2;

import java.util.stream.Stream;

public class FactoryMethodExample2 {
    public static void main(String[] args) {
        Creator[] creators = {new ConcreteCreatorA(), new ConcreteCreatorB()};
        Stream.of(creators)
                .map(Creator::factoryMethod)
                .map(Product::getClass)
                .forEach(aClass -> System.out.printf("Created {%s}\n", aClass));
    }
}
