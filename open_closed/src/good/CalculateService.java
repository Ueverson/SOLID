package good;

import util.PaymentType;

public interface CalculateService {

	public double calculateValuePayment(PaymentType paymentType, double valuePurchase);
}
