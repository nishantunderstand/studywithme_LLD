class PaymentService {

    void pay(String paymentType) {

        if (paymentType.equals("UPI")) {
            System.out.println("UPI Payment");
        }
        else if (paymentType.equals("CASH")) {
            System.out.println("Cash Payment");
        }
    }
}