package aula1dhporto;

import java.util.Scanner;

public class matriz {
	/* Um algoritmo que recebe alguns n�meros e cria uma matriz 2x3 para armazena-los.
	 * Ap�s isso, � indicado a quantidade de n�meros pares e a somat�ria dos n�meros �mpares.
	 */
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[][] numeros = new int[2][3];
		int linha, coluna, quantPar=0, somaImpar=0;
		
		for(linha=0; linha<2; linha++) {
			for(coluna=0; coluna<3; coluna++) {
				System.out.println("\n Entre com um n�mero.");
				numeros[linha][coluna] = leia.nextInt();
				
				if(numeros[linha][coluna] % 2 == 0) {
					quantPar++;
				} else {
					somaImpar += numeros[linha][coluna];
				}
			}
		}
		System.out.println("Quantidade de n�meros pares: "+quantPar);
		System.out.println("Somat�ria dos n�meros �mpares: "+somaImpar);
	}
}