package good;

public class EmailService implements ServicoDeMensagem{

	@Override
    public void enviarMensagem(String mensagem, String destinatario) {
		System.out.println("email enviado para: ".concat(destinatario));
    }

}
