package Ejer;
import java.util.Scanner;
public class Ejer25 {
	public static void main(String[] args) {
        System.out.println("Ingrese los numeros que quieras operar y la operacion\n");
        System.out.println("Primer numero:");
        //Scanner funcion que toma los datos a ingresar
        Scanner sc = new Scanner(System.in);
        try{
        int a = sc.nextInt();
        System.out.println("\nIngrese segundo numero:");
        int b = sc.nextInt();
        System.out.println("\nIngrese la operacion:");
        char oper = sc.next().charAt(0);
        System.out.println("\n");
        //segun el operador es la cuenta que vamos a hacer y solo tendremos + - / *
        switch (oper) {
            case '+':
                System.out.println("El resultado es :" + (a + b));
                break;
            case '-':
                System.out.println("El resultado es :" + (a - b));
                break;
            case '*':
                System.out.println("El resultado es :" + (a * b));
                break;
            case '/':
                System.out.println("El resultado es :" + (a / b));
                break;
            case '%':
                System.out.println("El resultado es :" + (a % b));
                break;
            case '^':
                System.out.println("El resultado es :" + Math.pow(a, b));
                break;
            default:
                System.out.println("Operacion invalida\n");
        }
        }
        finally
        {
            sc.close();
        }
    }
}
