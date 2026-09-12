package _2_StrategyDesignPattern;

public class Client {

    public static void main(String[] args) {

        PaymentStrategy creditCard = new CreditCardPayment();
        PaymentStrategy upi = new UPIPayment();

        PaymentContext paymenetContext = new PaymentContext(creditCard);
        paymenetContext.executePayment();

        paymenetContext.setPaymentStrategy(upi);
        paymenetContext.executePayment();
    }
}

/**
 * PaymentStrategy CreditCardPayment PaymentContext or PaymentProcessor Client
 * Code
 */
