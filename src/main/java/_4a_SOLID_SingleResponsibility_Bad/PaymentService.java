package _4a_SOLID_SingleResponsibility_Bad;

//S — Single Responsibility Principle
//A class should have one responsibility / one reason to change.

class PaymentService {
    void processPayment() {}
    void saveToDB() {}
    void sendEmail() {}
}