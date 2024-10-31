package Atividades;

import java.util.Scanner;

public class Integração {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        String escolha = "Menu"; 
        
        do {
        	System.out.println("|-----------------------------|");
            System.out.println("|\t     Menu \t      |");
            System.out.println("|\t\t\t      |");
            System.out.println("|[1] - Imc\t \t      |");
            System.out.println("|\t\t\t      |");
            System.out.println("|[2] - Metabolismo Basal      |");
            System.out.println("|\t\t\t      |");
            System.out.println("|[0] - Sair\t\t      |");
            System.out.println("|\t\t\t      |");
            System.out.println("|-----------------------------|");
            System.out.print("       Digite sua escolha:");
            
            
            escolha = entrada.next();

            switch (escolha) {
                case "1":
                	Imc(entrada);
                    break;
                case "2":
                    TMB(entrada);
                    break;
                case "0":
                	System.out.println("\n");
                	System.out.println("000000000000000000000000000000000000000000000000000000000000000000000");
                    System.out.println("0\t                      Saindo... \t                    0");
                    System.out.println("000000000000000000000000000000000000000000000000000000000000000000000");
                    System.out.println("\n");
                    break;
                default:
                	System.out.println("\n");
                	System.out.println("000000000000000000000000000000000000000000000000000000000000000000000");
                    System.out.println("0\t                   Opção inválida\t                    0");
                    System.out.println("000000000000000000000000000000000000000000000000000000000000000000000");
                    System.out.println("\n");
            }
            
        } while (!escolha.equals("0"));

    }

		 public static void Imc (Scanner entrada) {   
			 
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

		public static void TMB(Scanner entrada) {
			
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
				
			System.out.println("Seu TBM é de " +calculo +" Kcal!");
		}
	}