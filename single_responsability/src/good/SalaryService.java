package good;

import model.Employee;
import util.FunctionType;

public class SalaryService {

	public double calculateSalary(Employee employee) {
		double wage = employee.getWage();

		if (FunctionType.MANAGER.equals(employee.getFunction())) {
			wage += 1000;
		}

		if (FunctionType.DEVELOPER.equals(employee.getFunction())) {
			wage += 10000;
		}

		return wage;
	}
}
