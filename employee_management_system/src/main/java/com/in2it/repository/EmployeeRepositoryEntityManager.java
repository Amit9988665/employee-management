package com.in2it.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.in2it.wrapperobject.EmployeeAndDepartmentData;

@Repository
public class EmployeeRepositoryEntityManager {

	@PersistenceContext
	private EntityManager entityManager;

	public EmployeeAndDepartmentData findAllEmpAndDep() {

		String jpql = "select em.empName, em.empAddress, dep.depName, dep.depAddress  from Employee em join Department dep on dep.did = em.eid";
		TypedQuery<EmployeeAndDepartmentData> query = entityManager.createQuery(jpql, EmployeeAndDepartmentData.class);
		return query.getSingleResult();
	}

}
