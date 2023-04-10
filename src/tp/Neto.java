package tp;
import java.util.Scanner;
/*Se desea desarrollar un programa que imprima un reporte con el nombre, sueldo bruto, y sueldo neto de una
n´omina de empleados. Recursos Humanos posee los siguientes datos: Nombre y sueldo neto mensual. El sueldo
bruto se calucla:
Sueldo Bruto = Sueldo Neto x 1, 195 (1)
Se deber´an imprimir por pantalla el nombe de los empleados, el sueldo bruto y neto. Al finalizar la carga, se
deber´a calcular el total de sueldos NETOS a pagar para realizar el desp´osito en el Banco junto con al cantidad
de empelados que se ingresaron*/

public class Neto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int siNo  = 1;
		String nombre ="";
	double	sueldoNeto =0 ;
	double sueldoBruto=0 ;
	int contador = 0 ;
	double sueldosTotalN= 0;
	
	
		while(siNo ==1) {
			contador = contador +1;
			System.out.println("ingrese el nombre del empleado: ");
			nombre  = sc.next();
			
			System.out.println("ingrese el sueldo neto:");
			sueldoNeto  = sc.nextDouble();
			
			sueldoBruto = sueldoNeto*1.195;
			sueldosTotalN=sueldosTotalN+sueldoNeto;
			System.out.println("el sueldo bruto de "+nombre+"fue de :"+sueldoBruto+" y el sueldo neto fue de :"+sueldoNeto );
			System.out.println("desea calcular el sueldo de un empleado? 1 para si 0 para no ");
			siNo  = sc.nextInt();
			
	}
		System.out.println("el numero de empleados ingresados fue de:"+contador);
		System.out.println("el total de sueldos netos a depositar al banco es de : "+ sueldosTotalN);
		
		
		System.out.println("fin del programa");
		sc.close();
		}


}		

	


