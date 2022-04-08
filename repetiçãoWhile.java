package aula1dhporto;

import java.util.Scanner;

public class repetiçãoWhile {
	public static void main (String[] args) {
		
		int tabuada, x=1, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com qual tabuada deseja montar: ");
		tabuada = leia.nextInt();
		
		do {
			resultado = x * tabuada;
			System.out.println("\n"+tabuada+" X "+x+" = "+resultado);
			x++;
		}
		while(x <= 10);
	}
}
