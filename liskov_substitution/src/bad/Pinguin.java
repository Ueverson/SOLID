package bad;

public class Pinguin extends Ave {

	@Override
	public void fly() {
		throw new UnsupportedOperationException("Pinguins não podem voar");
	}
}
