package _2_StrategyDesignPattern;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Credit Card Payment !!!");
    }
}
