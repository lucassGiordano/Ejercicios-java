import java.util.Scanner;
public class PrimerosEjercicios {

	public static void main(String args[]){
		Scanner leer = new Scanner (System.in);
		
		int opc;
		System.out.println("Elegir opcion de 1 a 6 de ejercicios:");
		opc = leer.nextInt();
		switch(opc) {
		case 1:{
		int a=0;
		do {
		System.out.println("Ingrese un numero de 1 a 100");
		a = leer.nextInt();
		if (a>0 & a<101) {
			break;
		}
		}while(true);
		if(a%2==0) {
			System.out.println(a+" es par");
		}else {
			System.out.println(a+" no es par");
		}
		}
		}
		leer.close();
	}
	
}
