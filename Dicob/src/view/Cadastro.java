package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class TelaCadastro implements ActionListener, {
	
	private JFrame janela;
	private JLabel título;
	private JButton cadastroUsuario;
	private JButton refreshUsuario;
	private JButton cadastroGrupo;
	private JButton refreshGrupo;
	private static ControleDados dados;
	private JList<String> listaUsuariosCadastrados;
	private JList<String> listaGruposCadastrados;
	private String[] listaNomes = new String [50];
	
	public void mostrarUsuariosCadastrados() {

		switch (op) {
		case 1: //Apresentar todos os usuários cadastrados
		{
			listaNomes =  new controleUsuario(dados).get;	
			
		}
		default:
			
		}
		
	}
	
}
