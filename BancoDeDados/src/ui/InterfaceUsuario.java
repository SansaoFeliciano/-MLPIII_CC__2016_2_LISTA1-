package ui;

import conexao.Conexao;
import java.util.Scanner;

public class InterfaceUsuario {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		String opcao="";
		
		while (!(opcao.equalsIgnoreCase("0"))){
		System.out.printf("\nBanco de Dados\n");
		System.out.println("1-Criar nova conex�o");
		System.out.println("0-Sair");
		
		System.out.printf("\nDigite sua op��o:");
		opcao = leitor.next();
		
		switch (opcao){
		
		case "1":
		//Criando a conex�o �nica
		Conexao novaConexao = Conexao.getInstance();
		break;
		
		case "0":
		break;
		
		default:
			System.out.println("Op��o Inv�lida!");
		}
	  }
	 }
	}
