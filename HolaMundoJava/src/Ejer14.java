package Ejer;
import java.util.Scanner;
public class Ejer14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introfuzca cantidad de a");
		int a=sc.nextInt();
		System.out.println("introfuzca cantidad de b");
		int b=sc.nextInt();
		System.out.println("introfuzca cantidad de c");
		int c=sc.nextInt();
		
		double discriminante=Math.pow(b, 2)-(4*a*c);
		
					
		if (discriminante>0){
            double x1=((b*(-1))+Math.sqrt(discriminante))/(2*a);
            double x2=((b*(-1))-Math.sqrt(discriminante))/(2*a);
 
            System.out.println("El valor de x1 es "+x1+" y el valor de x2 es "+x2);
        }else{
            System.out.println("El discriminante es negativo");
        }
	}
}

