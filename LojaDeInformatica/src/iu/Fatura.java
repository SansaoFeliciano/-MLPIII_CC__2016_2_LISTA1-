package iu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

import Produtos.Item;



public class Fatura {

	public static void main(String[] args) {
		
		ArrayList fatura = new ArrayList();
		String opcao = "-1";
	
		Scanner leitor = new Scanner(System.in);
		
		
			
		System.out.println("Cadastro de produtos");
		System.out.println("1. Incluir Item");
		System.out.println("2. Gerar Fatura");
		System.out.println("0. Sair");
		
		    
			System.out.printf("\nDigite a op��o desejada:\n");
			opcao= leitor.next();
			while (!(opcao.equalsIgnoreCase("0"))){
		switch (opcao){
		
		case "1":
			Item item = new Item();
			System.out.println("\nCodigo:");
			item.setNumero(leitor.next());
			System.out.println("Descri��o:");
			item.setDescricao(leitor.next());
			System.out.println("Quantidade:");
			try{
			item.setQuantidade(leitor.nextInt());}
			catch (InputMismatchException | NumberFormatException e){
				System.out.println("Quantidade inv�lido!");
		}
			System.out.println("Pre�o:");
			try{
			item.setPreco(leitor.nextDouble());}
			catch (InputMismatchException e){
			       System.out.println("Pre�o inv�lido!");}
			item.setValorProduto();
			fatura.add(item);
			
			System.out.printf("\n1- Incluir novo item");
			System.out.printf("\n2- Gerar Fatura");
			System.out.printf("\n0- Sair");
			opcao= leitor.next();
			break;
		
		case "2":
			System.out.println("                     Fatura");
			for (int i=0;i<fatura.size();i++){
			Item itemImp = (Item)fatura.get(i);
			System.out.printf("\nC�d.  " + itemImp.getNumero() + "   Item: " + itemImp.getDescricao() + 
					"    " + itemImp.getQuantidade() + " *  R$ " + (float) itemImp.getPreco() +  "  =  R$ " + (float) itemImp.getValor());
			}
			System.out.printf(" \n\n                                          Total: R$ "  + Item.getValorTotal());
			System.out.printf("\n\n1- Incluir novo item");
			System.out.printf("\n0- Sair");
			opcao= leitor.next();
			break;
			
		case "0":
			opcao = "0";
			break;
			
			default:
				
				System.out.println("Op��o inv�lida. Digite uma op��o v�lida:");
				opcao= leitor.next();
				break;
	}
	}
  }
	
   }



