package tp;
import java.util.Scanner;
/*. Elaborar un programa que calcule el sueldo de una determinada cantidad de empleados. El programa solicitar´a
el nombre del empelado, las horas trabajadas, el valor de la hora. Imprimir´a por pantalla el sueldo total. El
programa preguntar´a si desea ingresar un segundo empleado. Si es 1, continuar´a, en caso de que sea 0 saldr´a del
bucle*/

public class sueldo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int siNo  = 1;
		String nombre  ="";
		double horasT  = 0;
		double valorHoras  =0;
		double sueldo =0;
		while(siNo ==1) {
			System.out.println("ingrese el nombre del empleado: ");
			nombre  = sc.next();
			
			System.out.println("ingrese la cantidad de las horas trabajadas:");
			horasT  = sc.nextDouble();
			
			System.out.println("ingrese el valor de la hora");
			valorHoras  = sc.nextDouble();
		
			sueldo = horasT * valorHoras;
			System.out.println("el sueldo de "+nombre+" este mes fue de: "+sueldo);
			System.out.println("desea calcular el sueldo de un empleado? 1 para si 0 para no ");
			siNo  = sc.nextInt();
			
	}
		System.out.println("fin del programa");
		sc.close();}

}
