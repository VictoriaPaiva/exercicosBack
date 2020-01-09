package uri_1047;

import java.util.Scanner;

public class uri_1047 {
	public static void main(String angs[]) {
		Scanner sc = new Scanner(System.in);
		int horaI = sc.nextInt();
		int minI = sc.nextInt();
		int horaF = sc.nextInt();
		int minF = sc.nextInt();
		int hora = 0;
		int min = 0;
		if (horaI == horaF) {
			hora = 24;
		} else if (horaI > horaF) {
			hora = (horaI - horaF) - 24;
		} else if (horaI < horaF) {
			hora = (horaF - horaI);
		}
		if (minI == minF) {
			min = 0;
		} else if (minI > minF) {
			min = (minI - minF) - 60;
		} else if (minI < minF) {
			min = minF - minI;
		}
		if (min < 0) {
			hora--;
			min = 60 - (minI - minF);
		}
		System.out.println("O JOGO DUROU " + hora + " HORA(S) E " + min + " MINUTO(S)");
	}
}
