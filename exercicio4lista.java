package aula1dhporto;

import java.util.Scanner;

public class exercicio4lista {

	public static void main (String[] args) {
	
	/*Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se este n�mero �
	par ou �mpar, e se � positivo ou negativo. */
		
		Scanner leia = new Scanner(System.in);
		
		int n;
		
		System.out.println("Entre com um n�mero inteiro!");
		n = leia.nextInt();
		
		if(n % 2 == 0) {
			if(n > 0) {
				System.out.println("O n�mero � par e positivo.");
			} else {
				System.out.println("O n�mero � par e negativo.");
			}
		} else if(n > 0) {
				System.out.println("O n�mero � �mpar e positivo.");
				} else {
					System.out.println("O n�mero � �mpar e negativo.");
				}
	}
}
