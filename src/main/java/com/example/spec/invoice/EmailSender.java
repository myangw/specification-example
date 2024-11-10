package com.example.spec.invoice;

import java.time.LocalDate;

/** not using specification */
class EmailSender {

    private static final Object TEMPLATE_SPECIAL = "";
    private static final Object TEMPLATE_NORMAL = "";

    void xxx(Invoice2 invoice) {
        if (invoice.isOverdue(LocalDate.now()) &&
                invoice.isThresholdReached(Money.of(100)) &&
                invoice.isNotZType()
        ) {
            send(invoice, TEMPLATE_NORMAL);
        } else if (invoice.isOverdue(LocalDate.now()) &&
                invoice.isThresholdReached(Money.of(4000)) &&
                invoice.isNotZType()
        ) {
            send(invoice, TEMPLATE_SPECIAL);
        }
    }

    private void send(Invoice2 invoice, Object templateNormal) {

    }
}
