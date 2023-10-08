package bad;

public class MidiaPlayer implements DispositivoEletronico{

	@Override
	public void turnOn() {
		System.out.println("ligando Smartphone");
	}

	@Override
	public void turnOff() {
		System.out.println("Desligando Smartphone");
	}

	@Override
	public void reproduceMedia() {
		System.out.println("Reproduzindo midia");
	}

}
