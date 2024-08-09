//@author: Josue chitay
//calcular litros a galones

//Libreria Scanner
import java.util.Scanner;

//Clase principal
public class Problema4{
	//Hoja de trabajo, metodo main
	public static void main(String[] arg){
		
		//Variable de la libreria Scanner
		Scanner scan = new Scanner(System.in);
		
		//Pedimos el ingreso de valor de litros
		System.out.println("Ingrese el valor de litros:");
		Double litros = scan.nextDouble();

		//Operamos
		Double galon = litros / 3.785;
		
		//Mostramos el resultado en galones
		System.out.println("El resultado es: " + galon + " galones.");

	}
}