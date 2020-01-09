import java.util.Scanner;

public class AppQueTestaTv {
	public static void main(String angs[]) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		Televisao t1;// declarei que t1 vai "manipular" uma tv
		t1 = new Televisao("Sony", 110, 32);// reservo um espeço na memória pra isso
		/*
		 * t1.setMarca("Sony"); t1.setVoltagem(110); t1.setTamanho(32);
		 * t1.setLigada(false); t1.setCanal(5); t1.setVolume(2);
		 */
		Televisao t2 = new Televisao("LG", 220, 40, false, 0, 10);
		Televisao t3 = new Televisao();
		do {
			System.out.println("*************************");
			System.out.println(" Controle remoto da Tv");
			System.out.println("-------------------------");
			System.out.println(" 1 - Ligar/Desligar   ");
			System.out.println(" 2 - Aumentar Volume  ");
			System.out.println(" 3 - Diminuir Volume  ");
			System.out.println(" 4 - Avancar Canal    ");
			System.out.println(" 5 - Voltar Canal     ");
			System.out.println(" 0 - encerrar Sistema ");
			System.out.println("*************************");
			opcao = sc.nextInt();
			// logica das opções
			switch (opcao) {
			case 1:
				t1.switchPower();
				break;
			case 2:
				t1.aumentarVolume();
				break;
			case 3:
				t1.diminuirVolume();
				break;
			case 4:
				t1.avancarCanal();
				break;
			case 5:
				t1.voltarCanal();
				break;
			case 0:
				break;
			}
			System.out.println("\n");

		} while (opcao != 0);

	}
}
