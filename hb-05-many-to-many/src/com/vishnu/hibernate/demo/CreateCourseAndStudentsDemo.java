package com.vishnu.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vishnu.hibernate.demo.entity.Course;
import com.vishnu.hibernate.demo.entity.Instructor;
import com.vishnu.hibernate.demo.entity.InstructorDetail;
import com.vishnu.hibernate.demo.entity.Review;
import com.vishnu.hibernate.demo.entity.Student;

public class CreateCourseAndStudentsDemo {

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
			
			Course tempCourse = new Course("badmintion course");
			
			
			
			
			
			session.save(tempCourse);
			
			System.out.println("\n saved the course:" + tempCourse);
			
			
			Student tempStudent1 = new Student("vk","kumar","vk@gmail.com");
			Student tempStudent2 = new Student("kali","dass","dassss@gmail.com");
			
			tempCourse.addStudent(tempStudent1);
			tempCourse.addStudent(tempStudent2);
			
			
			session.save(tempStudent1);
			session.save(tempStudent2);
			
			System.out.println("saved the students: "+ tempCourse.getStudents());
			
			session.getTransaction().commit();
			
			System.out.println("Done");
			
			
			
			
			
		}
		finally {
			session.close();
			factory.close();
		}
		
	}

}
