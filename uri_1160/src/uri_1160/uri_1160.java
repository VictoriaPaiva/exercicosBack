package uri_1160;

import java.util.Scanner;

public class uri_1160 {
	public static void main(String angs[]) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {

			double pa = sc.nextInt();
			double pb = sc.nextInt();
			double g1 = sc.nextDouble();
			double g2 = sc.nextDouble();
			int c1;
			int c2;
			int anos = 0;
			while (pa <= pb) {
				c1 = (int) (pa * g1) / 100;
				pa = pa + c1;
				c2 = (int) (pb * g2) / 100;
				pb = pb + c2;
				anos++;
			}
			if (anos > 100) {
				System.out.println("Mais de um seculo");
			} else {
				System.out.println(anos + " anos.");
			}

		}
	}
}