public class MessageService {
    private static MessageService instance = new MessageService();

    private MessageService() {
        // Construtor privado para garantir um único ponto de acesso.
    }

    public static MessageService getInstance() {
        return instance;
    }

    public void sendMessage(String message) {
        System.out.println("Enviando mensagem: " + message);
    }
}