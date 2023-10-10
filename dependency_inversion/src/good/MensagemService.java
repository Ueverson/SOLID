package good;

public class MensagemService {

	private ServicoDeMensagem servicoDeMensagem;

    public MensagemService(ServicoDeMensagem servicoDeMensagem) {
        this.servicoDeMensagem = servicoDeMensagem;
    }

    public void enviarMensagem() {
    	servicoDeMensagem.enviarMensagem();
    }
}
