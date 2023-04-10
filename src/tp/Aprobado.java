package tp;
import java.util.Scanner;
/* Elbaorar un programa que indique el nombre, las 3 calificaciones de un alumno, el promedio de las 3 notas y la
condici´on final: APROBADO o DESAPROBADO. Se desconoce la cantidad de alumnos. Al finalizar la carga
de alumnos se deber´a imprimir el total de alumnos APROBADOS y el total de DESAPROBADOS. La nota de
aprobaci´on es de 4 puntos o m´as. El programa deber´a preguntar por cada alumno si de desea continuar con la
carga*/
public class Aprobado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre ="";
		int siNo  = 1;
	double	nota1 =0 ;
	double	nota2 =0 ;
	double	nota3 =0 ;
	int aprobados = 0 ;
	int desaprobados = 0 ;
	double promedio= 0;
	
	
		while(siNo ==1) {
	
			
			System.out.println("ingrese el nombre del alumno: ");
			nombre  = sc.next();
			
			System.out.println("ingrese la primer nota:");
			nota1  = sc.nextDouble();
			
			System.out.println("ingrese la segunda nota:");
			nota2  = sc.nextDouble();
			
			System.out.println("ingrese la tercera nota:");
			nota3  = sc.nextDouble();
			
			promedio= (nota1+nota2+nota3)/3;
			if(promedio>=4) {
				aprobados=aprobados+1;
				System.out.println(nombre+" aprobo con :" +promedio);
			}
			else {
				desaprobados=desaprobados+1;
				System.out.println(nombre+" desaprobado con: "+promedio);
			}
			
		
			System.out.println("desea calcular otro promedio? ");
			siNo  = sc.nextInt();
			
	}
		System.out.println("desea el numero total de aprobados es de : "+ aprobados);
		System.out.println("desea el numero total de desaprobados es de : "+ desaprobados);
		
		
		System.out.println("fin del programa");
		sc.close();
		}


		
		

	}


