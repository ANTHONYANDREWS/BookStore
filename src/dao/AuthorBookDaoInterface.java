package dao;

import java.sql.SQLException;
import java.util.List;

import model.AuthorBook;

public interface AuthorBookDaoInterface {
	
	void addbook(AuthorBook authorbook) throws SQLException;
	AuthorBook selectbook(int id);
	List<AuthorBook> selectAllBooks();
	void deleteBook(int id) throws SQLException;
	void updateBook(AuthorBook authorbook) throws SQLException;
	

}
