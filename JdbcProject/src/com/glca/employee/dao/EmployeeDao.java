package com.glca.employee.dao;
import com.glca.employee.model.Employee;

public interface EmployeeDao {
	void insertRecords(Employee employee);
	void modifyEmailColumn();
	void  updateEmployee(int id ,String newName,String newPhnNum);
	void deleteEmployee();
	void removeAllRecords();
	void display();
}
