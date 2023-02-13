import java.util.Scanner;

public class numpos60 {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int a, b, contador = 0;
	
	System.out.println("Por favor, insira uma sequencia de 5 numeros aleatorios, positivos ou negativos: ");
	
	for (a = 1; a <= 6; a++) {
		b = teclado.nextInt();
		if (b > 0) {
			contador++;
				
	}
	}
	System.out.println("Voce digitou " + contador + " valores positivos.");
}
}
