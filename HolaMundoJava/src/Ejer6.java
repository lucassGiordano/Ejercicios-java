package ej;

import javax.swing.JOptionPane;//libreria para la ventana output

public class Ejer6 {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("radio");//ventana con mensaje a dar
		int radio= Integer.parseInt(a);
		JOptionPane.showMessageDialog(null, "aaa"  );
			//no entiendo exactamente el porque del null

	}
}
