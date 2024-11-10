package com.example.spec.invoice;

import java.time.LocalDate;

import static com.example.spec.invoice.Specs.NotSpec.not;


/** using specification */
class EmailSender2 {

    static final Object TEMPLATE_4000 = "";
    static final Object TEMPLATE_NORMAL = "";

    static final InvoiceSpec DELINQUENT_SPEC = new DelinquentInvoiceSpec(LocalDate.now());
    static final InvoiceSpec Z_TYPE_SPEC = new TypeSpec("Z");
    static final InvoiceSpec BIG_INVOICE_SPEC = new BigInvoiceSpec(Money.of(100));
    static final InvoiceSpec BIG_INVOICE_SPEC_4000 = new BigInvoiceSpec(Money.of(4000));

    static final InvoiceSpec EMAIL_SEND_NORMAL_SPEC = DELINQUENT_SPEC.and(BIG_INVOICE_SPEC).and(not(Z_TYPE_SPEC));
    static final InvoiceSpec EMAIL_SEND_4000_SPEC = DELINQUENT_SPEC.and(BIG_INVOICE_SPEC_4000).and(not(Z_TYPE_SPEC));

    private void send(Invoice invoice) {
        if (EMAIL_SEND_NORMAL_SPEC.isSatisfiedBy(invoice)) {
            send(invoice, TEMPLATE_NORMAL);
        }
        if (EMAIL_SEND_4000_SPEC.isSatisfiedBy(invoice)) {
            send(invoice, TEMPLATE_4000);
        }
    }

    private void send(Invoice invoice, Object template) {

    }
}
