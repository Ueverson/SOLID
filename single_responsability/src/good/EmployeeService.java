package good;


import model.Employee;
import util.FunctionType;

public class EmployeeService {

	public Employee createEmployee(String name, FunctionType function, Double wage) {
		Employee employee =new Employee(name, function, wage);
		saveEmployeed(employee);
		return employee;
	}

	public Employee changeNameEmployee(Employee employee, String newName) {
		employee.setName(newName);
		saveEmployeed(employee);
		return employee;
	}
}
