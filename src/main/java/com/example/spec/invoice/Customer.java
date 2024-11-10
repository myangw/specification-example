package com.example.spec.invoice;

import java.util.List;

public class Customer {

    private int paymentGracePeriod;
    private List<Invoice> invoices;

    public int getPaymentGracePeriod() {
        return paymentGracePeriod;
    }

    public void setPaymentGracePeriod(int paymentGracePeriod) {
        this.paymentGracePeriod = paymentGracePeriod;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }
}
