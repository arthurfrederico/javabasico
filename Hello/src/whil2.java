import java.util.Scanner;

public class whil2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
				double preco, total;
		
		total = 0.0;
		do {
			System.out.println("Preco do produto: ");
			preco = teclado.nextDouble();
			if (preco > 0) {
				total += preco;
			}
		} while (preco > 0);
		System.out.println("Valor total da compra R$: " + total);
		
	}

}
