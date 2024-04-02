package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Açao realizada para ler o input do usuário
		Scanner teclado = new Scanner(System.in);
		
		//Variaveis a serem usadas durante o codigo
		int opcao;
		int tipoMoeda;
		double valor;
		Moeda moeda;
		
		Cofrinho cofrinho = new Cofrinho();
		
		//Menu para o usuario escolher a açao a ser realizada
		System.out.println("MEU COFRINHO:");
		System.out.println("1 - Adicionar Moeda");
		System.out.println("2 - Remover Moeda");
		System.out.println("3 - Listar Moedas");
		System.out.println("4 - Calcular Total em Reais");
		System.out.println("0 - Encerrar Programa");
		opcao=teclado.nextInt();
		
		//Criação de loop
		while (opcao !=0) {
			
			switch (opcao) {
			
			//Para o input 1, código de adicionar moedas no cofrinho
			case 1:
				tipoMoeda=0; 
				
				//Menu de escolha de tipo de moeda
				while(tipoMoeda>3 || tipoMoeda<=0) {
				System.out.println("Escolha o tipo de moeda:");
				System.out.println("1 - Real");
				System.out.println("2 - Dolar");
				System.out.println("3 - Euro");
				tipoMoeda= teclado.nextInt();
				}
				
				moeda = null;
				
				//Apos a escolha, digitar o valor a ser adicionado.
				if(tipoMoeda == 1) {
					System.out.println("Digite o valor:");
					valor = teclado.nextDouble();
					moeda = new Real(valor);
				}
				
				else if(tipoMoeda == 2) {
					System.out.println("Digite o valor:");
					valor = teclado.nextDouble();
					moeda = new Dolar(valor);
				}
				
				else {
					System.out.println("Digite o valor:");
					valor = teclado.nextDouble();
					moeda = new Euro(valor);
				}
				
				//Açao de adicionar moeda na listagem
				cofrinho.adicionar(moeda);
				System.out.println("Moeda adicionada com sucesso.");
				
					break;
			
			//Para o input 2, código para remover moedas do cofrinho
			case 2:
				tipoMoeda=0; 
				
				//Menu de escolha de tipo de moeda
				while(tipoMoeda>3 || tipoMoeda<=0) {
				System.out.println("Escolha o tipo de moeda:");
				System.out.println("1 - Real");
				System.out.println("2 - Dolar");
				System.out.println("3 - Euro");
				tipoMoeda= teclado.nextInt();
				}
				
				moeda = null;
				
				//Apos a escolha, digitar o valor a ser removido.
				if(tipoMoeda == 1) {
					System.out.println("Digite o valor:");
					valor = teclado.nextDouble();
					moeda = new Real(valor);
				}
				
				else if(tipoMoeda == 2) {
					System.out.println("Digite o valor:");
					valor = teclado.nextDouble();
					moeda = new Dolar(valor);
				}
				
				else {
					System.out.println("Digite o valor:");
					valor = teclado.nextDouble();
					moeda = new Euro(valor);
				}
				
				//Açao de remover moeda da listagem
				cofrinho.remover(moeda);
				System.out.println("Moeda removida com sucesso.");
				
					break;
			
			//Para o input 3, código de listar moedas no cofrinho
			case 3:
				cofrinho.listagemMoedas();
				
					break;
					
			//Para o input 4, código de converter e somar o total de moedas no cofrinho		
			case 4:
				double total = cofrinho.totalConvertido();
				System.out.println("Total em reais no cofrinho: R$" + total);
				
					break;
		}
		
			//Ao final das açoes a serem realizadas, o menu é repetido.
			System.out.println("MEU COFRINHO:");
			System.out.println("1 - Adicionar Moeda:");
			System.out.println("2 - Remover Moeda:");
			System.out.println("3 - Listar Moedas:");
			System.out.println("4 - Calcular Total em Reais");
			System.out.println("0 - Encerrar Programa:");
			opcao=teclado.nextInt();
		}

	}

}
