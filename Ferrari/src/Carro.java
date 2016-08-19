
public class Carro {
	
	private String cor;
	private String modelo;
	private double velocidadeAtual;
	private double velocidadeMaxima;
	private boolean ligar;
	
	protected String getCor() {
		return cor;
	}
	protected void setCor(String cor) {
		this.cor = cor;
	}
	protected String getModelo() {
		return modelo;
	}
	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}
	protected double getVelocidadeAtual() {
		return velocidadeAtual;
	}
	protected void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	protected double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	protected void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	protected String acelerar(){
		this.velocidadeAtual++;
		if (this.velocidadeAtual > this.velocidadeMaxima )
		return "Velocidade máxima excedida";
		
		return "Velocidade dentro do limite permitido";
	}
	
	protected void ligar(){
		this.ligar = true;
	}
	

}
