package good;

import model.Employee;

public class EmployeeRepository {

	public void saveEmployeed(Employee employee) {
		System.out.print(employee.getName().concat(" was saved"));
	}
}
