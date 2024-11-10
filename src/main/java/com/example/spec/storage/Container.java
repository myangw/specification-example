package com.example.spec.storage;

public class Container {

    private int maxTemperature;
    private boolean isSanitaryForFood;

    public boolean canMaintainTemperatureBelow(int temperature) {
        return temperature <= maxTemperature;
    }

    public boolean isSanitaryForFood() {
        return isSanitaryForFood;
    }
}
