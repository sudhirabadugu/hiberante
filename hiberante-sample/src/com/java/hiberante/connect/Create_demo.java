package com.java.hiberante.connect;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jdbc.hib.Student;

public class Create_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SessionFactory sf = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		Session  session =sf.getCurrentSession();
		try {
			session.beginTransaction();
		
			Student s1=new Student("hgggghjgb","ktmhhmmjuiiuy","kfjkdkjgkjtkf@email");
			Student s2=new Student("m","wo","kldfif@email");
			
			
			session.save(s1);
			session.save(s2);
			session.getTransaction().commit();
			System.out.println("done");
		}
		finally
		{
			sf.close();
		}
	}

}
