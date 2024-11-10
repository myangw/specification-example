package com.example.spec.invoice;

import java.time.LocalDate;

public class DelinquentInvoiceSpec implements InvoiceSpec {
    private LocalDate currentDate; // 인스턴스는 한 날짜를 대상으로 사용된 후 폐기된다.

    public DelinquentInvoiceSpec(LocalDate currentDate) {
        this.currentDate = currentDate;
    }

    @Override
    public boolean isSatisfiedBy(Invoice candidate) {
        int gracePeriod = candidate.getCustomer().getPaymentGracePeriod();
        LocalDate firmDeadline = candidate.getDueDate().plusDays(gracePeriod);
        return currentDate.isAfter(firmDeadline);
    }
}
