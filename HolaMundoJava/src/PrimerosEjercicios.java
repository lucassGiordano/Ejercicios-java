package a;

import java.util.Scanner;
public class PrimerosEjercicios {
	
	public static boolean prim(int a){
		for(int i=2;i<a/2;i++) {
			if(a%i==0){
				return false;
			}
		}
		return true;
	}

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
		case 2:{
			int a;
			do{
				System.out.println("Escribir un numero entre 1 y 100 para decir si es par o no");
				a=leer.nextInt();
				if(a>=0 && a<=100){
					if(a%2==0){
						System.out.println(a+" es par");
						break;
					}else {
						System.out.println("no es par");
						break;
					}
				}else {
					System.out.println("numero invalido");
				}
			}while(true);
		}
		case 3:{
			int a;
			do{
				System.out.println("Escribir un numero entre 50 y 100 para decir si es primo o no");
				a=leer.nextInt();
				if(a>=50 && a<=100){
					for(int i=2;i<a/2;i++) {
						if(a%i==0){
							System.out.println(a+" no es primo");
							return;
						}
					}
						System.out.println(a+" es primo");
						break;
				}else {
					System.out.println("numero invalido");
				}
			}while(true);
		}
		case 4:{
			int a;
			while(true) {
			System.out.println("Escribir un numero, el programa terminara cuando sea mayor a 100 y primo");
			a=leer.nextInt();
			if (a>100 & prim(a)==true) {
				System.out.println(a +"es mayor a 100 y primo");
				break;
			}
			}

		}
		case 5:{
			int a,b;
			char c;
			System.out.println("ingresar primer numero");
			a = leer.nextInt();
			System.out.println("ingresar operacion");
			c = leer.next().charAt(0);
			System.out.println("ingresar segundo numero");
			b = leer.nextInt();
		}
		}
		leer.close();
	}
	
}
