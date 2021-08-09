package com.vishnu.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vishnu.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

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
			
			session.beginTransaction();
			
			int studentId = 1;
			Student myStudent = session.get(Student.class, studentId);
			System.out.println("The student id" + studentId);
			
			myStudent.setFirstName("vishnu kumar mani");
			
			session.getTransaction().commit();
			
			System.out.println("Get Complete:" + myStudent);
			
			
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			System.out.println("update email for all student");
			
			session.createQuery("update Student set email = 'google@gmail.com'").executeUpdate();
			
			session.getTransaction().commit();
			
			
			System.out.println("Done");
			
			
			
			
			
		}
		finally {
			factory.close();
		}
		
	}

}
