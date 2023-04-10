package tp;
/*. Una empresa de manufactura de muebles se tienen varios obreros y por cada uno los siguientes datos: Nombre
del operario. Luego, cada operario puede haber trabajado varios d´ıas; por cada d´ıa que trabaj´o se tiene el dato
de la cantidad de unidades producidad (cada cantidad de unidades fabricadas es por un d´ıa de trabajo).
Se debe desarrollar un programa que lea el nombre del obrero y la cantidad de unidades fabricadas por d´ıa. 

Luego,al finalizar el programa, se deber´a imprimir la cantidad de obreros que se cargaron, el nombre del operario m´as
productivo junto con la cantidad de unidades que fabric´o y finalmente el operario menos productivo con la
cantidad de unidades que logr´o fabricar.
Finalmente, se deber´a imprimir el promedio de unidades fabricadas por operario*/
import java.util.Scanner;
public class Operario {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		int contador =0;
		int empleados =1;
		System.out.println("¿cuantos empleados va a evaluar?");
		empleados  = sc.nextInt();
		
		int dias=1;
		int contador2=0;
		
		String nombre  ="";
		int sumatoriaUnidades=0;
		int unidades=0;
		int mayorUnidades=0;
		int menorUnidades=999999999;
		int sumatoria=0;
		double promedio =0;
		
		String menosP="";
		String masP="";
		
		while(contador < empleados) {
			contador++;
			
			System.out.println("¿cuantos dias trabajo?");
			dias  = sc.nextInt();
			System.out.println("¿cual es el nombre del empleado?");
			nombre=sc.next();
			while(contador2<dias) {
				contador2++;
				
				
				System.out.println("cuantas unidades produjo el dia: "+ contador2);
				unidades=sc.nextInt();
				
				sumatoriaUnidades=sumatoriaUnidades+unidades;
				
				if(sumatoriaUnidades>mayorUnidades) {
					mayorUnidades=sumatoriaUnidades;
					masP=nombre;
				}
				
				
				sumatoria=sumatoria+unidades;
				if (contador2==dias) {
					if(sumatoriaUnidades<menorUnidades) {
						
						menorUnidades=sumatoriaUnidades;
						
						menosP=nombre;
					}
					contador2=0;
					sumatoriaUnidades=0;
					break;
				}
				
				
				
			}
			
			
		}
		sc.close();
		promedio=sumatoria/empleados;
		System.out.println("----------------------------------------------------------------------");
		System.out.println("");
		System.out.println("el empleado que mas produjo fue: "+masP);
		System.out.println("produjo un total de:"+mayorUnidades);
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("");
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("");
		System.out.println("el empleado que menos produjo fue: "+menosP);
		System.out.println("produjo un total de:"+menorUnidades);
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("");
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("");
		System.out.println("el promedio de unidades fabricadas por operario: "+promedio);
		
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("");
	}
	

}
