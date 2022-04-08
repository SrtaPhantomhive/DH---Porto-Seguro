package aula1dhporto;

import java.util.Scanner;

public class exercicio3lista {

	public static void main (String[] args) {
		/*Desenvolva um sistema em que:
		- Leia 4 (quatro) números;
		- Calcule o quadrado de cada um;
		- Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		- Caso contrário, imprima os valores lidos e seus respectivos quadrados. */

		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3, n4;
		double r1, r2, r3, r4;
		
		System.out.println("\nEntre com o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("\nEntre com o segundo número: ");
		n2 = leia.nextInt();
		System.out.println("\nEntre com o terceiro número: ");
		n3 = leia.nextInt();
		System.out.println("\nEntre com o quarto número: ");
		n4 = leia.nextInt();
		
		r1 = Math.pow(n1, 2);
		r2 = Math.pow(n2, 2);
		r3 = Math.pow(n3, 2);
		r4 = Math.pow(n4, 2);
		
		if(r3>=1000) {
			System.out.println("a potência do terceiro número resulta em:"+r3);
		} else {
			System.out.println("\nO primeiro número é: "+n1+" e sua potência resulta em: "+r1);
			System.out.println("\nO segundo número é: "+n2+" e sua potência resulta em: "+r2);
			System.out.println("\nO terceiro número é: "+n3+" e sua potência resulta em: "+r3);
			System.out.println("\nO quarto número é: "+n4+" e sua potência resulta em: "+r4);
		}
		
	}
}