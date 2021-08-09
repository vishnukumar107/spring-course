package com.vishnu.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vishnu.hibernate.demo.entity.Course;
import com.vishnu.hibernate.demo.entity.Instructor;
import com.vishnu.hibernate.demo.entity.InstructorDetail;
import com.vishnu.hibernate.demo.entity.Review;
import com.vishnu.hibernate.demo.entity.Student;

public class CreateCourseForvkDemo {

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
			System.out.println("Courses: "+ tempStudent.getCourses());
			
			Course tempCourse1 = new Course("boxing course");
			Course tempCourse2 = new Course("rubik's cube course");
			
			
			tempCourse1.addStudent(tempStudent);
			tempCourse2.addStudent(tempStudent);
			
			
			System.out.println("\n saving the courses....");
			
			session.save(tempCourse1);
			session.save(tempCourse2);
			
			
			session.getTransaction().commit();
			
			System.out.println("Done");
			
			
			
			
			
		}
		finally {
			session.close();
			factory.close();
		}
		
	}

}
