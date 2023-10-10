package good;

public class EmailService implements ServicoDeMensagem{

	@Override
    public void enviarMensagem() {
		System.out.println("enviou email");
    }

}
