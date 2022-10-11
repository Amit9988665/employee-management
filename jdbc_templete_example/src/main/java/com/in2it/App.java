package com.in2it;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
//		List<Employee> list=dao.getAllEmployeesRowMapper();
//		Employee e=dao.getByEmployeeId(11);
		
		Employee employee=new Employee();
		employee.setId(29);
		employee.setName("sandeep");
		employee.setSalary("20000");
		
		 
//			System.out.println(dao.saveEmployee(employee));
//		System.out.println(dao.deleteByEmployeeId(30));
		System.out.println(dao.updateEmployee(employee));
    }
}
