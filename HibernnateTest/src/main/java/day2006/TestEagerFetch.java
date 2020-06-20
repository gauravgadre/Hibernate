package day2006;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestEagerFetch {

	public static void main(String[] args) {
	

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Question.class);

		SessionFactory sf = cfg.buildSessionFactory();

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Question que = (Question) session.get(Question.class, 1);
		System.out.println(que.getQname());
		List<Answer> list= que.getAnswer();
		for(Answer a1:list)
		{
			System.out.println(a1);
			
		}

		tx.commit();
		

	}

}
