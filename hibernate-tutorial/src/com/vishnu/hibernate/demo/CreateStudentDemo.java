package com.vishnu.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vishnu.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration()
									 .configure("hibernate.cfg.xml")
									 .addAnnotatedClass(Student.class)
									 .buildSessionFactory();
		
		//create session
		
		Session session = factory.getCurrentSession();
		
		try {
			//use the session object to save Java object;
			System.out.println("Creating new student Object...");
			Student tempStudent = new Student("Vishnu","Kumar","vk@vkmail.com");
			
			session.beginTransaction();
			
			System.out.println("Saving the student...");
			
			session.save(tempStudent);
			
			session.getTransaction().commit();
			
			System.out.println("Done");
			
			
			
			
			
		}
		finally {
			factory.close();
		}
		
	}

}
