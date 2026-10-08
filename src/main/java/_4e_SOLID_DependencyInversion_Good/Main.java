package _4e_SOLID_DependencyInversion_Good;

public class Main {
    public static void main(String[] args) {
        Payment payment = new RazorpayPayment(); // Inject & Runtime Polymorphsim
        PaymentService service = new PaymentService(payment); // Add the Dependency
        service.pay();
    }
}