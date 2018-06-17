package com.java.hiberante.connect;



	
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jdbc.hib.Student;

public class Demo2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SessionFactory sf = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		Session  session =sf.getCurrentSession();
		try {
			Student s5=new Student("model","mahan","veer@email");
			session.beginTransaction();
		     System.out.println(s5);
			
			session.save(s5);
			//session.save(s2);
			session.getTransaction().commit();
			session  =sf.getCurrentSession();
			System.out.println(s5.getId());
			session.beginTransaction();
			
			Student obj = session.get(Student.class,s5.getId());
			session.getTransaction().commit();
			System.out.println(obj);
			System.out.println("done");
		}
		finally
		{
			sf.close();
		}
	}




	}


