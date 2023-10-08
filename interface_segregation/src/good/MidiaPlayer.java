package good;

public class MidiaPlayer implements DispositivoEletronico, DispositivoEletronicoReproduzivel {

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
