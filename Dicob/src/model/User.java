package model;

import java.util.*;

public class User {

	//Attributes
	private String nameUser;
	private String emailUser;
	private int cpfUser;
	
	//Create the list of users
	private static List <User> user;
	
	//Reference to this attributes
	public User (String nameUser, String emailUser, int cpfUser){
		this.nameUser = nameUser;
		this.emailUser = emailUser;
		this.cpfUser = cpfUser;
	}
	
	//Constructor of user in a LinkedList
	public User(){
		user = new LinkedList<User>();
	}
	
	
	//Sets and gets of users
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	
	public void setCpfUser(int cpfUser) {
		this.cpfUser = cpfUser;
	}
	
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}
	
	public String getNameUser() {
		return nameUser;
	}
	
	public int getCpfUser() {
		return cpfUser;
	}
	
	public String getEmailUser() {
		return emailUser;
	}	
	
	//Constructor of a user
	public void criarUser() {
		User u = new User (nameUser, emailUser, cpfUser);
		user.add(u);
		
	}

}

