package $_30_FactoryDesignPattern;

interface Notification{
    void send();
}

class EmailNotification implements Notification{
    public void send(){
        System.out.println("Email Sending");
    }
}

class SMSNotification implements Notification{
    public void send(){
        System.out.println("SMS Sending");
    }
}

class NotificationFactory{
    static Notification create(String type){
        return switch(type.toLowerCase()){
            case "email" -> new EmailNotification();
            case "sms" -> new SMSNotification();
            default -> throw new RuntimeException("Not Found");
        };
    }
}

// If Else Version
class NotificationFactory2 {
    static Notification create(String type) {
        if (type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("sms")) {
            return new SMSNotification();
        } else {
            throw new IllegalArgumentException("Not Found");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.create("sms");
        notification.send();
    }
}
