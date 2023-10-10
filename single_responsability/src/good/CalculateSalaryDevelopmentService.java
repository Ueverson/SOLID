package good;

public class CalculateSalaryDevelopmentService implements CalculateService {

	@Override
	public double calculateSalary(double wage) {
		return wage += 2000;
	}

}
