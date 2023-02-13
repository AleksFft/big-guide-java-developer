package creational.builder.example1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * цель:
 *      Отделяет конструирование сложного объекта от его представления так,
 *      что в результате одного и того же процесса конструирования могут получаться разные представления.
 * плюсы:
 *      + позволяет изменять внутреннее представление продукта;
 *      + изолирует код, реализующий конструирование и представление;
 *      + дает более тонкий контроль над процессом конструирования;
 * минусы:
 *      - алгоритм создания сложного объекта не должен зависеть от того, из каких частей состоит объект и как они стыкуются между собой;
 *      - процесс конструирования должен обеспечивать различные представления конструируемого объекта;
 */

/** a customer ordering pizza */
public class BuilderExample {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder pizzaBuilder = new HawaiianPizzaBuilder();
        waiter.setPizzaBuilder(pizzaBuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        System.out.println(pizza);
    }
}

/** product */
@Setter
@ToString
class Pizza {
    private String dough = "";
    private String sauce = "";
    private String topping = "";
}

/** abstract builder */
@Getter
abstract class PizzaBuilder {
    protected Pizza pizza;

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }
    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}

/** concrete builder */
class HawaiianPizzaBuilder extends PizzaBuilder {
    public void buildDough() {
        pizza.setDough("cross");
    }

    public void buildSauce() {
        pizza.setSauce("mild");
    }

    public void buildTopping() {
        pizza.setTopping("ham, pineapple");
    }
}

/** concrete builder */
class SpicyPizzaBuilder extends PizzaBuilder {
    public void buildDough() {
        pizza.setDough("pan baked");
    }

    public void buildSauce() {
        pizza.setSauce("hot");
    }

    public void buildTopping() {
        pizza.setTopping("pepperoni, salami");
    }
}

/** director */
@Setter
class Waiter {
    private PizzaBuilder pizzaBuilder;

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}

