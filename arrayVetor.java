package aula1dhporto;

import java.util.Scanner;

public class arrayVetor {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		/* O vetor sempre tem uma dimensão
		 * A matriz é multidimensional.
		 */
		
		float[] media = new float[5];
		//String[] nome = new String[5];
		float n1, n2, n3, somaMedia=0, mediaGeral;
		int x, aprov=0;
		
		for(x = 0; x<5; x++) {
			System.out.println("\n Notas do aluno: "+(x+1));
			
			System.out.println("\n Entre com a primeira nota: ");
			n1 = leia.nextFloat();
			while(n1<0 || n1>10) {
				System.out.println("\n Intervalo de notas inválido. Entre com sua nota: ");
				n1 = leia.nextFloat();
			}
			
			System.out.println("\n Entre com a segunda nota: ");
			n2 = leia.nextFloat();
			while(n2<0 || n2>10) {
				System.out.println("\n Intervalo de notas inválido. Entre com sua nota: ");
				n2 = leia.nextFloat();
			}
			
			System.out.println("\n Entre com a terceira nota: ");
			n3 = leia.nextFloat();
			while(n3<0 || n3>10) {
				System.out.println("\n Intervalo de notas inválido. Entre com sua nota: ");
				n3 = leia.nextFloat();
			}
			
			media[x] = (n1+n2+n3)/3;
			System.out.println("\n Media: "+media[x]);
			
			somaMedia += media[x]; // +=: somaMedia = somaMedia + media[x];
			
			if(media[x]>7 && media[x]<=10) {
				System.out.println("\n Aluno aprovado!");
				aprov += 1;
			}else if(media[x]>=5 && media[x]<7){
				System.out.println("\n Aluno de recuperação.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			
		}
		
		mediaGeral = somaMedia / x;
		
		System.out.println("\n A Média Geral é: "+mediaGeral);
		System.out.println("\n O número de alunos aprovados é: "+aprov);
		System.out.println(media[2]);
	}
}