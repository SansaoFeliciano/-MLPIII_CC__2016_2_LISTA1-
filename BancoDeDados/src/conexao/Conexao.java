package conexao;

public class Conexao {
	
	private static Conexao uniqueInstance;

	private Conexao() {
		
	}

	public static synchronized Conexao getInstance() {
		if (uniqueInstance == null){
			uniqueInstance = new Conexao();
			System.out.println("Criada conex�o: " + uniqueInstance);}
		else
			System.out.println("J� existe uma conexao: "+uniqueInstance);

		return uniqueInstance;
	}
}


