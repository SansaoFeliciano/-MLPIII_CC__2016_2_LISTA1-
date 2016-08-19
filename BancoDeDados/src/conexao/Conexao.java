package conexao;

public class Conexao {
	
	private static Conexao uniqueInstance;

	private Conexao() {
		
	}

	public static synchronized Conexao getInstance() {
		if (uniqueInstance == null){
			uniqueInstance = new Conexao();
			System.out.println("Criada conexão: " + uniqueInstance);}
		else
			System.out.println("Já existe uma conexao: "+uniqueInstance);

		return uniqueInstance;
	}
}


