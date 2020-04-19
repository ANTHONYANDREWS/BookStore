package dao;

import org.hibernate.Transaction;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import javax.persistence.EntityTransaction;

import model.Author;
import utility.HibernateConnectionManager;

public class AuthorDao implements AuthorDaoInterface{
	
	private SessionFactory sessionFactory = HibernateConnectionManager.getSessionFactory();

	@Override
	public int signupAuthor(Author author) {
		
		Session session = this.sessionFactory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		if(session.save(author)!=null)
		{
			transaction.commit();
			session.close();
			return 1;
		}
		else {
			return 0;
		}
		
	}

//	@Override
	public boolean loginAuthor(Author author) {
		Session session = this.sessionFactory.openSession();
		Transaction tx=null;
		
		boolean login = false;
		
		try {
			tx= session.getTransaction();
			 tx.begin();
			Query query = session.createQuery("from Author where email='"+author.getEmail()+"'"+"and password='"+author.getPassword()+"'");
		    author = (Author) query.uniqueResult();
		    login = true;
			tx.commit();
			
			 return login;
		}
		catch(Exception e) {
			if(tx!=null)
				try {
					tx.rollback();
				}
			catch(Exception e1) {
				e1.printStackTrace();
			}
		}
	finally {
		session.close();
	}
	return true;
		
	}
}
