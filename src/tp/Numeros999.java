package tp;
import java.util.Scanner;

/*Se deber´a crear un programa que permita ingresar una determinada cantidad de n´umeros entre 0 y 9999 y calcule
el promedio, el m´aximo y el m´ınimo. En caso de que sean mayores a 9999 o menores que 0 se deber´a informar
al usuario que ingrese un n´umero v´alido y dicho ingreso NO ser´a tenido en cuenta para el promedio.*/

public class Numeros999 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int contador =0;
		int hasta =1;
		int numero =0;
		int total =0;
		System.out.println("¿cuantos numeros desea ingresar?");
		hasta  = sc.nextInt();
		while(contador < hasta) {
			
			System.out.println("ingrese un numero");
			numero =sc.nextInt();
			if(numero >0 && numero<999) {
				total= total + numero;
				contador++;
			}
			
		}
		
	sc.close();
	System.out.println("la suma de numeros editados es: "+total);
	}

}
