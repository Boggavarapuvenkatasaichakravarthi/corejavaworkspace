package com.kani.hibernate.demo;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kani.hibernate.demo.entity.Instructor;
import com.kani.hibernate.demo.entity.InstructorDetail;
import com.kani.hibernate.demo.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.buildSessionFactory();	
		//create session 
		Session session	 = factory.getCurrentSession();

		try {
			// Create the objects
			Instructor instructor1 = new Instructor("GopiReddy", "greddy@gmail.com"); 
			InstructorDetail instructorDetail1 = new InstructorDetail("gopireddy", "rummy");
			// associate the objects
			instructor1.setInstructorDetail(instructorDetail1);
			// start a transaction
			System.out.println("Saving instructor: "+ instructor1);
			session.beginTransaction();
			// save the instructor 
			// Note: This will also save the instructor details object because of cascade type is ALL
			session.save(instructor1);
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done");
		}
		finally {
			session.close();
			factory.close();
		}
	}
}
