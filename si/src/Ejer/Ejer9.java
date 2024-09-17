package Ejer;

import javax.swing.JOptionPane;

public class Ejer9 {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("ingresa un precio");//ventana con mensaje a dar
		int num= Integer. parseInt(a);	
		JOptionPane.showMessageDialog(null," el precio con iva es : "+ ((num*0.21)+num)  );
			//no entiendo exactamente el porque del null
	}
}
