package aula1dhporto;

import java.util.Scanner;

public class exercicio1lista {
	
	public static void main (String[] args) {
		
		/* Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de 
		seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do 
		estado de S�o Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. Jo�o precisa que 
		voc� fa�a um sistema que leia a vari�vel P (peso de tomates) e verifique se h� excesso. Se houver, 
		gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa que Jo�o dever� pagar. 
		Caso contr�rio mostrar tais vari�veis com o conte�do ZERO. */

		
		float peso, excesso = 0, multa = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Ol�! Entre com o seu rendimento di�rio!");
		peso = leia.nextFloat();
		
		if(peso>50) {
			excesso = peso - 50;
			multa = excesso * 4;
		}
		
		System.out.println("Seu rendimento di�rio foi de: "+peso+"KG.");
		System.out.println("\n Houve um excesso total de "+excesso+"KG.");
		System.out.printf("\n O valor total da multa � de: R$ %3.2f", multa);
	}
}
