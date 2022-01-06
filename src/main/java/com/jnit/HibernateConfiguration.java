package com.jnit;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HibernateConfiguration {
	
	@Autowired
	private EntityManagerFactory emf;
	
	@Bean
	public Session getSession() {
		return emf.unwrap(SessionFactory.class).openSession();
		
	}
	

}
