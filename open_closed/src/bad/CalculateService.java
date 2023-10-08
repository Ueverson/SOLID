package bad;

import util.PaymentType;

public class CalculateService {

	public double calculateValuePayment(PaymentType paymentType, double valuePurchase) {
		double valuePayment = 0.0;

		if (PaymentType.CREDIT_CARD.equals(paymentType)) {
			valuePayment = valuePurchase * 1.05;
		} else if (PaymentType.DEBIT_CARD.equals(paymentType)) {
			valuePayment = valuePurchase * 1.02;
		}

		return valuePayment;
	}
}
