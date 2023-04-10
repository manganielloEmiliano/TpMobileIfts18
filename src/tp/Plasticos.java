package tp;
import java.util.Scanner;
/*Una empresa que comercializa pl´asticos a escala industrial posee la siguientes descuentos: Si es cliente tipo 1, se
descuenta el 5%; si es cliente tipo 2 se descuenta el 8%; si es cliente tipo 3 el 12% mientras que si es del tipo 4
el descuento ser´a del 15%. Cuando un cliente realiza una compra, se generan los siguientes datos: Nombre del
cliente, tipo de cliente(1,2,3,4), cantidad de toneladas de pl´astico, precio por tonelada.
Elaborar un programa que permita procesas una cantidad determinada de clientes e imprimr un reporte que
indique el subtotal, el decuento, y el total a pagar.
Para los c´alculos tener en cuenta que el subtotal son las toneladas multiplicadas por el precio, mientras que
el decuento es el porcentaje seg´un el tipo de cliente del subtotal a pagar. Por ´ultimo, el total a pagar esta
conformado por el subtotal menos el descuento*/

public class Plasticos {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String nombre="";
		double cantidadPlastico =0;
		double precioTonelada = 0 ;
		double subtotal = 0 ;
		double total=0;
		double descuento=0;
		int hasta =1;
		System.out.println("cuantos informes desea generar?");
		hasta=sc.nextInt();
		int contador=0;
		
		while(contador < hasta){
			

		System.out.println("ingrese el nombre del cliente");
		nombre=sc.next();
		
		System.out.println("ingrese la cantidad de toneladas de plastico");
		cantidadPlastico =sc.nextDouble();
		
		System.out.println("ingrese el precio de la tonelada");
		precioTonelada =sc.nextDouble();
		subtotal = cantidadPlastico * precioTonelada;
		
		
		
		
		System.out.println("seleccione el tipo de cliente:1 ,2 ,3 o 4");
		int i =sc.nextInt();
		switch(i) {
		case 1:
			descuento=(subtotal*0.05);
			
			 
		case 2:
			descuento=(subtotal*0.08);
			
		case 3:
			descuento=(subtotal*0.12);
			
		case 4:
			descuento=(subtotal*0.15);
		
		}
		total=subtotal-descuento;
		contador=contador+1;
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("nombre del cliente: "+nombre);
		System.out.println("tipo de cliente: "+i);
		System.out.println("cantidad de toneladas de plastico "+cantidadPlastico);
		System.out.println("precio por tonelada: "+precioTonelada);
		System.out.println("el subtotal es de : "+subtotal);
		System.out.println("el descuento por tipo de cliente es de: "+descuento);
		System.out.println("el total a pagar es de: "+total);
	
		
		System.out.println("----------------------------------------------------------------------");
		
	}
		System.out.println("fin del programa");
		sc.close();
	}
}