package bad;

import model.Employee;
import util.FunctionType;

public class EmployeeService {

	public Employee createEmployee(String name, FunctionType function, Double wage) {
		Employee employee = new Employee(name, function, wage);
		saveEmployeedBD(employee);
		return employee;
	}

	public Employee changeNameEmployee(Employee employee, String newName) {
		employee.setName(newName);
		saveEmployeedBD(employee);
		return employee;
	}

	public double calculateSalary(Employee employee) {
		double wage = employee.getWage();

		if (FunctionType.MANAGER.equals(employee.getFunction())) {
			wage += 1000;
		}

		if (FunctionType.DEVELOPER.equals(employee.getFunction())) {
			wage += 10000;
		}

		saveEmployeedBD(employee);
		return wage;
	}

	public void saveEmployeedBD(Employee employee) {
		System.out.print(employee.getName().concat(" was saved"));
	}

}
