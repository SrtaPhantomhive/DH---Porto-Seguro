package aula1dhporto;

import java.util.Scanner;

public class exercicioSwitchCase {

	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, media, somaMedia=0, mediaGeral;
		String nome;
		
		for(int x = 1; x<=5; x++) {
			System.out.println("Notas do aluno: "+(x+1));
			
			System.out.println("Entre com seu nome: ");
			nome = leia.nextLine();
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			while(n1<0 || n1>10) {
				System.out.println("\nVocê digitou um valor fora de 0 a 10. \nEntre com a primeira nota: ");
				n1 = leia.nextFloat();
			}
			
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			while(n1<0 || n1>10) {
				System.out.println("\nVocê digitou um valor fora de 0 a 10. \nEntre com a segunda nota: ");
				n2 = leia.nextFloat();
			}
			
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			while(n1<0 || n1>10) {
				System.out.println("\nVocê digitou um valor fora de 0 a 10. \nEntre com a terceira nota: ");
				n3 = leia.nextFloat();
			}
			
			media = (n1+n2+3) /3;
			
			somaMedia = somaMedia+media; // somaMedia += media, pode ser feito com qualquer operador.
		}
		
		mediaGeral = somaMedia /5;
		
		System.out.printf("\nA média geral é: %2.2f",mediaGeral);
		
	}
}