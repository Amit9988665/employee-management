package com.in2it.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.in2it.model.Employee;
import com.in2it.wrapperobject.EmployeeAndDepartmentData;
import com.in2it.wrapperobject.EmployeeAndDepartmentImpl;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	@Query(value = "select em.emp_name, em.emp_address, dep.dep_name, dep.dep_address  from Employee em join Department dep on dep.did = em.eid",nativeQuery = true)
	public String findAllEmplAndDep();

	
	@Query(value ="select em.emp_name, em.emp_address, dep.dep_name, dep.dep_address  from Employee em join Department dep on dep.did = em.eid",nativeQuery = true)
	public EmployeeAndDepartmentImpl findAllEmplAndDepartment();
	
	@Query(value = "select em.emp_name, em.emp_address, dep.dep_name, dep.dep_address  from Employee em join Department dep on dep.did = em.eid", nativeQuery = true)
	public Optional<EmployeeAndDepartmentData> findAllEmplAndDepartmentclass();
	
	@Query("select e from Employee e  where e.empSalary>2000")
	public List<Employee> getAllEmpBySalaryGreaterThen();

	/*
	 * @Query(value = " SELECT\r\n" + "  employee.* ,\r\n" + "  department.*\r\n" +
	 * "FROM employee\r\n" + "JOIN department\r\n" +
	 * "  ON employee.eid  =department.did\r\n" + "JOIN employee_departments\r\n" +
	 * "  ON employee_departments.empolyees_eid  =department.did where employee_departments.empolyees_eid =1"
	 * , nativeQuery = true)
	 */
	@Query("Select e from Employee e where e.eid=?1")
	public Employee getDepByEmpId(int eid);
}
