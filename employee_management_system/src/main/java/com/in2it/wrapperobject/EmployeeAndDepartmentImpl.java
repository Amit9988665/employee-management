package com.in2it.wrapperobject;

import org.springframework.beans.factory.annotation.Value;

public interface EmployeeAndDepartmentImpl {

	@Value(value = "#{target.emp_name}")
	String getEmpName();

	@Value(value = "#{target.emp_address}")
	String getEmpAddress();

	@Value(value = "#{target.dep_name}")
	String getDepName();

	@Value(value = "#{target.dep_address}")
	String getDepAddress();

}
