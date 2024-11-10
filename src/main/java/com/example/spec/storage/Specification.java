package com.example.spec.storage;

public interface Specification<T> {
    boolean isSatisfiedBy(T candidate);
}
