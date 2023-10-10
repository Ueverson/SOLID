package bad;

public class Aguia extends Ave {

	@Override
	public void fly() {
		System.out.println("a Aguia está voando");
	}
	
	@Override
	public void mate() {
        System.out.println("a Aguia está acasalando");
    }
}
