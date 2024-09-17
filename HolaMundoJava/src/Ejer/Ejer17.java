package Ejer;
import java.util.Scanner;
public class Ejer17 {
	public static void main(String[] args) {
		System.out.println("introfuzca el dia de semana de lunes a domingo");
		Scanner sc = new Scanner(System.in);
		String b=sc.next();
		switch(b) {
		case"lunes":
		case"martes":
		case"miercoles":
		case"jueves":
		case"viernes":
		{System.out.println("dia laboral");break;}
		case"sabado":
		case"domingo":
		{
		System.out.println("dia no labora");break;
		}
		}
	}
}
