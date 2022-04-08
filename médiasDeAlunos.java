package aula1dhporto;

import java.util.Scanner;

public class médiasDeAlunos {
	
	public static void main (String[] args) {
	
		String nome;
		int idade;
		double altura, nota1, nota2, nota3, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota.");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota.");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota.");
		nota3 = leia.nextFloat();

		media = (nota1+nota2+nota3)/3;
		System.out.printf("\nA média aritmética é, %2.1f", media );
		
		if(media>= 7 && media<=10) {
			System.out.println("\nO aluno está aprovado!");} 
		else { 
			if(media>= 5 && media<7) {
			System.out.println("\nO aluno está de exame.");}
		 	else {
		 		if(media>0 && media<5) {
		 			System.out.println("\nO aluno está reprovado.");}
		 		else {
		 			System.out.println("\nMédia inválida.");}
		 		}
		}
		
		
	}
}
		