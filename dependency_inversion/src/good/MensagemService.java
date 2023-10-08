package good;

public class MensagemService {

	private ServicoDeMensagem servicoDeMensagem;

    public MensagemService() {
        this.servicoDeMensagem = new EmailService();
    }

    public void enviarMensagem(String mensagem, String destinatario) {
    	servicoDeMensagem.enviarMensagem(mensagem, destinatario);
    }
}
