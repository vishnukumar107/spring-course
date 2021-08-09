package com.vishnu.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vishnu.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration()
									 .configure("hibernate.cfg.xml")
									 .addAnnotatedClass(Student.class)
									 .buildSessionFactory();
		
		//create session
		
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			int studentId = 1;
			//Student myStudent = session.get(Student.class, studentId);
			//System.out.println("The student id" + studentId);// retrieve and delete
			
			//session.delete(myStudent);
			
			//System.out.println("Deleted" + myStudent);
			
			
			System.out.println("update email for all student");
			
			session.createQuery("delete from Student where id = 2").executeUpdate();
			
			session.getTransaction().commit();
			
			
			System.out.println("Done");

			
		}
		finally {
			factory.close();
		}
		
	}

}
