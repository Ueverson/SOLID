package good;

import model.Employee;

public class SalaryService {
	
	private CalculateService calculateService;

	public SalaryService(CalculateService calculateService) {
		this.calculateService = calculateService;
	}

	public double calculateSalary(Employee employee) {
		return calculateService.calculateSalary(employee.getWage());
	}
}
