package com.jnit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	
	@Autowired
	private Session session;
	
	
	public void saveEmployee(Employee ee) {
		
		Transaction tx = session.beginTransaction();
		session.save(ee);
		tx.commit();
		
	}

	public void selectEmployee() {
		
		Employee ee = session.load(Employee.class,1);
				System.out.println(ee.getName()+" "+ee.getSalary());
				
	}
	
	public void updateEmployee() {
		Transaction tx = session.beginTransaction();
		Employee ee = session.load(Employee.class,1);
		ee.setSalary(55000);
         session.update(ee);
         tx.commit();
         
	}
	
	public void deleteEmployee() {
		Transaction tx = session.beginTransaction();
		Employee ee = session.load(Employee.class,3);
		session.delete(ee);
	    tx.commit();
		
		
	}
}
