package model;

import java.util.*;

public class Usuario {

	//Attributes
	private String nomeUsuario;
	private String emailUsuario;
	private int cpfUsuario;
	
	public static List<Usuario> usuario;
	
	
	//Reference to this attributes
	public Usuario (String nomeUsuario, String emailUsuario, int cpfUsuario){
		this.nomeUsuario = nomeUsuario;
		this.emailUsuario = emailUsuario;
		this.cpfUsuario = cpfUsuario;
	}
	
	//Constructor of user in a LinkedList
	public Usuario(){
		usuario = new LinkedList<>();
	}
	
	public void cadastraUsuario(){
		Usuario u = new Usuario(nomeUsuario, emailUsuario, cpfUsuario);
		usuario.add(u);
	}		
		
		//Sets and gets of users
		public void setNomeUsuario (String nomeUsuario) {
				this.nomeUsuario = nomeUsuario;
			}
		
		public void setCpfUsuario(int cpfUsuario) {
				this.cpfUsuario = cpfUsuario;
			}
			
		public void setEmailUsuario(String emailUsuario) {
				this.emailUsuario = emailUsuario;
			}
		
		public String getNomeUsuario() {
				return nomeUsuario;
			}
		
		public int getCpfUsuario() {
				return cpfUsuario;
			}
		
		public String getEmailUsuario() {
				return emailUsuario;
			}	
	}	


