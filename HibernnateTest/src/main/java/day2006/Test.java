package day2006;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {

	public static void main(String[] args) {
		 Configuration cfg=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Answer.class).addAnnotatedClass(Question.class);
		    
		    SessionFactory sf=cfg.buildSessionFactory();
		    Session session=sf.openSession();
		    Transaction tx= session.beginTransaction();
		    
		    Answer ans1= new Answer();
		    ans1.setAname("1st ans");
		    
		    Answer ans2= new Answer();
		    ans2.setAname("2nd ans");
		    
		    List<Answer> list= new ArrayList<Answer>();
		    list .add(ans1);
		    list.add(ans2);
		    
Question que= new Question();
que.setQname("2nd que ?");
que.setAnswer(list);

ans1.setQue(que);

ans2.setQue(que);
		    
		    session.save(que);
		    
		    tx.commit();
		    		
		    
	}

}
