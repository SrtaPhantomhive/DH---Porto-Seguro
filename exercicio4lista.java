package aula1dhporto;

import java.util.Scanner;

public class exercicio4lista {

	public static void main (String[] args) {
	
	/*Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é
	par ou ímpar, e se é positivo ou negativo. */
		
		Scanner leia = new Scanner(System.in);
		
		int n;
		
		System.out.println("Entre com um número inteiro!");
		n = leia.nextInt();
		
		if(n % 2 == 0) {
			if(n > 0) {
				System.out.println("O número é par e positivo.");
			} else {
				System.out.println("O número é par e negativo.");
			}
		} else if(n > 0) {
				System.out.println("O número é ímpar e positivo.");
				} else {
					System.out.println("O número é ímpar e negativo.");
				}
	}
}
