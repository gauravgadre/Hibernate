package day2306;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;

import day2006.Answer;
import day2006.Question;



public class Test {

	public static void main(String[] args) {
		
		
		 Configuration cfg=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
		    
		    SessionFactory sf=cfg.buildSessionFactory();
		    
		    Session session=sf.openSession();
		    Transaction tx= session.beginTransaction();
		      
		    int mark= 50;
		    int rollno=5;
		/*
		 * Query q= session.
		 * createQuery("select rollno, name ,marks from Student s where s.marks> :marks and s.rollno>:rollno"
		 * ); q.setParameter("marks", mark); q.setParameter("rollno", rollno);
		 * 
		 * List<Object[]> st1= (List<Object[]>)q.list();
		 * 
		 * for(Object[] st:st1) {
		 * 
		 * 
		 * System.out.println(st[0]+" "+st[1]+" "+st[2]); }
		 */
		    
		/*
		 * Query q= session.createQuery("delete from Student s where s.marks= :marks ");
		 * q.setParameter("marks", mark);
		 * 
		 * int q1=q.executeUpdate();
		 * 
		 * System.out.println("deleted records="+q1);
		 */
			 String name="raju";
		 
		/*
		 * Query q=
		 * session.createQuery("update Student s set name= :name where s.marks= :marks "
		 * ); q.setParameter("marks", mark); q.setParameter("name", name);
		 * 
		 * int q1=q.executeUpdate();
		 * 
		 * System.out.println("updated records="+q1);
		 */

		/*
		 * Query q= session.
		 * createQuery("select q.Qname ,q.Qid,a.Aname from Question as q INNER JOIN q.answer as a  "
		 * ); List<Object[]> list= (List<Object[]>)q.getResultList();
		 * 
		 * for(Object[] obj:list) {
		 * 
		 * System.out.println(Arrays.deepToString(obj)); }
		 */
			 int marks=50;
			 
		/*
		 * Query q= session.createSQLQuery("select * from student where marks> :marks");
		 * q.setParameter("marks", marks); List<Object[]>
		 * list=(List<Object[]>)q.getResultList();
		 * 
		 * for(Object[] ob:list) { System.out.println(Arrays.deepToString(ob));
		 * 
		 * }
		 */
			 
			Criteria c= session.createCriteria(Student.class);
			  c.add(Restrictions.lt("marks", 80));
			    
		    List<Student> list= c.list(); 
		  for(Student st: list) {
		    	
		    	System.out.println(st.getRollno()+" "+ st.getName()+" "+st.getMarks());
		    }
			
		    tx.commit();
	
		    

	}

}
