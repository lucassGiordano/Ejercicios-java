package Ejer;

import javax.swing.JOptionPane;//libreria para la ventana output

public class Ejer5 {
	public static void main(String[] args) {
		double pi= 3.14;
		String a = JOptionPane.showInputDialog("radio");//ventana con mensaje a dar
		double radio= Double.parseDouble(a);
		JOptionPane.showMessageDialog(null, "el area del circulo es "+(pi*(Math.pow(radio,2)))  );
			//no entiendo exactamente el porque del null

}
}
