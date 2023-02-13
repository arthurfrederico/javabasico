import java.util.Scanner;

public class FORBASICS {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int valor = 0, valor2 = 0;
	int i = 0;
	float media;
	//for (i = 0; i<=10 || i > 12; i++);
	// System.out.println("Contando" + i);
	
	while (i < 11) {
		System.out.println("Contagem: " + i++);
		valor += i - 1;
		valor2 += i;
		media = (valor2/i);
		System.out.println("Soma: " + valor);
		System.out.println("Media: " + media);
	}
			
}
}
