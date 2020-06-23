package day2206;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Test {

	public static void main(String[] args) {
		
		
		 Configuration cfg=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
		    
		    SessionFactory sf=cfg.buildSessionFactory();
		    
		    Session session=sf.openSession();
		    Transaction tx= session.beginTransaction();
		    
//		    for single result use method- uniqueResult() and for multiple result use method- list()
		      
		    int mark= 50;
		    int rollno=5;
		 Query q=  session.createQuery("select rollno, name ,marks from Student s where s.marks> :marks and s.rollno>:rollno");
		 q.setParameter("marks", mark);
		 q.setParameter("rollno", rollno);
		
List<Object[]> st1= (List<Object[]>)q.list();

for(Object[] st:st1) {
		
	
			System.out.println(st[0]+" "+st[1]+" "+st[2]);
}
		
		 
		        
		    tx.commit();
	
		    

	}

}
