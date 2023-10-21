public interface MessageStrategy {
    void send(String message);
}

public class EmailStrategy implements MessageStrategy {
    @Override
    public void send(String message) {
        System.out.println("Enviando email: " + message);
    }
}

public class SMSStrategy implements MessageStrategy {
    @Override
    public void send(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}