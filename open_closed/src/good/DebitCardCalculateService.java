package good;

import util.PaymentType;

public class DebitCardCalculateService implements CalculateService {

	@Override
	public double calculateValuePayment(PaymentType paymentType, double valuePurchase) {
		return valuePurchase * 1.02;
	}

}
