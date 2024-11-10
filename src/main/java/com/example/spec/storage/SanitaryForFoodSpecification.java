package com.example.spec.storage;

public class SanitaryForFoodSpecification implements Specification<Container> {

    @Override
    public boolean isSatisfiedBy(Container container) {
        return container.isSanitaryForFood();
    }
}
