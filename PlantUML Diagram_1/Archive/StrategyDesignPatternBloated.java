// Strategy Design Pattern 

class PaymentProcessor {

    public void processPayment(String paymentMethod) {
        if (paymentMethod.equals("CreditCard")) {
            System.out.println("CreditCard Applied");
        } else if (paymentMethod.equals("UPICard")) {
            System.out.println("UPICard Applied");
        } else if (paymentMethod.equals("CashCard")) {
            System.out.println("CashCard Applied");
        } else if (paymentMethod.equals("CryptoCard")) {
            System.out.println("CryptoCard Applied");
        } else if (paymentMethod.equals("RentCard")) {
            System.out.println("RentCard Applied");
        }
    }
}

public class StrategyDesignPatternBloated {

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment("CreditCard");
        processor.processPayment("UPICard");
    }
}
