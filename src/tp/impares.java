package tp;
import java.util.Scanner;
/*. Crear un algoritmo que permita ingresar una determinada cantidad de n´umeros y por cada uno, determinar si
es par o impar y mostrarlo por pantalla. Indicar que con 0 se sale del programa*/
public class impares {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese numero:");
		int num = sc.nextInt();
	
		
		while(num !=0) {
			
			if(num % 2 == 0) {
			System.out.println("es par");
			}
			else {
				System.out.println("es impar");
			}
			System.out.println("Ingrese numero");
			num = sc.nextInt();
					
		}
		sc.close();
		System.out.println("fin del programa");
		}
	}