package br.com.victoria.ExercicioSpringBoot.Model;

public class Produto {
	int id;
	String titulo;
	String detalhes;
	double preco;
	double qntEstoque;
	String linkFt;

	public Produto(int id, String titulo, String detalhes, double preco, double qntEstoque, String linkFt) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.detalhes = detalhes;
		this.preco = preco;
		this.qntEstoque = qntEstoque;
		this.linkFt = linkFt;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public double getQntEstoque() {
		return qntEstoque;
	}

	public void setQntEstoque(float qntEstoque) {
		this.qntEstoque = qntEstoque;
	}

	public String getLinkFt() {
		return linkFt;
	}

	public void setLinkFt(String linkFt) {
		this.linkFt = linkFt;
	}
	
	
	public String toString() {
		return "Id: " + id + "Titulo: " + titulo + "Detalhe: " + detalhes + "Preço: " + 
	preco + "Estoque: " + qntEstoque+ "Link da Foto: " + linkFt;
	}
}
