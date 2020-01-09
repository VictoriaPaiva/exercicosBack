package uri_1143;
import java.util.Scanner;
public class uri_1143 {
public static void main (String angs[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int cont = 1; cont <= n; cont++) {
			System.out.println(cont + " " + cont * cont + " " + cont * cont * cont);
		}
}
}
