package dao;

import java.sql.SQLException;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import model.AuthorBook;
import utility.HibernateConnectionManager;

public class AuthorBookDao implements AuthorBookDaoInterface{
	
	private SessionFactory sessionFactory = HibernateConnectionManager.getSessionFactory();

	@Override
	public void addbook(AuthorBook authorbook) throws SQLException
	{
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(authorbook);
		tx.commit();
		session.close();
	}
	
	@Override
	public AuthorBook selectbook(int id) 
	{
		Session session = this.sessionFactory.openSession();
		AuthorBook authorbook = session.get(AuthorBook.class, id);
		session.close();
		return authorbook;
	}


	@Override
	public List<AuthorBook> selectAllBooks() {
		Session session = this.sessionFactory.openSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<AuthorBook> query= builder.createQuery(AuthorBook.class);
		Root<AuthorBook> root = query.from(AuthorBook.class);
		query.select(root);
		Query<AuthorBook> q = session.createQuery(query);
		List<AuthorBook> listBook = q.getResultList();
		return listBook;
	}

	@Override
	public void deleteBook(int id) throws SQLException {
		Session session = this.sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		AuthorBook authorbook = session.get(AuthorBook.class, id);
		session.delete(authorbook);
		tx.commit();
		session.close();
		
	}

	@Override
	public void updateBook(AuthorBook authorbook) throws SQLException {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(authorbook);
		tx.commit();
		session.close();
		
	}


}
