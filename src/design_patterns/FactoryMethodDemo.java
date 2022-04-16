package design_patterns;

interface Notification {
    public void notifyUser();
}

class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Showing a SMS notification");
    }
}

class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Showing an e-mail notification");
    }
}

class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Showing a push notification");
    }
}

class NotificationFactory {
    public Notification createNotification(String channel) { // Factory method for Notifications
        if (channel == null || channel.isEmpty()) {
            return null;
        }

        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown notification channel: " + channel);
        }
    }
}

// Client
public class FactoryMethodDemo {
    public static void main(String[] args) {
        System.out.println("Tight Coupling::");
        Notification smsNotification = new SMSNotification();
        Notification emailNotification = new EmailNotification();
        Notification pushNotification = new PushNotification();
        smsNotification.notifyUser();
        emailNotification.notifyUser();
        pushNotification.notifyUser();
        System.out.println();

        System.out.println("Loose Coupling::");
        NotificationFactory factory = new NotificationFactory();
        Notification notification = factory.createNotification("SMS");
        notification.notifyUser();

        // How to obtain an object of Email notification using factory method?
    }
}
