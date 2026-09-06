interface PaymentGateway {

    void pay();
}


class UPIPayment implements PaymentGateway {

    @Override
    public void pay() {
        System.out.println("UPI Payment");
    }
}

class CashPayment implements PaymentGateway {

    @Override
    public void pay() {
        System.out.println("Cash Payment");
    }
}


public class PaymentService {

    private PaymentGateway gateway;

    public PaymentService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void pay() {
        gateway.pay();
    }
}


public class Main {

    public static void main(String[] args) {

        PaymentGateway gateway = new UPIPayment();

        PaymentService service =
                new PaymentService(gateway);

        service.pay();
    }
}