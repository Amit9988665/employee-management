package com.in2it.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.in2it.custumexception.UserCustumException;
import com.in2it.model.Employee;
import com.in2it.repository.EmployeeRepo;
import com.in2it.wrapperobject.EmployeeDTO;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

	@Mock
	EmployeeRepo employeeRepo;

	@InjectMocks
	EmployeeService employeeService;

	private Employee employee;
	EmployeeDTO employeeDto;

	@Before
	public void init() {
		MockitoAnnotations.openMocks(this);
	}

//	@BeforeEach
//	public void setup() {
//		employee = Employee.builder().eid(1).empName("Amit").empAddress("Noida").empUserName("amitkr").empSalary("2000")
//				.empPassword("admin").build();
//	}

	@Test
	void getAllEmpService() {
		Employee employee = new Employee();
		employee.setEid(1);
		employee.setEmpName("Amit Kumar");
		employee.setEmpAddress("Grater Noida");
		employee.setEmpSalary("1000");
		employee.setEmpPassword("admin");
		employee.setEmpUserName("amit");

		Employee employee1 = new Employee();
		employee1.setEid(1);
		employee1.setEmpName("Amit Kumar");
		employee1.setEmpAddress("Grater Noida");
		employee1.setEmpSalary("1000");
		employee1.setEmpPassword("admin");
		employee1.setEmpUserName("amit");

		when(employeeService.getAllEmp()).thenReturn(Arrays.asList(employee, employee1));

		List<Employee> list = employeeRepo.findAll();
		assertThat(list).containsExactly(employee, employee1);

	}

	@Test
	void getByEmpId1() throws UserCustumException {
		Employee employee = new Employee();
		employee.setEid(1);
		employee.setEmpName("Amit Kumar");
		employee.setEmpAddress("Grater Noida");
		employee.setEmpSalary("1000");
		employee.setEmpPassword("admin");
		employee.setEmpUserName("amit");

		
		Mockito.when(employeeRepo.findById(1)).thenReturn(Optional.of(employee));
		Employee employee2 = employeeService.getByEmpId(1);
		assertThat(employee2).isEqualTo(employee);

	}

	@Test
	void deleteByEmpId() throws UserCustumException {
		int empId = 1;
		willDoNothing().given(employeeRepo).deleteById(empId);
		employeeService.delete(empId);
		verify(employeeRepo, times(1)).deleteById(empId);

	}

	@Test
	public void update() {
		// given - precondition or setup
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEid(1);
		employeeDTO.setEmpName("Anil kumar");
		employeeDTO.setEmpAddress("bihar");
		employeeDTO.setEmpPassword("admin");
		employeeDTO.setEmpUserName("amit");
		employeeDTO.setEmpSalary("1000");

		Employee employee = new Employee();
		employee.setEid(1);
		employee.setEmpName("Anil kumar");
		employee.setEmpAddress("bihar");
		employee.setEmpPassword("admin");
		employee.setEmpUserName("amit");
		employee.setEmpSalary("1000");
		 

		when(employeeRepo.save(employee)).thenReturn(employee);
		 
		Employee updatedEmployee = employeeService.updateOrSave(employeeDTO);
		System.out.println("hello");
		System.out.println(updatedEmployee);
		

		// then - verify the output
		 assertThat(updatedEmployee).isEqualTo(employee);
	}

	@Test
	void getAllEmp() {
		employeeService.getAllEmp();
		verify(employeeRepo).findAll();
	}
	

}
