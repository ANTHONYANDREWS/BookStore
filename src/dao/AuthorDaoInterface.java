package dao;

import model.Author;

public interface AuthorDaoInterface {
	
	int signupAuthor(Author author);
	boolean loginAuthor(Author author);

}
