package com.example.spec.storage;

import java.util.ArrayList;
import java.util.List;

public class CompositeSpecification<T> implements Specification<T> {
    private final List<Specification<T>> components = new ArrayList<>();

    public CompositeSpecification<T> with(Specification<T> specification) {
        components.add(specification);
        return this;
    }

    @Override
    public boolean isSatisfiedBy(T candidate) {
        for (Specification<T> each : components) {
            if (!each.isSatisfiedBy(candidate)) {
                return false; // 하나라도 만족하지 않으면 false
            }
        }
        return true;
    }
}
