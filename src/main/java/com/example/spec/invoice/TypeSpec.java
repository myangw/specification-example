package com.example.spec.invoice;

public class TypeSpec implements InvoiceSpec {
    private String invoiceType;

    public TypeSpec(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    @Override
    public boolean isSatisfiedBy(Invoice candidate) {
        return candidate.getType().equals(invoiceType);
    }
}
