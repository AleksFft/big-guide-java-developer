package structural.adapter.example2;

public class Client {
    public static void main(String[] args) {
        Chief chief = new ChiefAdapter();
        Object dish = chief.makeBreakfast();
        eat(dish);
        dish = chief.makeLunch();
        eat(dish);
        dish = chief.makeDinner();
        eat(dish);


        Chief chief2 = new ChiefAdapter2();
        Object o = chief2.makeBreakfast();
        eat(o);
    }

    private static void eat(Object dish) {
        System.out.println("eating " + dish);
    }
}
