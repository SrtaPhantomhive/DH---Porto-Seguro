package aula1dhporto;

import java.util.Scanner;

public class exercicio2lista {
	
	public static void main (String[] args) {
		
		/* Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de horas
		trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora. 
		Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento armazenando-o na vari�vel E, 
		caso contr�rio zerar tal vari�vel. A hora excedente de trabalho vale R$ 20,00. No final do 
		processamento imprimir o sal�rio total e o sal�rio excedente. */
		
		Scanner leia = new Scanner(System.in);
		
		/* h = n�mero de horas trabalhadas;
		 * c = c�digo;
		 * sal = sal�rio total;
		 * e = horas excedidas;
		 * hE = excesso por horas trabalhadas;
		*/
		int c, h;
		float sal = 0, e=0, hE=0;
		
		System.out.println("\n Ol�! Por favor, entre com seu c�digo: ");
		c = leia.nextInt();
		System.out.println("\n Agora entre com o seu n�mero de horas trabalhadas: ");
		h = leia.nextInt();
		
		if(h<=50) {
			sal = h*10;
		} else if (h>50){
			sal = h*10;
			e = h - 50;
			hE = e*20;
			sal = sal + hE;
		}
		
		System.out.printf("\n Seu sal�rio total � de: R$ %3.2f",sal);
		System.out.println("\n Seu suas horas extras resultaram em: R$ "+e+" H.");
		System.out.printf("\n Logo, seu sal�rio excedente foi: R$ %3.2f", e*20);
	}

}