package Ejer;

import javax.swing.JOptionPane;

public class Ejer8 {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("ingresa un caracter");//ventana con mensaje a dar
		char c =a.charAt(0);
		int num= (int)c;	
		JOptionPane.showMessageDialog(null, num + " es el codigo ascii de "+ c  );
			//no entiendo exactamente el porque del null
	}
}
