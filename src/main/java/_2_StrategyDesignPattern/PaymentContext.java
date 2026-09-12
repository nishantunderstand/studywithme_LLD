package _2_StrategyDesignPattern;

public class PaymentContext {

    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment() {
        if (paymentStrategy == null) {
            System.out.println("No Payment is Selected");
        } else {
            paymentStrategy.pay();
        }
    }
}
