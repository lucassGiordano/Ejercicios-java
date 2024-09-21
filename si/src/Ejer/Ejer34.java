package Ejer;
import java.util.Scanner;
public class Ejer34 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("Escribe el texto a buscar el cuarto y quinto caracter");
        a= sc.nextLine();
        for(int i=0;i<a.length();i++) {
        	 System.out.print(a.substring(i,i+1));
        	 if(a.charAt(i)==' ')System.out.print("\n");
        }

    }
}
