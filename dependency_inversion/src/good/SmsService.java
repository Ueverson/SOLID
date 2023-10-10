package good;

public class SmsService implements ServicoDeMensagem{

	@Override
	public void enviarMensagem() {
		System.out.println("enviou sms");
	}
	
}
