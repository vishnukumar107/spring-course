package com.vishnu.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vishnu.hibernate.demo.entity.Course;
import com.vishnu.hibernate.demo.entity.Instructor;
import com.vishnu.hibernate.demo.entity.InstructorDetail;
import com.vishnu.hibernate.demo.entity.Review;
import com.vishnu.hibernate.demo.entity.Student;

public class StudentDeleteDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration()
									 .configure("hibernate.cfg.xml")
									 .addAnnotatedClass(Instructor.class)
									 .addAnnotatedClass(InstructorDetail.class)
									 .addAnnotatedClass(Course.class)
									 .addAnnotatedClass(Review.class)
									 .addAnnotatedClass(Student.class)
									 .buildSessionFactory();
		
		//create session
		
		Session session = factory.getCurrentSession();
		
		try {
			
			
			
			session.beginTransaction();
			
			
			int theId = 1;
			
			Student tempStudent = session.get(Student.class, theId);
			
			System.out.println("\nLoaded student :" + tempStudent);
			
			session.delete(tempStudent);
			
			
			session.getTransaction().commit();
			
			System.out.println("Done");
			
			
			
			
			
		}
		finally {
			session.close();
			factory.close();
		}
		
	}

}
