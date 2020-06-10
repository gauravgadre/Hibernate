package todays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

		StudentName stdname = new StudentName();
		stdname.setFname("raj");
		stdname.setLname("sharma");

		Student std = new Student();
		std.setRollno(103);
		std.setMarks(50);
		std.setName(stdname);
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.save(std);

		// to fetch value from DataBase get , load , find method
		std = (Student) session.load(Student.class, 1);
		System.out.println(std);
		tx.commit();

	}

}
