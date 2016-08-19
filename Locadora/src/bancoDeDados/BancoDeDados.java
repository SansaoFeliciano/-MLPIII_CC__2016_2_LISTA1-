package bancoDeDados;

import java.util.ArrayList;
import fitas.Fita;

public class BancoDeDados {
	
	ArrayList dateBase = new ArrayList();
	
	public void salvaCadFita (Fita fita){
		
		dateBase.add(fita);
		System.out.printf("\nCadastro salvo com sucesso!\n\n");
		
	}

}
