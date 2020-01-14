import java.util.Scanner;

public class Cadastro {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Produto lista[] = new Produto[5];
		int posicao = 0;
		Produto p = new Produto();

		do {
			try {
			System.out.println("Posicao: " + posicao);
			System.out.println("Digite um Id: ");
			int id = Integer.parseInt(sc.nextLine());
			p.setId(id);
			System.out.println("Digite um nome: ");
			String nome = sc.nextLine();
			p.setNome(nome);
			System.out.println("Digite um detalhe: ");
			String detalhes = sc.nextLine();
			p.setDetalhes(detalhes);
			System.out.println("Digite um preco: ");
			Float preco = Float.parseFloat(sc.nextLine());
			p.setPreco(preco);
			System.out.println("Digite a quantidade em estoque: ");
			Float estoque = Float.parseFloat(sc.nextLine());
			p.setQntEstoque(estoque);
			posicao++;
			//System.out.println("\n***************\n" + p + "\n\n*************************\n");
			}
			
			catch(Exception ex)
			{
				System.out.println("Erro ao cadastrar");
				System.out.println("MOTIVO: " + ex.getMessage());
			}
			finally {
				System.out.println("\n***************\n" + p + "\n\n*************************\n");
			}
		} while (posicao < 5);
		
	}

}
