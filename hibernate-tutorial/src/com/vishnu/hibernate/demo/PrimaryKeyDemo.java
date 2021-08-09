package com.vishnu.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vishnu.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

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
					System.out.println("Creating 3 student Object...");
					Student tempStudent1 = new Student("Vishnu","Kumar","vk@vkmail.com");
					Student tempStudent2= new Student("Mani","Vk","km@mani.com");
					Student tempStudent3 = new Student("Kali","Prassana","kali@gmail.com");
					
					session.beginTransaction();
					
					System.out.println("Saving the student...");
					
					session.save(tempStudent1);
					session.save(tempStudent2);
					session.save(tempStudent3);
					
					session.getTransaction().commit();
					
					System.out.println("Done");
					
					
					
					
					
				}
				finally {
					factory.close();
				}

	}

}
