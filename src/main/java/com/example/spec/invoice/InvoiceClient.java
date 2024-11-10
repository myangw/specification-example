package com.example.spec.invoice;

import java.time.LocalDate;

class InvoiceClient {

    public boolean accountIsDelinquent(Customer customer) {
        LocalDate today = LocalDate.now();
        InvoiceSpec delinquentSpec = new DelinquentInvoiceSpec(today);

        for (Invoice invoice : customer.getInvoices()) {
            if (delinquentSpec.isSatisfiedBy(invoice)) {
                return true;
            }
        }
        return false;
    }
}
