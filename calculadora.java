package aula1dhporto;

import java.util.Scanner;

public class calculadora {

	public static void main (String[] args) {
		
		// C�culadora
		
		float n1, n2, resultado=0;
		int operador;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero: ");
		n1 = ler.nextFloat();
		System.out.println("\nEntre com o Segundo n�mero: ");
		n2 = ler.nextFloat();
		
		System.out.println("\n\t\tCalculadora.");
		System.out.println("\n1 - Soma");
		System.out.println("\n2 - Diferen�a");
		System.out.println("\n3 - Multiplica��o");
		System.out.println("\n4 - Divis�o");
		System.out.println("\nEntre com sua op��o.");
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
					System.out.println("N�o � poss�vel fazer divis�es por zero.");
				}resultado = n1/n2;
				break;
			default:
				System.out.println("\nOp��o Inv�lida.");
		}
		System.out.println("\nResultado: "+resultado);	
	}
}
