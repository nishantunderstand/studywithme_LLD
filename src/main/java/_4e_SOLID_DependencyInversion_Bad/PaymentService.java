package _4e_SOLID_DependencyInversion_Bad;

class PaymentService {
    private RazorpayPayment payment = new RazorpayPayment();
    public void pay() {
        payment.process();
    }
}