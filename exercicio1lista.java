package aula1dhporto;

import java.util.Scanner;

public class exercicio1lista {
	
	public static void main (String[] args) {
		
		/* João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de 
		seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do 
		estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que 
		você faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso. Se houver, 
		gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. 
		Caso contrário mostrar tais variáveis com o conteúdo ZERO. */

		
		float peso, excesso = 0, multa = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Olá! Entre com o seu rendimento diário!");
		peso = leia.nextFloat();
		
		if(peso>50) {
			excesso = peso - 50;
			multa = excesso * 4;
		}
		
		System.out.println("Seu rendimento diário foi de: "+peso+"KG.");
		System.out.println("\n Houve um excesso total de "+excesso+"KG.");
		System.out.printf("\n O valor total da multa é de: R$ %3.2f", multa);
	}
}
