package com.vishnu.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vishnu.hibernate.demo.entity.Student;

public class QueryStudentDemo {

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
			
			
			List<Student>  theStudents = session.createQuery("from Student").getResultList();
			
			displayStudents(theStudents);
			
			
			//LastName = "kumar"
			
			theStudents = session.createQuery("from Student s where s.lastName = 'kumar'").getResultList();
			System.out.println("\n\n Studnet having last name of kumar");
			
			displayStudents(theStudents);
			
			
			
			//query studnets : last name = "kumar" or firstName = vishnu
			
			theStudents  = session.createQuery("from Student s where s.lastName = 'kumar' OR s.firstName = 'raj'").getResultList();
			System.out.println("\n\n Studnet having last name of kumar and first name of vishnu");
			
			displayStudents(theStudents);
			
			//query to students where email like @vkmail.com
			theStudents  = session.createQuery("from Student s where s.email LIKE '%vkmail.com'").getResultList();
			System.out.println("\n\n Studnet having email like @vkmail.com");
			
			displayStudents(theStudents);
			
			session.getTransaction().commit();
			
			System.out.println("Done");
			
			
			
			
			
		}
		finally {
			factory.close();
		}
		
	}

	private static void displayStudents(List<Student> theStudents) {
		for(Student tempStudent :theStudents) {
			System.out.println(tempStudent);
		}
	}

}
