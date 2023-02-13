package creational.builder.example2;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London to Scotland Yard, 8-10 Broadway";
    }

    public GPSNavigator(String manualRoute) {
        this.route = route;
    }
}
