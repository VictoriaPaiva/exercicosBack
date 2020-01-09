package uri_1018;

import java.util.Scanner;

public class uri_1018 {
	public static void main(String angs[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int n = N;
		int resto = N;
		int qnt100 = 0;
		int qnt50 = 0;
		int qnt20 = 0;
		int qnt10 = 0;
		int qnt5 = 0;
		int qnt2 = 0;
		if (N >= 100) {
			qnt100 = N / 100;
			resto = N - (qnt100 * 100);
			N = resto;
		}
		if (N >= 50) {
			qnt50 = N / 50;
			resto = N - (qnt50 * 50);
			N = resto;

		}
		if (N >= 20) {
			qnt20 = N / 20;
			resto = N - (qnt20 * 20);
			N = resto;

		}
		if (N >= 10) {
			qnt10 = N / 10;
			resto = N - (qnt10 * 10);
			N = resto;

		}
		if (N >= 5) {
			qnt5 = N / 5;
			resto = N - (qnt5 * 5);
			N = resto;

		}
		if (N >= 2) {
			qnt2 = N / 2;
			resto = N - (qnt2 * 2);
			N = resto;

		}
		System.out.println(n);
		System.out.println(qnt100 + " nota(s) de R$ 100,00");
		System.out.println(qnt50 + " nota(s) de R$ 50,00");
		System.out.println(qnt20 + " nota(s) de R$ 20,00");
		System.out.println(qnt10 + " nota(s) de R$ 10,00");
		System.out.println(qnt5 + " nota(s) de R$ 5,00");
		System.out.println(qnt2 + " nota(s) de R$ 2,00");
		System.out.println(resto + " nota(s) de R$ 1,00");
		sc.close();
	}
}
