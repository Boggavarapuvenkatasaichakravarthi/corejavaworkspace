package com.kani.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kani.hibernate.demo.entity.Task;

public class CreateTask {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									 .configure("hibernate.cfg.xml")
									 .addAnnotatedClass(Task.class)
									 .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			Task newTask = new Task("Taxes", "use quickbooks", true);
			session.beginTransaction();
			session.save(newTask);
			session.getTransaction().commit();
			System.out.println("Done");
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			session.close();
			factory.close();
		}
	}
}