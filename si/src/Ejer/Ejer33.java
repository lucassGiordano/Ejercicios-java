package Ejer;
import java.util.Scanner;
public class Ejer33 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("Escribe el texto a buscar el cuarto y quinto caracter");
        a= sc.nextLine();
        System.out.println("El cuarto y quinto caracter son: "+ a.substring(3,4) + " "+ a.substring(4,5));
        sc.close();

    }
}
