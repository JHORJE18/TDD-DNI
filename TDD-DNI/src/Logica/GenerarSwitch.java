package Logica;
import java.util.ArrayList;
import java.util.Scanner;

public class GenerarSwitch {
	
	static ArrayList <String> letras = new ArrayList <String>();

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		for (int i=0; i<=22; i++){
			System.out.println("Introduce el caracter del digito Nº "+ i);
			String escrito = entrada.nextLine();
			letras.add(escrito);
		}
		System.out.println("--------------");
		//Imprimir
		for (int i=0; i<=22;i++){
			System.out.println("case "+i);
			System.out.println("\tletra = '" + letras.get(i) +"';");
			System.out.println("\tbreak;");
		}
	}
}
