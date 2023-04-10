package tp;
import java.util.Scanner;
/* Argnetina, junto con otros pa´ıses de Am´erica Latina se encuentran frecuentemente ante fuertes procesos inflaconarios. Un grupo de comerciantes del barrio nos pide que le hagamos un programa que calcule el ´ındice de
inflaci´on teniendo en cuenta los siguientes datos: nombre del art´ıculo, precio anterior, precio actual. El programa deber´a mostrar el precio actual, el anterior y el porcentaje de inflaci´on. A fines pr´acticos, calcularemos
la inflaci´on como:
π =
P recio Aactual − P recio Anterior
P recio Anterior x 100 (2)
Una vez concluida la carga de los articulos, deber´a mostrar por pantalla: Promedio del procentaje de inlaci´on,
el nombre del art´ıculo con mayor inflaci´on junto con su porcentaje.-*/

public class Inflacion {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		int contador =0;
		int hasta =1;
		double precioActual= 0;
		double precioAnterior= 0;
		double porInflacion =0;
		double sumatoriaI=0;
		double promedioI =0;
		String mayorNombre="";
		double mayorInflacion=0;
		
		String producto = "" ;
		
		System.out.println("¿cuantos productos desea ingresar?");
		hasta  = sc.nextInt();
		
		while(contador < hasta) {
			contador++;
			
			System.out.println("ingrese el nombre del producto");
			producto =sc.next();
			
			System.out.println("ingrese el precio actual");
			precioActual =sc.nextInt();
			
			System.out.println("ingrese el precio anterior");
			precioAnterior =sc.nextInt();
			
			porInflacion=((precioActual-precioAnterior)/precioAnterior)*100;
			
			if(porInflacion>= mayorInflacion) {
				mayorNombre=producto;
				mayorInflacion = porInflacion;
			}
			sumatoriaI=sumatoriaI+porInflacion;
			promedioI=sumatoriaI/hasta;
			
			System.out.println("----------------------------------------------------------------------");
			System.out.println("");
			System.out.println("nombre del producto: "+producto);
			System.out.println("precio anterior: "+precioAnterior);
			System.out.println("precio anterior: "+precioActual);
			System.out.println("porcentaje de inflacion: "+porInflacion);
			
			System.out.println("----------------------------------------------------------------------");
	
			System.out.println("");
	}
		sc.close();
		System.out.println("");
		System.out.println("----------------------------------------------------------------------");
		
		System.out.println("promedio de inflacion: "+promedioI);
		System.out.println("nombre del producto con mayor inflacion: "+mayorNombre);
		System.out.println("porcentaje de producto con mayor inflacion: "+mayorInflacion);
		System.out.println("");
		System.out.println("----------------------------------------------------------------------");

}
		
	}

