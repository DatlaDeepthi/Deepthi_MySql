package com.glca.employee.client;

import com.glca.employee.model.Employee;
import com.glca.employee.service.EmployeeServiceImpl;

public class ClientMain {

	public static void main(String[] args) {
		EmployeeServiceImpl employeeService=new EmployeeServiceImpl();

		//inserting 5 records
		Employee e1=new Employee(1, "Deepthi", "deepthi@gmail.com", "9390772359");
		Employee e2=new Employee(2, "DSR", "dsr@gmail.com", "8965231482");
		Employee e3=new Employee(3, "Sujatha", "sujatha@gmail.com", "8954226487");
		Employee e4=new Employee(4, "Rani", "rani@gmail.com", "7897568156");
		Employee e5=new Employee(5, "kavya", "kavya@gmail.com", "8792662164");
		employeeService.insertRecords(e1);
		employeeService.insertRecords(e2);
		employeeService.insertRecords(e3);
		employeeService.insertRecords(e4);
		employeeService.insertRecords(e5);

		//modifying email column
		employeeService.modifyEmailColumn();
		//adding two records and checking 
		Employee e6=new Employee(6, "puspa", "pushpa@gmail.com", "7896145487");
		Employee e7=new Employee(2, "dileep", "dileep@gmail.com", "7964457829");
		employeeService.insertRecords(e6);
		employeeService.insertRecords(e7);
		employeeService.display();

		//updating the name of the employee and phone_number of given id
		employeeService.updateEmployee(3, "karthik", "1234567890");
        employeeService.display();
		//deleting a particular employee id 
		employeeService.deleteEmployee();
        employeeService.display();
		//removing all the records
		employeeService.removeAllRecords();

	}

}