package creational.prototype.example2;

import java.util.ArrayList;
import java.util.List;

public class PrototypeExample2 {
    public static void main(String[] args) {
        List<String> actors = new ArrayList<>();
        actors.add("pitt");
        actors.add("green");
        actors.add("depp");

        Cinema cinema1 = new Cinema("night", "tarantino", 2000, actors);
        Cinema cinema2 = cinema1.clone();

        System.out.println(cinema1 == cinema2);
        System.out.println(cinema1.equals(cinema2));

        cinema2.setDirector("ritchie");
        cinema2.getActors().add("robie");

        System.out.println(cinema1 == cinema2);
        System.out.println(cinema1.equals(cinema2));

        System.out.println(cinema1);
        System.out.println(cinema2);
    }
}
