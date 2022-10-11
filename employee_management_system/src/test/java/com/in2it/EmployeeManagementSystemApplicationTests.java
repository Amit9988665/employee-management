package com.in2it;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeManagementSystemApplicationTests {

	Calculator1 calculator1 = new Calculator1();
//	@Autowired
//	EmployeeService employeeService;
//
//	@Autowired
//	EmployeeRepo employeeRepo;

	@Test
	void contextLoads() {

	}

//	@Test
//	void testSum() {
//		int excepectedResult = 15;
//
//		int actualResult = calculator1.doSum(3, 5, 7);
//		assertThat(actualResult).isEqualTo(excepectedResult);
//	}
//
//	@Test
//	void getByIdEmp() throws UserCustumException {
//		Employee employee = new Employee();
//		employee.setEid(1);
//		employee.setEmpName("Amit Kumar");
//		employee.setEmpAddress("Grater Noida");
//		employee.setEmpSalary("1000");
//		employee.setEmpPassword("admin");
//		employee.setEmpUserName("amit");
//
//		System.out.println(employee);
//
//		Employee employee2 = employeeService.getByEmpId(1);
//		System.out.println(employee2);
//		// assertThat(employee2).isEqualTo(employee);
//		assertThat(employee2).isEqualToComparingFieldByField(employee2);
//
//	}

}
