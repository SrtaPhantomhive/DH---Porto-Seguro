package aula1dhporto;

import java.util.Scanner;

public class verifica��oNum�rica {
	
	public static void main (String[] args) {
	
/* Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se esse n�mero
	� par ou �mpar e se � positivo ou negativo. */
		
		int numero;
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEntre com um n�mero inteiro: ");
		numero = leia.nextInt();
	
		if(numero % 2 == 0) {
			if(numero>0) {
			System.out.println("O n�mero � par e positivo.");}
			else {
				System.out.println("O n�mero � par e negativo.");}
			}
		
		else {
			if(numero<0) {
				System.out.println("O n�mero � �mpar e negativo");}
			else {
				System.out.println("O n�mero � �mpar e positivo.");
			}
		}
	}
}
