package uri_1015;

import java.util.Scanner;

public class uri_1015 {
	public static void main(String angs[]) {
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double d = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.printf("%.4f\n", d);
	}
}
