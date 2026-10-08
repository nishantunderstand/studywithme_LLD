package _4b_SOLID_OpenClosed_Bad;

/**
 * Created : 2026-08-15 12:51:12
 */
public class PaymentService {
    public void pay(String paymentType){
        if(paymentType.equals("UPI")){
            System.out.println("UPI is working .....");
        }
        else if(paymentType.equals("CARD")){
            System.out.println("Card is working .....");
        }
        else if(paymentType.equals("ATM")){
            System.out.println("ATM is working .....");
        }
    }
}

// TODO
// If we have nested if-else  Don't you think Strategy Design Pattern is the best Answer for this case