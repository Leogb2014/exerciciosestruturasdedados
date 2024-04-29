package exerciciosestruturasdados;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		
		Stack<String> livros = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		do{
			System.out.println();
			System.out.println("*********************************************");
			System.out.println("      1 - Adcionar Livros na Pilha          ");
			System.out.println("      2 - Listar todos os Livros          ");
			System.out.println("      3 - Retirar Livro da Pilha           ");
			System.out.println("*********************************************");
			System.out.print("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			System.out.println();
			switch(opcao) {
			case 0:
				System.out.println("Programa Finalizado!");
				break;
			case 1:
				leia.nextLine();
				System.out.print("Digite o Nome: ");
				String nome = leia.nextLine();
				livros.push(nome);
				System.out.println("Pilha:");
				System.out.println(livros);
				System.out.println("Livro Adicionado!");
				break;
			case 2:
				System.out.println("Lista de Livros da Pilha:");
				System.out.println(livros);
				break;
			case 3:
				if(livros.empty() == true) {
					System.out.println("A Pilha está vazia!");
				}else {
					livros.pop();
					System.out.println("Pilha:");
					System.out.println(livros);
					System.out.println("Um Livo foi Retirado da Pilha!");
				}
				break;
			default:
				System.out.println("Entre com uma opção válida!");
				break;
				}
		}while(opcao !=0);
		
		leia.close();

	}

}
