package com.example.spec.invoice;

import java.math.BigDecimal;

public class Money {
    private BigDecimal amount;

    public Money(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    static Money of(int i) {
        return new Money(BigDecimal.valueOf(i));
    }

    public boolean greaterThanOrEqual(Money thresholdAmount) {
        return amount.compareTo(thresholdAmount.amount) >= 0;
    }
}
