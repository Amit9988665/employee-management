package com.in2it.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.in2it.custumexception.UserCustumException;
import com.in2it.model.Employee;
import com.in2it.repository.EmployeeRepo;
import com.in2it.repository.EmployeeRepositoryEntityManager;
import com.in2it.wrapperobject.EmployeeAndDepartmentData;
import com.in2it.wrapperobject.EmployeeAndDepartmentImpl;
import com.in2it.wrapperobject.EmployeeDTO;

@Service
public class EmployeeService implements EmployeeServiceI {

	@Autowired
	EmployeeRepo employeeRepo;

	@Autowired
	EmployeeRepositoryEntityManager employeeRepositoryEntityManager;

	/** private BCryptPasswordEncoder bCryptPasswordEncoder; 
	 * @throws UserCustumException */

	@Override
	public void delete(int id) throws UserCustumException {
		Optional<Employee> employee=employeeRepo.findById(id);
		if (employee!=null) {
			employeeRepo.deleteById(id);
		}else {
			throw new UserCustumException("Employee not found");
		}
		
	}

	@Override
	public Employee updateOrSave(EmployeeDTO employeeDTO) {
		Employee employee = new Employee();
		employee.setEid(employeeDTO.getEid());
		employee.setEmpName(employeeDTO.getEmpName());
		employee.setEmpAddress(employeeDTO.getEmpAddress());

		employee.setEmpPassword(employeeDTO.getEmpPassword());
		employee.setEmpUserName(employeeDTO.getEmpUserName());
		employee.setEmpSalary(employeeDTO.getEmpSalary());
		System.out.println(employeeRepo.save(employee));
		return employeeRepo.save(employee);
	}

	@Override
	public void saveEmp(EmployeeDTO employeeDTO) {
		Employee employee = new Employee();

		employee.setEmpName(employeeDTO.getEmpName());
		employee.setEmpAddress(employeeDTO.getEmpAddress());

		employee.setEmpPassword(employeeDTO.getEmpPassword());
		employee.setEmpUserName(employeeDTO.getEmpUserName());
		employee.setEmpSalary(employeeDTO.getEmpSalary());
		employeeRepo.save(employee);

	}

	@Override
	public List<Employee> getAllEmp() {
		System.out.println("hello service");
		return employeeRepo.findAll();

	}

	@Override
	public Employee getByEmpId(int eid) throws UserCustumException {
		return employeeRepo.findById(eid).orElseThrow(()->new UserCustumException("User not found"));

	}

	@Override
	public List<Employee> findPaginated(int pageNo, int pageSize) {

		PageRequest paging = PageRequest.of(pageNo, pageSize);
		Page<Employee> pagedResult = employeeRepo.findAll(paging);

		return pagedResult.toList();
	}

	@Override
	public EmployeeAndDepartmentData findEmployeesAndDep() {

		String strings = employeeRepo.findAllEmplAndDep();
		String[] str1 = strings.split(",");

		EmployeeAndDepartmentData andDepartmentData = new EmployeeAndDepartmentData();
		andDepartmentData.setEmpName(str1[0]);
		andDepartmentData.setEmpAddress(str1[1]);
		andDepartmentData.setDepName(str1[2]);
		andDepartmentData.setDepAddress(str1[3]);
		return andDepartmentData;
	}

	public EmployeeAndDepartmentImpl getAndDepartmentData() {
		return employeeRepo.findAllEmplAndDepartment();
	}

	public Optional<EmployeeAndDepartmentData> getAndDepartmentData1() {
		return employeeRepo.findAllEmplAndDepartmentclass();
	}

	public List<Employee> getBySalaryGreaterThen() {
		return employeeRepo.getAllEmpBySalaryGreaterThen();
	}

	public EmployeeAndDepartmentData getEmployeeAndDepData() {
		return employeeRepositoryEntityManager.findAllEmpAndDep();
	}
}
