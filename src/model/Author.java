package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Author {
	
	@Id
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="dt")
	private LocalDate date;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date2) {
	this.date = date2;
}
}
