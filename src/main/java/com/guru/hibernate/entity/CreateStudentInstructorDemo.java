package com.guru.hibernate.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentInstructorDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			Instructor theInstructor = new Instructor("John", "Doe", "doe@yahoo.com", 15000.00);
			Student theStudent = new Student("Guru", "Prasad", "gurucv@gmail.com", "Java s-2");

			session.getTransaction().begin();
			session.save(theInstructor);
			session.save(theStudent);
			session.getTransaction().commit();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			session.close();
			factory.close();
		}
	}
}
