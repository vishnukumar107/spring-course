package com.vishnu.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vishnu.hibernate.demo.entity.Course;
import com.vishnu.hibernate.demo.entity.Instructor;
import com.vishnu.hibernate.demo.entity.InstructorDetail;

public class CreateCoursesDemo {

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
			
			Instructor tempInstructor = new Instructor("kali","dass","kali@vkmail.com");
			
			InstructorDetail tempInstructorDetail = new InstructorDetail("www.kali.com","cooking");
			
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			session.beginTransaction();
			
			System.out.println("saving Instructor:" + tempInstructor);
			// this will also save the details object because of Cascade all
			session.save(tempInstructor);
			
			session.getTransaction().commit();
			
			System.out.println("Done");
			
			
			
			
			
		}
		finally {
			session.close();
			factory.close();
		}
		
	}

}
