package tp;
import java.util.Scanner;
/* Un comercio posee varios clientes. Por cada cliente se tiene el nombre, los art´ıculos que compr´o, el precio unitario
y la cantidad. Se deber´a desarrollar un programa que lea el nombre del cliente, y luego por cada cliente los
art´ıculos que llev´o junto con el total de la compra. El total por cada art´ıculo se calcula multiplicando la cantidad
de art´ıculos por el precio unitario.Luego, el total por cliente es la suma de los totales por art´ıculo. Finalmente,
se deber´a imprimir un total general con la sumatoria de todos los totales por cliente*/

public class Tienda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int hasta=0;
        int contador=0;
        double sumatoria=0;
        String nombre ="";
        String articulo="";
        double valor =0;
        int cantidad=0;
        double totalXarticulo=0;
        double totalCompra=0;
          System.out.println("cuantos clientes desea ingresar?");
    	  hasta=sc.nextInt();
    	  while(contador<hasta) {
    		  int contador2=0;
    		  int hasta2=0;
    		  System.out.println("ingrese el nombre del cliente: ");
			  nombre=sc.next();
    		  System.out.println("cuantos articulos compro el cliente?");
    		  
    		  hasta2=sc.nextInt();
    		  while(contador2<hasta2) {
    		
    			  System.out.println("ingrese el nombre del articulo: ");
    			  articulo=sc.next();
    			  System.out.println("ingrese el valor del articulo: ");
    			  valor=sc.nextDouble();
    			  System.out.println("la cantidad de este articulo: ");
    			  cantidad=sc.nextInt();
    			  totalXarticulo=cantidad*valor;
    			  totalCompra=totalCompra +totalXarticulo;
    			  
    			  contador2++;
    		  }
    		  sumatoria=sumatoria+totalCompra;
    		  contador++;
    		  

    		  
    	  }
		  System.out.println("----------------------------------------------------------------------");
			System.out.println("");
			System.out.println("el valor total de las ventas fue de "+sumatoria);
			
			
			System.out.println("----------------------------------------------------------------------");
			System.out.println("");

		
		

	

	}}
