package com.in2it.service;

import java.util.List;
import java.util.Optional;

import com.in2it.custumexception.UserCustumException;
import com.in2it.model.Employee;
import com.in2it.wrapperobject.EmployeeAndDepartmentData;
import com.in2it.wrapperobject.EmployeeAndDepartmentImpl;
import com.in2it.wrapperobject.EmployeeDTO;

public interface EmployeeServiceI {

	void delete(int id) throws UserCustumException;

	Employee updateOrSave(EmployeeDTO employee);

	void saveEmp(EmployeeDTO employee);

	List<Employee> getAllEmp();

	Employee getByEmpId(int eid) throws UserCustumException;

	List<Employee> findPaginated(int pageNo, int pageSize);

	EmployeeAndDepartmentData findEmployeesAndDep();

	public EmployeeAndDepartmentImpl getAndDepartmentData();

	public Optional<EmployeeAndDepartmentData> getAndDepartmentData1();

	public List<Employee> getBySalaryGreaterThen();

	public EmployeeAndDepartmentData getEmployeeAndDepData();

	void saveEmpAndDep(EmployeeDTO dto);

	Employee getDepByEmpId(int eid);
}