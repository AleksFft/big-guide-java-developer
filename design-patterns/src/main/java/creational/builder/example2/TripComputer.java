package creational.builder.example2;

import lombok.Setter;

@Setter
public class TripComputer {
    private Car car;

    public void showFueLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    private String showStatus() {
        if (this.car.getEngine().isStarted())
            return "car is started";
        else
            return "car isn't started";
    }

    @Override
    public String toString() {
        return "TripComputer{" +
                "car=" + showStatus() +
                '}';
    }
}
