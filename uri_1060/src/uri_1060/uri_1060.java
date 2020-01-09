package uri_1060;

import java.util.Scanner;

public class uri_1060 {
	public static void main(String angs[]) {
		Scanner sc = new Scanner(System.in);
		int pos = 0;
		for (int cont = 0; cont < 6; cont++) {
			double x = sc.nextDouble();
			if (x > 0) {
				pos++;
			}
		}
		System.out.println(pos + " valores positivos");
	}
}
