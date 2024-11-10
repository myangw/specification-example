package com.example.spec.invoice;

public class Specs {

    public static class AndSpec implements InvoiceSpec {
        private final InvoiceSpec spec1;
        private final InvoiceSpec spec2;

        public AndSpec(InvoiceSpec spec1, InvoiceSpec spec2) {
            this.spec1 = spec1;
            this.spec2 = spec2;
        }

        @Override
        public boolean isSatisfiedBy(Invoice candidate) {
            return spec1.isSatisfiedBy(candidate) && spec2.isSatisfiedBy(candidate);
        }

        public static InvoiceSpec and(InvoiceSpec left, InvoiceSpec right) {
            return new AndSpec(left, right);
        }
    }

    public static class NotSpec implements InvoiceSpec {
        private final InvoiceSpec spec;

        public NotSpec(InvoiceSpec spec) {
            this.spec = spec;
        }

        @Override
        public boolean isSatisfiedBy(Invoice candidate) {
            return !spec.isSatisfiedBy(candidate);
        }

        public static InvoiceSpec not(InvoiceSpec spec) {
            return new NotSpec(spec);
        }
    }

}
