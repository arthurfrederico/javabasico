import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class DDD {
    public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int ddd;
		
		System.out.println("Por favor, insira seu DDD: ");
		ddd = teclado.nextInt();
		
		if (ddd == 61) {
			System.out.println("Brasilia");
		}
		if (ddd == 21) {
			System.out.println("Rio de Janeiro");
		}
		if (ddd == 71) {
			System.out.println("Salvador");
		}
		if (ddd == 11) {
			System.out.println("São Paulo");
		}
		else {
			System.out.println("Favor, insira um valor valido");
		}
	}
    }
