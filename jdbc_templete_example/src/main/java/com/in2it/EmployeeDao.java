package com.in2it;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao {
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public List<Employee> getAllEmployeesRowMapper() {
		return template.query("select * from employee", new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(3));
				e.setSalary(rs.getString(2));
				return e;
			}
		});
	}

	public Employee getByEmployeeId(int eid) {
		String query = "select * from employee where eid=?";
		return template.queryForObject(query, new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(3));
				e.setSalary(rs.getString(2));
				return e;
			}
		}, eid);
	}

	public String saveEmployee(Employee employee) {
		String query = "INSERT INTO employee(eid, emp_name , emp_salary) VALUES (?, ?, ?)";
		template.update(query, employee.getId(), employee.getName(), employee.getSalary());
		return "Save sussecefully";
	}

	public String deleteByEmployeeId(int eid) {
		String query = "delete from employee where eid=?";
		template.update(query, eid);
		return "delete sucessesfully";
	}

	public String updateEmployee(Employee employee) {
		String query = "UPDATE employee SET emp_name = ?, emp_salary =? WHERE eid=?";
		template.update(query, employee.getName(), employee.getSalary(), employee.getId());
		return "Update sussecefully";
	}

	public String deleteByEmployeeIdRow(int eid) {
		String query = "delete from employee where eid=?";
		template.queryForObject(query, new RowMapper<Employee>() {

			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

				return null;
			}
		});
		return "delete sucessesfully";
	}
}
