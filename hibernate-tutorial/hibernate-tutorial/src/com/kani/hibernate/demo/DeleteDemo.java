package com.kani.hibernate.demo;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kani.hibernate.demo.entity.Instructor;
import com.kani.hibernate.demo.entity.InstructorDetail;
import com.kani.hibernate.demo.entity.Student;

public class DeleteDemo {

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
			//Start a transaction
			session.beginTransaction();
			//get instructor by primary key/id
			int theId = 2;
			Instructor ins1 = session.get(Instructor.class, theId);
			System.out.println("Found the Instructor" + ins1);
			//delete that instructor
			if(ins1!=null) {
				System.out.println("The instructor with id 2 is about to be deleted");
				session.delete(ins1);
				// This will also delete the detail entry because cascade is ALL
			}
			session.getTransaction().commit();
		}
		finally {
			session.close();
			factory.close();
		}
	}
}
