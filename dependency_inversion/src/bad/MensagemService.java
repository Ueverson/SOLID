package bad;

public class MensagemService {
	
	private EmailService emailService;

    public MensagemService() {
        this.emailService = new EmailService();
    }

    public void enviarMensagem() {
    	emailService.enviarEmail();
    }
}
