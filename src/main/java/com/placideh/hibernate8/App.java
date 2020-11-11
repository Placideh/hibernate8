package com.placideh.hibernate8;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//SECOND LEVEL CACHE
    	Alien a=null;
    	
    	Configuration con= new Configuration().configure()
    			.addAnnotatedClass(Alien.class);
    	SessionFactory sf=con.buildSessionFactory();
    	Session session =sf.openSession();
    	session.beginTransaction();
    	
    	
    	a=session.get(Alien.class, 102);
    	System.out.println(a);
    	session.getTransaction().commit();
    	session.close();
    	
    	Session session2 =sf.openSession();
    	session2.beginTransaction();
    	
		a=session2.get(Alien.class, 102);
		System.out.println(a);
		session2.getTransaction().commit();
    	session2.close();
    	  
	
		 
    	
    	
    }
}
