package veiculos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import pessoa.Pessoa;

public abstract class Veiculo {
	
	String placa;
	String marca;
	String modelo;
	String ano;
	double valorKmRodado;
	double kmInicial;
	double kmFinal;
	double valorDaLocação;
	double chassi;
	Pessoa proprietario;
	
	BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
	boolean ok = false;
	
	public Veiculo CadVeiculo(Veiculo veiculo) throws IOException{
		
		Veiculo novoveiculo = veiculo;
		System.out.println("Digite a placa do Veículo: ");
		novoveiculo.setPlaca(leitor.readLine());
		System.out.println("Digite a marca do Veículo: ");
		novoveiculo.setMarca(leitor.readLine());
		System.out.println("Digite o modelo do Veículo: ");
		novoveiculo.setModelo(leitor.readLine());
		System.out.println("Digite o ano do Veículo: ");
		novoveiculo.setAno(leitor.readLine());
		System.out.println("Digite o ano do Veículo: ");
		novoveiculo.setAno(leitor.readLine());
		
		return novoveiculo;
		
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String string) {
		this.ano = string;
	}
	public double getValorKmRodado() {
		return valorKmRodado;
	}
	public void setValorKmRodado(double valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}
	public double getKmInicial() {
		return kmInicial;
	}
	public void setKmInicial(double kmInicial) {
		this.kmInicial = kmInicial;
	}
	public double getKmFinal() {
		return kmFinal;
	}
	public void setKmFinal(double kmFinal) {
		this.kmFinal = kmFinal;
	}
	public double getValorDaLocação() {
		return valorDaLocação;
	}
		public boolean setValorDaLocação(String valorDaLocação) {
			Double valorDaLocação1 = null;
			valorDaLocação1 = valorDaLocação1.parseDouble(valorDaLocação);
			if(valorDaLocação1 > 0){
				this.valorDaLocação = ((this.kmInicial - this.kmFinal) * this.valorKmRodado);
			return true;}
			else{
				System.out.println("Preço inválido. Digite um valor maior que 0.");
			return false;}
			}
		
	public double getChassi() {
		return chassi;
	}
	public void setChassi(double chassi) {
		this.chassi = chassi;
	}
	public Pessoa getProprietario() {
		return proprietario;
	}
	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}
	
	

	
}
