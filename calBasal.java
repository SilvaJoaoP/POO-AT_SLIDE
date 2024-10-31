package Atividades;

import java.util.Scanner;

public class CalBasal {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Olá! Seja muito bem vindo(a) ao Calculador de Metabolismo Basal. Para saber seu TMB, por favor, informe os dados solicitados abaixo.");
		
		System.out.println("Digite seu gênero (homem/mulher): ");
		String genero = entrada.next();
		
		System.out.println("Digite sua idade em anos: ");
		int idade = entrada.nextInt();
		
		System.out.println("Digite seu peso em Kg: ");
		float quilos = entrada.nextFloat();
		
		System.out.println("Digite sua altura em centímetros: ");
		float altura = entrada.nextFloat();
		
		double calculo = 0;
		
		if(genero.equalsIgnoreCase("homem")) {
			 calculo = 66 + (18.3 * quilos) + (5 * altura) - (6.8 * idade);
		}else if(genero.equalsIgnoreCase("mulher")){
			 calculo = 655 + (9.6 * quilos) + (1.8 * altura) - (4.7 * idade);
		}else {
			System.out.println("Gênero inválido.");
		}
			
		System.out.println("Seu TBM é de " +calculo +" Kcal!");
		
	}
}