package good;

import util.PaymentType;

public class DebitCardCalculateService implements CalculateService {

	@Override
	public double calculateValuePayment(double valuePurchase) {
		return valuePurchase * 1.02;
	}

}
