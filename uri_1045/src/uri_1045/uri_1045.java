package uri_1045;

import java.util.Scanner;

public class uri_1045 {
	public static void main(String angs[]) {
		Scanner sc = new Scanner(System.in);
		float A = sc.nextFloat();
		float B = sc.nextFloat();
		float C = sc.nextFloat();
		float x;
		if (A >= B && A >= C && C >= B) {
			x = C;
			C = B;
			B = x;
		} else if (B >= A && B >= C && A >= C) {
			x = B;
			B = A;
			A = x;
		} else if (B >= C && B >= A && C >= A) {
			x = A;
			A = B;
			B = C;
			C = x;
		} else if (C >= A && C >= B && A >= B) {
			x = A;
			A = C;
			C = B;
			B = x;
		} else if (C >= A && C >= B && B >= A) {
			x = A;
			A = C;
			C = x;
		}
		if (A >= (B + C)) {
			System.out.println("NAO FORMA TRIANGULO");
		} else if ((A * A) == ((B * B) + (C * C))) {
			System.out.println("TRIANGULO RETANGULO");
		} else if ((A * A) > ((B * B) + (C * C))) {
			System.out.println("TRIANGULO OBTUSANGULO");
		} else if ((A * A) < ((B * B) + (C * C))) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		if (!(A >= (B + C)) && A == B && A == C) {
			System.out.println("TRIANGULO EQUILATERO");
		} else if (!(A >= (B + C)) && A == B || A == C || C == B) {
			System.out.println("TRIANGULO ISOSCELES");
		}
	}
}
