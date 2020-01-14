
public class Produto {
	private int id;
	private String nome;
	private String detalhes;
	private float preco;
	private float qntEstoque;
	
	
	
	public Produto() {
		super();
		this.id = id;
		this.nome = nome;
		this.detalhes = detalhes;
		this.preco = preco;
		this.qntEstoque = qntEstoque;
	}
	public int getId() {
		
		return id;
	}
	
	public void setId(int id) {
		if (id<=0) {
			throw new RuntimeException("ID nao pode ser menor ou igual a zero");

		}
		this.id = id;
	}
	public String getNome() {
		
		return nome;
	}
	public void setNome(String nome) {
		if(nome==null || nome.length()==0) {
			throw new RuntimeException("Nome nao pode ser vazio");
		}
		this.nome = nome;
	}
	public String getDetalhes() {
		
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		if (detalhes==null||detalhes.length()==0) {
		throw new RuntimeException("Detalhes nao pode ser vazio");
	}
		this.detalhes = detalhes;
	}
	public float getPreco() {
		
		return preco;
	}
	public void setPreco(float preco) {
		if(preco<=0) {
			throw new RuntimeException("Preco nao pode ser menor ou igual a zero");
		}
		this.preco = preco;
	}
	public float getQntEstoque() {
		
		return qntEstoque;
	}
	public void setQntEstoque(float qntEstoque) {
		if(qntEstoque<0) {
			throw new RuntimeException("Estoque nao pode ser menor que zero");
		}
		this.qntEstoque = qntEstoque;
	}
	public String toString (){
		return ("id: " + id + "\nnome: " + nome + "\ndetalhes: " + detalhes + "\npreço: R$" + preco + "\nEstoque: " + qntEstoque);
				
	}
}
