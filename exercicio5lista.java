package aula1dhporto;

import java.util.Scanner;

public class exercicio5lista {
	
	public static void main (String[] args) {
		/*A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de ind�strias que s�o 
		altamente poluentes do meio ambiente. O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. Se o �ndice 
		sobe para 0,3 as ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades, se o �ndice crescer 
		para 0,4 as industrias do 1� e 2� grupo s�o intimadas a suspenderem suas atividades, se o �ndice atingir 0,5 
		todos os grupos devem ser notificados a paralisarem suas atividades. Fa�a um sistema que leia o �ndice de 
		polui��o medido e emita a notifica��o adequada aos diferentes grupos de empresas.*/

		Scanner leia = new Scanner(System.in);
		
		float indice;
		
		System.out.println("Entre com o �ndice de polu���o: ");
		indice = leia.nextFloat();
		
		if(indice < 0.05 || indice >= 0.05 && indice <= 0.25) {
			System.out.println("O �ndice de polui��o � aceit�vel!");
		} else if(indice == 0.3) {
			System.out.println("As empresas do Grupo 1 devem suspender suas atividades.");	
		} else if(indice == 0.4) {
			System.out.println("As empresas dos Grupos 1 e 2 devem suspender suas atividades.");
		} else if(indice >= 0.5) {
			System.out.println("As empresas de TODOS os grupos devem suspender suas atividades.");	
		}
	}


}