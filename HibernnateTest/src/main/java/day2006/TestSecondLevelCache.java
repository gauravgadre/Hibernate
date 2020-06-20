package day2006;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestSecondLevelCache {

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Student std = (Student) session.get(Student.class, 4);
		System.out.println(std.getName());

		tx.commit();
		session.close();

		Session session1 = sf.openSession();
		Transaction tx1 = session1.beginTransaction();
		Student std1 = (Student) session1.get(Student.class, 4);
		System.out.println(std1.getName());
		tx1.commit();
		session1.close();

	}

}
