package com.sdet.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilter {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();

		Employee emp_1 = new Employee(02, "Mugdha", "Music", 500);
		Employee emp_2 = new Employee(32, "Deeksha", "JS Expert", 10000);
		Employee emp_3 = new Employee(62, "SS", "Mechnaical", 7500);
		Employee emp_4 = new Employee(56, "PSG", "Accounting", 6500);
		Employee emp_5 = new Employee(02, "PVM", "AI Expert", 15000);

		employeeList.add(emp_1);
		employeeList.add(emp_2);
		employeeList.add(emp_3);
		employeeList.add(emp_4);
		employeeList.add(emp_5);

		employeeList.forEach(e -> System.out.println(e));

		List<Employee> result = employeeList.stream().filter(e -> e.getSalary() > 10000).toList();
		System.out.println(result);

		result = employeeList.stream().sorted((emp1, emp2) -> Double.compare(emp1.getSalary(), emp2.getSalary()))
				.collect(Collectors.toList());
		System.out.println(result);
	}
}