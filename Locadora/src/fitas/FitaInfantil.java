package fitas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FitaInfantil extends Fita{
	
	BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
	boolean ok = false;
	
	public boolean setPrecoLocacao(String precoLocacao) {
		Double precoLocacao1 = null;
		precoLocacao1 = precoLocacao1.parseDouble(precoLocacao);
		if(precoLocacao1 > 0){
		this.precoLocacao += (precoLocacao1 = precoLocacao1 * 0.20);
		return true;}
		else{
			System.out.println("Preço inválido. Digite um valor maior que 0.");
		return false;}
		}

	
	public Fita cadFitaInfantil(FitaInfantil fita) throws IOException{
		
		Fita fitaInfantil = fita;
		System.out.println("Digite o título do filme: ");
		fita.setTitulo(leitor.readLine());
		System.out.println("Digite a categoria do filme: ");
		fita.setCategoriaFilme(leitor.readLine());
		System.out.println("Digite o preço do Aluguel deste filme: ");
		fita.setPrecoLocacao(leitor.readLine());
		
		return fitaInfantil;
		
	}

}
