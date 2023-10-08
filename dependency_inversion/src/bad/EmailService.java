package bad;

public class EmailService {

	public void enviarEmail(String mensagem, String destinatario) {
		System.out.println("email enviado para: ".concat(destinatario));
	}
}
