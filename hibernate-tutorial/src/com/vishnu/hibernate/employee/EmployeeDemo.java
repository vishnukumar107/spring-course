package com.vishnu.hibernate.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vishnu.hibernate.demo.entity.Student;

public class EmployeeDemo {

	public static void main(String[] args) {
		// create session factory
				SessionFactory factory = new Configuration()
											 .configure("hibernate.cfg.xml")
											 .addAnnotatedClass(Employee.class)
											 .buildSessionFactory();
				
				//create session
				
				Session session = factory.getCurrentSession();
				
				try {
					session.beginTransaction();
						
					Employee myEmployee1 = new Employee("vinoth","ramuk","infosys");
					
					System.out.println("Adding employee details:" + myEmployee1);
					
					session.save(myEmployee1);
					
					
					
					session.getTransaction().commit();
					System.out.println("Over!!!");
					
				}
				finally {
					factory.close();
				}
	}

}
