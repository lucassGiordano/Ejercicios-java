package Ejer;
import java.util.Scanner;
public class Ejer18 {
	public static void main(String[] args) {
		System.out.println("introfuzca el numero maximo del random");
		Scanner sc = new Scanner(System.in);
		int b=sc.nextInt();
		System.out.println("introfuzca el numero minimo del random");
		int a=sc.nextInt();
		int random= (int)(Math.random()*(b-a+1)+a);
		System.out.println(random);
	}
}
