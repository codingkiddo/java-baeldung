package core_java_8.com.baeldung.java_8_features;

import java.util.List;
import java.util.Optional;

public class EmployeesMain {

	public static void main(String[] args) {
		testNullPointerException();
	}
	
	private static void testNullPointerException() {
		List<Employee> employees = EmployeeFactory.getEmployees();
		int employeeId = 111;
		Employee employeeFound = employees.stream().filter(e -> e.getId() == employeeId).findAny().orElse(null);
		System.out.println(employeeFound == null ? "Not found" : "Found");
		
		Optional<Employee> optionalE = employees.stream().filter(e -> e.getId() == employeeId).findAny();
		
		System.out.println(optionalE.isPresent() ? optionalE.get().getName() : "UNKNOWN");
	}

}
