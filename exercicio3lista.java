package aula1dhporto;

import java.util.Scanner;

public class exercicio3lista {

	public static void main (String[] args) {
		/*Desenvolva um sistema em que:
		- Leia 4 (quatro) n�meros;
		- Calcule o quadrado de cada um;
		- Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		- Caso contr�rio, imprima os valores lidos e seus respectivos quadrados. */

		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3, n4;
		double r1, r2, r3, r4;
		
		System.out.println("\nEntre com o primeiro n�mero: ");
		n1 = leia.nextInt();
		System.out.println("\nEntre com o segundo n�mero: ");
		n2 = leia.nextInt();
		System.out.println("\nEntre com o terceiro n�mero: ");
		n3 = leia.nextInt();
		System.out.println("\nEntre com o quarto n�mero: ");
		n4 = leia.nextInt();
		
		r1 = Math.pow(n1, 2);
		r2 = Math.pow(n2, 2);
		r3 = Math.pow(n3, 2);
		r4 = Math.pow(n4, 2);
		
		if(r3>=1000) {
			System.out.println("a pot�ncia do terceiro n�mero resulta em:"+r3);
		} else {
			System.out.println("\nO primeiro n�mero �: "+n1+" e sua pot�ncia resulta em: "+r1);
			System.out.println("\nO segundo n�mero �: "+n2+" e sua pot�ncia resulta em: "+r2);
			System.out.println("\nO terceiro n�mero �: "+n3+" e sua pot�ncia resulta em: "+r3);
			System.out.println("\nO quarto n�mero �: "+n4+" e sua pot�ncia resulta em: "+r4);
		}
		
	}
}