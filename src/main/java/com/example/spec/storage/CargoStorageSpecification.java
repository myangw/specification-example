package com.example.spec.storage;


/** parameterized specification */
public class CargoStorageSpecification implements StorageSpecification {
    private final int maxTemperature;
    private final boolean isSanitaryForFood;

    public CargoStorageSpecification(int maxTemperature, boolean isSanitaryForFood) {
        this.maxTemperature = maxTemperature;
        this.isSanitaryForFood = isSanitaryForFood;
    }

    @Override
    public boolean isSatisfiedBy(Container aContainer) {
        boolean temperatureCheck = aContainer.canMaintainTemperatureBelow(maxTemperature);
        boolean sanitationCheck = !isSanitaryForFood || aContainer.isSanitaryForFood();
        return temperatureCheck && sanitationCheck;
    }
}
