package creational.builder.example2;

public class Director {

    public void constructSportCar(Builder builder) {
        builder.setCarType(CarType.SPORT_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.5, 0));
        builder.setTransmission(Transmission.ROBOTIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructFamilyCar(Builder builder) {
        builder.setCarType(CarType.FAMILY_CAR);
        builder.setSeats(5);
        builder.setEngine(new Engine(1.6, 0));
        builder.setTransmission(Transmission.CVT);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
