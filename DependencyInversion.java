/*  
    DIP (Depedency Inversion Principle) => Modul tingkat tinggi tidak boleh bergantung pada modul tingkat rendah.
    Keduanya harus saling bergantung pada sebuah abstraksi (interface tertentu)
*/

public class DependencyInversion {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        NotificationService notificationService = new NotificationService(emailService);
        notificationService.sendNotification("Hello, World!");

        MessageService smsService = new SMSService();
        NotificationService notificationService2 = new NotificationService(smsService);
        notificationService2.sendNotification("Hello via SMS!");

        MessageService lineService = new LineService();
        NotificationService notificationService3 = new NotificationService(lineService);
        notificationService3.sendNotification("Hello via Line!");

    }
}

// Contoh yang salah
// Modul tingkat rendah
// class EmailService {
// public void sendEmail(String message) {
// System.out.println("Sending email: " + message);
// }
// }

// // Modul tingkat tinggi
// class NotificationService {
// private EmailService emailService; // Bergantung langsung pada EmailService

// public NotificationService() {
// emailService = new EmailService();
// }

// public void sendNotification(String message) {
// emailService.sendEmail(message);
// }
// }

interface MessageService { // Abstraksi yang dimaksud
    void sendMessage(String message);
}

// Modul tingkat rendah
class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email : " + message);
    }
}

// Modul tingkat rendah
class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

// Modul tingkat rendah
class LineService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Line: " + message);
    }
}

// Modul tingkat tinggi
class NotificationService {
    private MessageService messageService;

    // Set notifikasi
    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    // Kirim notifikasi
    public void sendNotification(String message) {
        messageService.sendMessage(message);
    }
}