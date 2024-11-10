package com.example.spec.invoice;

public class BigInvoiceSpec implements InvoiceSpec {
    private Money thresholdAmount;

    public BigInvoiceSpec(Money thresholdAmount) {
        this.thresholdAmount = thresholdAmount;
    }

    @Override
    public boolean isSatisfiedBy(Invoice candidate) {
        return candidate.getTotalAmount().greaterThanOrEqual(thresholdAmount);
    }
}
