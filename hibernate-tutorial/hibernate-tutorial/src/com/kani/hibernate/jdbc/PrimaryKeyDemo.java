package com.kani.hibernate.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kani.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();	
		//create session 
		Session session	 = factory.getCurrentSession();

		try {
			//create the student object
			System.out.println("Creating the Student");
			Student s1 = new Student("Shah", "Rukh Khan", "srk@gmail.com");
			//start a transaction
			session.beginTransaction();
			System.out.println("Saving the student");
			//save the student object
			session.save(s1);
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done");
		}
		finally {
			session.close();
			factory.close();
		}
	}


}
