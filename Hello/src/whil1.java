import java.util.Scanner;

public class whil1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int contador;
		
		do {
			System.out.println("Digite um numero:");
			contador = teclado.nextInt();
			System.out.println("Contador = "+contador);
		} while (contador != -1);

		
	}

}
