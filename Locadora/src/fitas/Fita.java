package fitas;

public abstract class Fita{
	
	private String titulo;
	protected double precoLocacao;
	private String categoriaFilme;
	private Autor autor;

	public Fita (){
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecoLocacao() {
		return precoLocacao;
	}

	public abstract boolean setPrecoLocacao(String precoLocacao);

	public String getCategoriaFilme() {
		return categoriaFilme;
	}

	public void setCategoriaFilme(String categoriaFilme) {
		this.categoriaFilme = categoriaFilme;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor.setNomeAutor(autor) ;
	}
	
	
}
