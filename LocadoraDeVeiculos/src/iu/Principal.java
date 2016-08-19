package iu;

import java.io.IOException;
import java.util.Scanner;

import bancoDeDados.BancoDeDados;
import veiculos.Veiculo;
import veiculos.VeiculoDeCarga;
import veiculos.VeiculoDePasseio;

public class Principal {
	
	public static void main(String[] args) throws IOException {
		
		String opcao = "";
		Scanner leitor = new Scanner(System.in);
		BancoDeDados dataBase = new BancoDeDados();
		
		while (!(opcao.equalsIgnoreCase("0"))){
		System.out.println("LOCADORA DE VEICULOS");
		
		System.out.println("1- Alugar Ve�culo");
		System.out.println("2- Sair");
		
		System.out.println("Digite sua op��o:");
	     opcao = leitor.next();
		
		switch (opcao){
		
		case "1":
			while (!(opcao.equalsIgnoreCase("0"))){
			System.out.println("1- Ve�culo de Passeio");
			System.out.println("2- Ve�culo de Carga");
			System.out.println("0-Sair");
			
			opcao = leitor.next();
			
			if (opcao.equals("1")){
				VeiculoDePasseio novoVeiculo = new VeiculoDePasseio();
				dataBase.salvaCadVeiculo (novoVeiculo.CadVeiculo(novoVeiculo));
				break;
			}
			else if (opcao.equals("2")){
				VeiculoDeCarga novoVeiculo = new VeiculoDeCarga();
				dataBase.salvaCadVeiculo (novoVeiculo.CadVeiculo(novoVeiculo));
				break;
			}	
			else if (opcao.equals("0"))
			break;
			else
				System.out.printf("\nOpc�o inv�lida!\n\n");
			}
		
		case "2":
			break;
			
		default:
			System.out.println("Opc�o inv�lida!");
		}
	}
  }
}


