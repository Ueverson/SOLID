package bad;

public class MensagemService {

	private EmailService emailService;

    public MensagemService() {
        this.emailService = new EmailService();
    }

    public void enviarMensagem(String mensagem, String destinatario) {
        emailService.enviarEmail(mensagem, destinatario);
    }
}
