package good;

public class SmartLamp implements DispositivoEletronico{

	@Override
	public void turnOn() {
		System.out.println("ligando Smartphone");
	}

	@Override
	public void turnOff() {
		System.out.println("Desligando Smartphone");
	}

}
