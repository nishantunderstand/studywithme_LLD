package _4b_SOLID_OpenClosed_Good;

/**
 * Created : 2026-08-15 12:59:11
 */
public class PaymentService {
    public void pay(Payment payment){
        payment.pay();
    }
}


// Here it start taking input of Payment which is interface.
// So at runtime, I can change it.