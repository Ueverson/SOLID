package good;

import model.Employee;

public class EmployeeRepository {

	public void salvarNoBancoDeDados(Employee employee) {
		System.out.print(employee.getName().concat(" was saved"));
	}
}
