package com.example.spec.storage;


/** hard coded specification */
class MeatStorageSpecification implements StorageSpecification {
    @Override
    public boolean isSatisfiedBy(Container aContainer) {
        return aContainer.canMaintainTemperatureBelow(-4) && aContainer.isSanitaryForFood();
    }
}
