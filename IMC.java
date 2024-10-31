package Atividades;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Olá! Seja muito bem vindo(a) ao calculador de IMC. Para saber seu IMC, por favor, informe os dados solicitados abaixo.");
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.next();
		
		System.out.println("Digite seu peso em Kg: ");
		Float peso = entrada.nextFloat();
		
		System.out.println("Por fim, digite sua altura em metros: ");
		Float altura = entrada.nextFloat();
		
		Float resultado = peso / (altura * altura);
		
		if(resultado < 19) {
			System.out.println("Você está abaixo do peso, " +nome);
		}else if(19 <= resultado && resultado < 25) {
			System.out.println("Seu peso é normal, " +nome);
		}else if(25 <= resultado && resultado < 30) {
			System.out.println("Você está com sobrepeso, " +nome);
		}else if(30 <= resultado && resultado < 40){
			System.out.println("Você está obeso(a) nível 1, " +nome);
		}else {
			System.out.println("Você está com obesidade mórbida, " +nome);
		}	
	}
}