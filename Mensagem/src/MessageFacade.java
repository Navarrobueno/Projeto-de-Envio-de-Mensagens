public class MessageFacade {
    private MessageService messageService;

    public MessageFacade() {
        messageService = MessageService.getInstance();
    }

    public void sendEmail(String message) {
        messageService.sendMessage("Enviando email: " + message);
    }

    public void sendSMS(String message) {
        messageService.sendMessage("Enviando SMS: " + message);
    }
}