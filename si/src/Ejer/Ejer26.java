package Ejer;
import java.util.Scanner;
public class Ejer26 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b;
        do {
        System.out.println("ingrese un numero mayor a 1");
         b = sc.nextInt();
        }while(b<1);
        System.out.println("El resultado es :" + (a + b));
        //segun el operador es la cuenta que vamos a hacer y solo tendremos + - / *
        
 
    
         sc.close();
    }
}
