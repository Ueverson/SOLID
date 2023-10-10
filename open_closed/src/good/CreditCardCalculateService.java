package good;

import util.PaymentType;

public class CreditCardCalculateService implements CalculateService {

	@Override
	public double calculateValuePayment(double valuePurchase) {
		 return valuePurchase * 1.05;
	}

}
