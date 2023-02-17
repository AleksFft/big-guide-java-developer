package creational.builder.training1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PassportBuilder implements Builder {
    private String location;
    private WallMaterial wallMaterial;
    private int windowsCount;
    private int floorsCount;
    private String guarantyPeriod;

    public PassportBuilder(String location, WallMaterial wallMaterial, int windowsCount, int floorsCount) {
        this.location = location;
        this.wallMaterial = wallMaterial;
        this.windowsCount = windowsCount;
        this.floorsCount = floorsCount;
        guarantyPeriod(wallMaterial);
    }

    @Override
    public PassportBuilder getResult() {
        return new PassportBuilder(location, wallMaterial, windowsCount, floorsCount);
    }

    private void guarantyPeriod(WallMaterial wallMaterial) {
        if (wallMaterial.equals(WallMaterial.WOOD)) {
            this.guarantyPeriod = "15";
        } else if (wallMaterial.equals(WallMaterial.CONCRETE)) {
            this.guarantyPeriod = "25";
        } else if (wallMaterial.equals(WallMaterial.BRICK)) {
            this.guarantyPeriod = "40";
        } else {
            guarantyPeriod = "0";
        }
    }

    @Override
    public void location(String location) {
        this.location = location;
    }

    @Override
    public void wallMaterial(WallMaterial material) {
        this.wallMaterial = material;
    }

    @Override
    public void windowsCount(int windows) {
        this.windowsCount = windows;
    }

    @Override
    public void floorsCount(int floors) {
        this.floorsCount = floors;
    }

    @Override
    public void reception(String reception) {

    }

    @Override
    public String toString() {
        String passport = "";
        passport += "\nPassport for Build:\n" +
                "location: " + location + "\n" +
                "wall material: " + wallMaterial +"\n" +
                "guaranty period for: " + guarantyPeriod + " years";
        return passport;
    }
}
