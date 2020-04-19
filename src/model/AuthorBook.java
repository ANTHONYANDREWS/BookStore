package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AuthorBook {
	
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="bookname")
	private String bookname;
	@Column(name="price")
	private String price;
	@Column(name="publishedyear")
	private int publishedyear;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getPublishedyear() {
		return publishedyear;
	}
	public void setPublishedyear(int publishedyear) {
		this.publishedyear = publishedyear;
	}


}
