package _2_StrategyDesignPattern;

public class UPIPayment implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("UPIPayment Payment !!!");
    }
}
