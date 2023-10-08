package good;

import util.PaymentType;

public class CreditCardCalculateService implements CalculateService {

	@Override
	public double calculateValuePayment(PaymentType paymentType, double valuePurchase) {
		 return valuePurchase * 1.05;
	}

}
