
public class Livro {
private String titulo;
private String autor;
private int ano;
private String categoria;
private int posicaoEstante;
private int posicaoPrateleira;
private boolean disponivel;

public Livro(String titulo,boolean disponivel) {
	
}
public Livro(String titulo,String autor,int ano,String categoria,int posicaoE,int posicaoP,boolean disponivel) {
	
}
public Livro(String titulo,String autor,boolean disponivel) {
	
}

public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}
public String getCategoria() {
	return categoria;
}
public void setCategoria(String categoria) {
	this.categoria = categoria;
}
public int getPosicaoEstante() {
	return posicaoEstante;
}
public void setPosicaoEstante(int posicaoEstante) {
	this.posicaoEstante = posicaoEstante;
}
public int getPosicaoPrateleira() {
	return posicaoPrateleira;
}
public void setPosicaoPrateleira(int posicaoPrateleira) {
	this.posicaoPrateleira = posicaoPrateleira;
}
public boolean isDisponivel() {
	return disponivel;
}
public void setDisponivel(boolean disponivel) {
	this.disponivel = disponivel;
}
void emprestimo() {
	if(disponivel) {
		disponivel = false;
		System.out.println("Aqui está o seu livro");
	}else {
		System.out.println("Livro indisponivel");
	}
}
void devolver() {
	if(disponivel) {
		System.out.println("livro ja devolvido");
	}else {
		disponivel = true;
		System.out.println("Obrigada pela devolução.Devolução concluida");
	}
	
}
void verificar() {
	if(disponivel) {
		System.out.println("Livro disponivel");
	}
	else {
		System.out.println("Livro indisponivel");
	}
}

}
