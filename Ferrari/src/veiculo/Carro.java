package veiculo;

public class Carro {
	
	private String cor;
	private String modelo;
	private double velocidadeAtual;
	private double velocidadeMaxima=100;
	private boolean ligar;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public void acelerar(){
		this.velocidadeAtual++;
		if (this.velocidadeAtual > this.velocidadeMaxima )
		System.out.println("Velocidade máxima excedida");
		else
			System.out.println("VRUUUM");
	}
	
	public void ligar(){
		this.ligar = true;
		System.out.println("Carro ligado!");
	}
	

}
