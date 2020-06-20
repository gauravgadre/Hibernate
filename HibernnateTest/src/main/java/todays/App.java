package todays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import day1706.Student;



public class App {

	public static void main(String[] args) {

		

		

		
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Student1.class);

		SessionFactory sf = cfg.buildSessionFactory();

		 Session session1=sf.openSession();
		 
		
		    Transaction tx= session1.beginTransaction();
		    Student1 std= (Student1)  session1.get(Student1.class, 1);
		System.out.println(std);
		    tx.commit();
		    session1.close();
		    
		    Session session12=sf.openSession();
			 
			
		    Transaction tx2= session12.beginTransaction();
		    Student1 std2= (Student1)  session12.get(Student1.class, 1);
		System.out.println(std2);
		    tx2.commit();
		    session12.close();
		    
		    

	}

}
