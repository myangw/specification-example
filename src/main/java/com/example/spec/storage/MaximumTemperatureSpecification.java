package com.example.spec.storage;


public class MaximumTemperatureSpecification implements Specification<Container> {
    private final int maxTemp;

    public MaximumTemperatureSpecification(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    @Override
    public boolean isSatisfiedBy(Container container) {
        return container.canMaintainTemperatureBelow(maxTemp);
    }
}
