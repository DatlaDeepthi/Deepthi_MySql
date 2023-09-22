package com.glca.employee.service;
import com.glca.employee.dao.EmployeeDao;
import com.glca.employee.dao.EmployeeDaoImpl;
import com.glca.employee.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	EmployeeDao employeeDao;

	public EmployeeServiceImpl() {
		employeeDao=new EmployeeDaoImpl();
	}

	@Override
	public void insertRecords(Employee employee) {
		employeeDao.insertRecords(employee);

	}

	@Override
	public void modifyEmailColumn() {
		employeeDao.modifyEmailColumn();

	}

	@Override
	public void updateEmployee(int id, String newName, String newPhnNum) {
		employeeDao.updateEmployee(id, newName, newPhnNum);

	}

	@Override
	public void deleteEmployee() {
		employeeDao.deleteEmployee();

	}

	@Override
	public void removeAllRecords() {
		employeeDao.removeAllRecords();
	}

	@Override
	public void display() {
		employeeDao.display();
		
	}

}
