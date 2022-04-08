package aula1dhporto;

import java.util.Scanner;

public class calculadora {

	public static void main (String[] args) {
		
		// Cáculadora
		
		float n1, n2, resultado=0;
		int operador;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		n1 = ler.nextFloat();
		System.out.println("\nEntre com o Segundo número: ");
		n2 = ler.nextFloat();
		
		System.out.println("\n\t\tCalculadora.");
		System.out.println("\n1 - Soma");
		System.out.println("\n2 - Diferença");
		System.out.println("\n3 - Multiplicação");
		System.out.println("\n4 - Divisão");
		System.out.println("\nEntre com sua opção.");
		operador = ler.nextInt();
		
		switch(operador)
		{	case 1:
				resultado = n1+n2;
				break;
			case 2: 
				resultado = n1-n2;
				break;
			case 3:
				resultado = n1*n2;
				break;
			case 4:
				if(n2==0) {
					System.out.println("Não é possível fazer divisões por zero.");
				}resultado = n1/n2;
				break;
			default:
				System.out.println("\nOpção Inválida.");
		}
		System.out.println("\nResultado: "+resultado);	
	}
}
