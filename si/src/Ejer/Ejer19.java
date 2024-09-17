package Ejer;
import java.util.Scanner;
public class Ejer19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b;
		do {
			System.out.println("introduzca numero positivo para contar las cifras");
			b=sc.nextInt();	
		}while(b<0);
		
		for(int a=b;b>0;b/=10) {
			
		}
		
	}
}
