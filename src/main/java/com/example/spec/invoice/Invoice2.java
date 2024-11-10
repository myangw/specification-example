package com.example.spec.invoice;

import java.time.LocalDate;

class Invoice2 {
    private LocalDate dueDate;
    private Customer customer;
    private Money totalAmount;

    boolean isThresholdReached(Money thresholdAmount) {
        return totalAmount.greaterThanOrEqual(thresholdAmount);
    }

    boolean isOverdue(LocalDate currentDate) {
        int gracePeriod = customer.getPaymentGracePeriod();
        LocalDate firmDeadline = dueDate.plusDays(gracePeriod);
        return currentDate.isAfter(firmDeadline);
    }

    boolean isNotZType() {
        return false;
    }
}
