package com.techno.HibernnateTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {

    Student std =new Student(0,"techno");
    //std.setRollno(103);
    //std.setName("vishnu");
    Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class);
    
    SessionFactory sf=cfg.buildSessionFactory();
    
    Session session=sf.openSession();
    Transaction tx= session.beginTransaction();
    
    session.save(std);
    tx.commit();
    	
    }
}
