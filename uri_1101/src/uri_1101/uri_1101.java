package uri_1101;
import java.util.Scanner;
public class uri_1101 {
public static void main(String angs[]) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int m = 0;
		int soma = 0;
		int soma2 = 0;
		do {
			n = sc.nextInt();
			m = sc.nextInt();
			if (n > 0 && m > 0 && n > m) {
				for (int i = m; i <= n; i++) {
					System.out.print(i + " ");
					soma = soma + i;
				}
				System.out.println(" Sum=" + soma);
			} else if (n > 0 && m > 0 && m > n) {
				for (int i = n; i <= m; i++) {
					System.out.print(i + " ");
					soma2 = soma2 + i;
				}
				System.out.println(" Sum=" + soma2);

			}
		} while (n > 0 && m > 0);
	
}
}
