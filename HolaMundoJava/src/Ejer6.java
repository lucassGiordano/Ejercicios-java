package hola;

import javax.swing.JOptionPane;//libreria para la ventana output

public class hola {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("radio");//ventana con mensaje a dar
		int radio= Double.parseDouble(a);
		JOptionPane.showMessageDialog(null,   );
			//no entiendo exactamente el porque del null

	}
}
