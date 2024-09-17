package Ejer;
import java.util.Scanner;
public class Ejer15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introfuzca cantidad de a");
		int a;
		do {
			System.out.println("introfuzca cantidad de a");
			a=sc.nextInt();
			
		}while(-1>=a);
		System.out.println(a);
	}
}
