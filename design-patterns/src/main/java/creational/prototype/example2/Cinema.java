package creational.prototype.example2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class Cinema implements Cloneable {
    private String name;
    private String director;
    private int year;
    private List<String> actors;

    @Override
    public Cinema clone() {
        try {
            Cinema clone = (Cinema) super.clone();
            clone.setActors(new ArrayList<>(this.getActors()));
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
