package aula1dhporto;

import java.util.Scanner;

public class exercicio2lista {
	
	public static void main (String[] args) {
		
		/* Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas
		trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
		Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, 
		caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final do 
		processamento imprimir o salário total e o salário excedente. */
		
		Scanner leia = new Scanner(System.in);
		
		/* h = número de horas trabalhadas;
		 * c = código;
		 * sal = salário total;
		 * e = horas excedidas;
		 * hE = excesso por horas trabalhadas;
		*/
		int c, h;
		float sal = 0, e=0, hE=0;
		
		System.out.println("\n Olá! Por favor, entre com seu código: ");
		c = leia.nextInt();
		System.out.println("\n Agora entre com o seu número de horas trabalhadas: ");
		h = leia.nextInt();
		
		if(h<=50) {
			sal = h*10;
		} else if (h>50){
			sal = h*10;
			e = h - 50;
			hE = e*20;
			sal = sal + hE;
		}
		
		System.out.printf("\n Seu salário total é de: R$ %3.2f",sal);
		System.out.println("\n Seu suas horas extras resultaram em: R$ "+e+" H.");
		System.out.printf("\n Logo, seu salário excedente foi: R$ %3.2f", e*20);
	}

}