import java.util.Scanner;

public class Switchcase {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero;
		System.out.println("Insira o seu DDD: ");
		numero = input.nextInt();
		
		switch (numero) {
		case 21 :
			System.out.println("Rio de Janeiro");
			  break;
		case 11, 33, 52, 76 :
			System.out.println("Sao paulo, zona leste");
			  break;
		}
	}

}
