package model;

import java.time.LocalDateTime;

public class User
{
  String mail;
  String password;
  LocalDateTime date;
  
  public User(String mail, String password, LocalDateTime date) {
	super();
	this.mail = mail;
	this.password = password;
	this.date = date;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public LocalDateTime getDate() {
	return date;
}
}