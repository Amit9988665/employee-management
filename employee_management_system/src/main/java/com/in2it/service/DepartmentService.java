package com.in2it.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in2it.model.Department;
import com.in2it.model.Employee;
import com.in2it.repository.DepartmentRepo;
import com.in2it.wrapperobject.DepartmentDTO;
import com.in2it.wrapperobject.EmployeeDTO;

@Service
public class DepartmentService implements DepartmentServiceImpl {

	@Autowired
	DepartmentRepo departmentRepo;

	@Override
	public void saveDep(DepartmentDTO departmentDTO) {

		Department department = new Department();
		department.setDepName(departmentDTO.getDepName());
		department.setDepAddress(departmentDTO.getDepAddress());
		department.setDepEmailId(departmentDTO.getDepEmailId());
		department.setDepPhoneNo(departmentDTO.getDepPhoneNo());
		departmentRepo.save(department);
	}

	@Override
	public List<Department> getAllDep() {

		return departmentRepo.findAll();
	}

	@Override
	public void saveDepAndEmp(DepartmentDTO departmentDTO) {

		List<Employee> employees = new ArrayList<>();

		Department department = new Department();
		department.setDepName(departmentDTO.getDepName());
		department.setDepAddress(departmentDTO.getDepAddress());
		department.setDepEmailId(departmentDTO.getDepEmailId());
		department.setDepPhoneNo(departmentDTO.getDepPhoneNo());
		
		List<EmployeeDTO> employeeDTOs= departmentDTO.getEmpDTO();

		employeeDTOs.forEach(e -> {
			Employee employee = new Employee();
			employee.setEmpName(e.getEmpName());
			employee.setEmpAddress(e.getEmpAddress());
			employee.setEmpPassword(e.getEmpPassword());
			employee.setEmpSalary(e.getEmpSalary());
			employee.setEmpUserName(e.getEmpUserName());
			employees.add(employee);
			department.setEmployees(employees);
		});
		departmentRepo.save(department);

	}

	@Override
	public Department getEmpByDepId(int did) {
		 
		return departmentRepo.findById(did).get();
	}

}
