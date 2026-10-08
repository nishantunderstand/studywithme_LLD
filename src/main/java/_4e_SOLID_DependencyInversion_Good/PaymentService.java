package _4e_SOLID_DependencyInversion_Good;

class PaymentService {
    private final Payment payment; // Inject the interface
    public PaymentService(Payment payment) {
        this.payment = payment;
    }
    public void pay() {
        payment.process();
    }
}