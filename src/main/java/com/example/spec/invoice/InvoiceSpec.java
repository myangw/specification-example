package com.example.spec.invoice;

public interface InvoiceSpec {
    boolean isSatisfiedBy(Invoice candidate);

    default InvoiceSpec and(InvoiceSpec right) {
        return new Specs.AndSpec(this, right);
    }
}
