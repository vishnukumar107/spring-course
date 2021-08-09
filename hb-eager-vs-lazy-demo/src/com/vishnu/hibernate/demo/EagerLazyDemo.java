package com.vishnu.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vishnu.hibernate.demo.entity.Course;
import com.vishnu.hibernate.demo.entity.Instructor;
import com.vishnu.hibernate.demo.entity.InstructorDetail;

public class EagerLazyDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration()
									 .configure("hibernate.cfg.xml")
									 .addAnnotatedClass(Instructor.class)
									 .addAnnotatedClass(InstructorDetail.class)
									 .addAnnotatedClass(Course.class)
									 .buildSessionFactory();
		
		//create session
		
		Session session = factory.getCurrentSession();
		
		try {
			
			//create the object
			
			
			
			session.beginTransaction();
			
			int theId = 1;
			
			Instructor tempInstructor = session.get(Instructor.class, theId);
			
			System.out.println("vk:Instructor: "+ tempInstructor);
			System.out.println("vk:Courses: "+ tempInstructor.getCourses());
			
			session.getTransaction().commit();
			
			session.close();
			System.out.println("vk: the session is now closed! \n");
			System.out.println("vk:Courses: "+ tempInstructor.getCourses());
			
			
			System.out.println("vk:Done");
			
			
			
			
			
		}
		
		finally {
			//session.close();
			factory.close();
		}
		
	}

}
