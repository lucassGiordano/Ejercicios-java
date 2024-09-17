package Ejer;

import javax.swing.JOptionPane;

public class Ejer7 {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("ingresa un numero");//ventana con mensaje a dar
		int radio= Integer.parseInt(a);
		char c= (char)radio;
		JOptionPane.showMessageDialog(null, c + " es este numero en codigo ascii de "+a  );
			//no entiendo exactamente el porque del null
	}
}
