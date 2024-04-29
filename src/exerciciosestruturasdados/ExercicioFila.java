package exerciciosestruturasdados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
		

		Queue<String> clientes = new LinkedList<String>();
		Queue<String> clientesPrioritarios = new LinkedList<String>();

		Scanner leia = new Scanner(System.in);
		int opcao;

		do {
			System.out.println();
			System.out.println("*********************************************");
			System.out.println("      1 - Adcionar Clientes na Fila          ");
			System.out.println("      2 - Listar todos os Clientes           ");
			System.out.println("      3 - Retirar Cliente da Fila            ");
			System.out.println("      0 - Sair                               ");
			System.out.println("*********************************************");
			System.out.print("Entre com a opção desejada: ");
			
			opcao = leia.nextInt();
			System.out.println();
			
			switch (opcao) {
			case 0:
				System.out.println("Programa finalizado!");
				break;
			case 1:
				System.out.print("Digite o Nome: ");
				leia.nextLine();
				String nome = leia.nextLine();
				System.out.print("Digite a idade: ");
				int idade = leia.nextInt();
				System.out.println();
				if(idade >= 60) {
					clientesPrioritarios.add(nome);
				}else {
					clientes.add(nome);
				}
				if(clientes.isEmpty() == true) {
					System.out.println("Fila:");
					System.out.println("Fila vazia!");
				}else {
					System.out.println("Fila: ");
					System.out.println(clientes);
				}
				if(clientesPrioritarios.isEmpty() == true) {
					System.out.println("Fila Preferencial:");
					System.out.println("Vazia:");
				}else {
					System.out.println("Fila Preferencial:");
					System.out.println(clientesPrioritarios);
				}
				
				System.out.println("Cliente Adicionado!");
				break;
			case 2:
				System.out.println("Lista de Clientes da Fila:");
				System.out.println(clientes);
				System.out.println("Lista de Clientes da Fila Preferencial:");
				System.out.println(clientesPrioritarios);
				break;
			case 3:
				System.out.println("Fila:");
				if (clientes.isEmpty() == true && clientesPrioritarios.isEmpty() == true) {
					System.out.println("As Filas estão vazias!");
				} else if(clientesPrioritarios.size() > clientes.size()) {
					clientesPrioritarios.poll();
					System.out.println(clientes);
					System.out.println("Fila Preferencial:");
					System.out.println(clientesPrioritarios);
					System.out.println("O Cliente foi Chamado!");
				}else if(clientesPrioritarios.size() <= clientes.size()) {
					clientesPrioritarios.poll();
					clientes.poll();
					System.out.println("Os Clientes foram Chamados!");
					
				}
				break;
            default:
            	System.out.println("Entre com uma opção válida!");
            	break;
			}
		}while (opcao != 0);
		
		leia.close();
	}

}
