import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MessageFacade messageFacade = new MessageFacade();

        int escolha;
        do {
            System.out.println("Menu:");
            System.out.println("1. Enviar mensagem de email");
            System.out.println("2. Enviar mensagem SMS");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    scanner.nextLine();  // Limpar o buffer de entrada
                    System.out.print("Digite a mensagem de email: ");
                    String emailMessage = scanner.nextLine();
                    messageFacade.sendEmail(emailMessage);
                    break;
                case 2:
                    scanner.nextLine();  // Limpar o buffer de entrada
                    System.out.print("Digite a mensagem SMS: ");
                    String smsMessage = scanner.nextLine();
                    messageFacade.sendSMS(smsMessage);
                    break;
                case 3:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }

        } while (escolha != 3);
    }
}