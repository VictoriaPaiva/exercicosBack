package uri_1164;
import java.util.Scanner;
public class uri_1164 {
public static void main(String angs[]) {
		Scanner sc = new Scanner(System.in);
		int teste = sc.nextInt();
		for (int cont = 0; cont < teste;) {
			int x = sc.nextInt();
			int soma = 0;
			for (int i = x - 1; i > 0; i--) {
				if (x % i == 0) {
					soma = soma + i;
				}

			}
			if (soma == x) {
				System.out.println(x + " eh perfeito");
			} else {
				System.out.println(x + " nao eh perfeito");
			}
		}
}
}
