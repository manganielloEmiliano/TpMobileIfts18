package tp;
import java.util.Scanner;
/*. Crear un algoritmo que permita ingresar una determinada cantidad de n´umeros y por cada uno, determinar si
es par o impar y mostrarlo por pantalla. Indicar que con 0 se sale del programa*/
public class impares {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int contador=0;
		int hasta =1;
		
		System.out.println("Ingrese cuantos numeros quiere ingresar: ");
		hasta = sc.nextInt();
		
		int num = 1;
		
		
		
	
		while(contador<hasta) {
			
			System.out.println("Ingrese numero:");
			num = sc.nextInt();
			if(num==0) {
				break;
			}
			
			if(num % 2 == 0) {
			System.out.println("es par");
			}
			else {
				System.out.println("es impar");
			}
			
			contador++;
					
		}
		sc.close();
		System.out.println("fin del programa");
		}
	}