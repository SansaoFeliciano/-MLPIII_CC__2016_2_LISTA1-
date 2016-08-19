package dirigir;

import veiculo.Carro;
import java.util.Scanner;

public class DirigiVeiculo {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro();
		String opcao="";
		
		Scanner leitor = new Scanner(System.in);
		
		while (!(opcao.equalsIgnoreCase("3"))){
		System.out.printf("\n\nPainel da Ferrari\n");
		System.out.println("1-Ligar");
		System.out.println("2-Acelerar");
		System.out.println("3-Desligar");
		
		System.out.println("Digite sua opção:");
		opcao = leitor.next();
		
		switch (opcao){
		
		case "1":
			ferrari.ligar();
			break;
		case "2":
			ferrari.acelerar();
			break;
			
		case "3":
			break;
		}
	}
  }

}
