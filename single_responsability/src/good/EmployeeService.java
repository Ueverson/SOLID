package good;


import model.Employee;
import util.FunctionType;

public class EmployeeService {
	
	EmployeeRepository employeeRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public Employee createEmployee(String name, FunctionType function, Double wage) {
		Employee employee =new Employee(name, function, wage);
		employeeRepository.saveEmployeed(employee);
		return employee;
	}

	public Employee changeNameEmployee(Employee employee, String newName) {
		employee.setName(newName);
		employeeRepository.saveEmployeed(employee);
		return employee;
	}
}
