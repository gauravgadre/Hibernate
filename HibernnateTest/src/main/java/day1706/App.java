package day1706;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App {

	public static void main(String[] args) {
		
		  Question q=null;
		 Configuration cfg=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Answer.class).addAnnotatedClass(Question.class);
		    
		    SessionFactory sf=cfg.buildSessionFactory();
		    
		    Session session1=sf.openSession();
		    Transaction tx= session1.beginTransaction();
		    q =(Question)session1.get(Question.class,1);   
		        
		    System.out.println(q);
		        
	
		    tx.commit();
		    session1.close();
		    
		    Session session2=sf.openSession();
		    Transaction tx1= session2.beginTransaction();
		   q =(Question)session2.get(Question.class,1);   
		        
		    System.out.println(q);
		        
	
		    tx1.commit();
		    session2.close();
		    
		    
		    
		    
		  

	}

}
