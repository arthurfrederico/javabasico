import java.util.Scanner;

public class Combustivel {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double consumo, km, litros;
		
		System.out.println("Insira a quantidade de KM percorrido: ");
		km = teclado.nextDouble();
		System.out.println("Agora insira a quantidade de litros consumidos: ");
		litros = teclado.nextDouble();
		
		consumo = km / litros;
				
		System.out.println("Seu consumo médio é de: " + consumo + " KM/L");
	}

}
