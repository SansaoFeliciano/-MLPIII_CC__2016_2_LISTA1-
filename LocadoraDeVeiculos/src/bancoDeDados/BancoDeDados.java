package bancoDeDados;

import java.util.ArrayList;

import veiculos.Veiculo;


public class BancoDeDados {
	
	ArrayList dateBase = new ArrayList();
	
	public void salvaCadVeiculo (Veiculo novoVeiculo){
		dateBase.add(novoVeiculo);
		System.out.printf("\nCadastro salvo com sucesso!\n\n");
		
	}

}