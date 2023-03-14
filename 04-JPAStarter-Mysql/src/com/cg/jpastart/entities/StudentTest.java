package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentTest {

	public static void main(String[] args) {
		//SessionFactory  factory
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		//Session 
		EntityManager em = factory.createEntityManager();
		//Transaction 
		em.getTransaction().begin();
		
		Student student = new Student();
		student.setName("Mohan");
		student.setStudentId(20);
		
		em.persist(student);
		
		em.getTransaction().commit();
		
		System.out.println("Added one student to database.");
		em.close();
		factory.close();
	}
}
