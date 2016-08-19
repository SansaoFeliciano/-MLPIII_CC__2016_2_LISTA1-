package Produtos;
import java.util.InputMismatchException;

public class Item {
	
	private String numero;
	private String descricao;
	private int quantidade=0;
	private double preco=0.0;
	private double valorProduto=0.0;
	protected static double valorTotal=0.0;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
	try{
	    if (quantidade >0)
		this.quantidade = quantidade;}
	catch (InputMismatchException e){
		 System.out.println("Quantidade inválida!");
	}
	}
	public double getPreco() {
		return preco;
	}
	

	public void setPreco(double preco) {
			if(preco >0)
	        	this.preco = preco;
			else this.preco = 0;
	  }
	
	public void setValorProduto(){
		if ((this.quantidade * this.preco)>0){
		this.valorProduto = (this.quantidade * this.preco);
		this.valorTotal += (float) this.valorProduto;}
}
	public static double getValorTotal() {
		return valorTotal;
	}
	public double getValor(){
		return this.valorProduto;
		
	}
	
	
	

}
