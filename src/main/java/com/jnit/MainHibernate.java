package com.jnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainHibernate implements CommandLineRunner{

	@Autowired
	private EmployeeDao employeeDao;

	public static void main(String[] args) {
		SpringApplication.run(MainHibernate.class, args);
	}

	public void run(String arg[]) {
		Employee rahul = new Employee();
		rahul.setName("Dinesh kumar");
		rahul.setSalary(45000);
		//employeeDao.saveEmployee(rahul);
		//employeeDao.selectEmployee();
		//employeeDao.updateEmployee();
		employeeDao.deleteEmployee();
	}
	
	

}
