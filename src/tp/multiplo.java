package tp;

import java.util.Scanner;
/* Realizar un algoritmo que solicite dos n´umeros y advierta si el primer n´umero es m´ultiplo del segundo. Indicar
al usuario que no son posibles los valores negativos o iguales a 0. Se deber´a mostrar un mensaje de error hasta
que ingrese un n`umero mayor que cero.*/


public class multiplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el numero 1:");
		int num1 = sc.nextInt();
		System.out.println("Ingrese el numero 2:");
		int num2= sc.nextInt();
		while(num1<=0 || num2<=0){
			
		
				System.out.println("los numeros ingresados deben ser mayores a 0:");
				System.out.println("Ingrese el numero 1:");
				num1 = sc.nextInt();
				System.out.println("Ingrese el numero 2:");
				num2= sc.nextInt();}
		
		if(num2 %num1 ==0) {
			System.out.println("es multiplo");
			
		}else {
			System.out.println("no es multiplo");
		}
		
		sc.close();
		}
	}
		
		
		


