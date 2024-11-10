package com.example.spec.invoice;

import java.time.LocalDate;

public class Invoice {
    private LocalDate dueDate;
    private Customer customer;
    private Money totalAmount;
    private String type;

    public boolean isOverdue() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.isAfter(dueDate);
    }

    Customer getCustomer() {
        return customer;
    }

    LocalDate getDueDate() {
        return dueDate;
    }

    Money getTotalAmount() {
        return totalAmount;
    }

    String getType() {
        return type;
    }
}
