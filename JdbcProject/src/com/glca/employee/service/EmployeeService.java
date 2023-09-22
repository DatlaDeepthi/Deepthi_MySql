package com.glca.employee.service;
import com.glca.employee.model.Employee;

public interface EmployeeService {
	void insertRecords(Employee employee);
	void modifyEmailColumn();
	void updateEmployee(int id ,String newName,String newPhnNum);
	void deleteEmployee();
	void removeAllRecords();
	void display();
}

