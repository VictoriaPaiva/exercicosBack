package uri_1165;

import java.util.Scanner;

public class uri_1165 {
	public static void main(String angs[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int X = sc.nextInt();
			int y = 0;
			for (int cont = X; cont > 0; cont--) {
				if (X % cont == 0) {
					y++;
				}
			}
			if (y > 2) {
				System.out.println(X + " nao eh primo");
			} else {
				System.out.println(X + " eh primo");
			}
		}
	}
}
