package creational.prototype.example1;

import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (Objects.nonNull(target)) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shape))
            return false;
        Shape shape2 = (Shape) obj;
        return Objects.equals(shape2.x, x) && Objects.equals(shape2.y, y) && Objects.equals(shape2.color, color);
    }
}
