import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Diasvida {
    public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor, anos, meses, dias;
		
		System.out.println("Favor, insira sua idade em dias: ");
		valor = teclado.nextInt();
		
		anos  = valor/365;
		meses = (valor%365)/30;
		dias  = (valor%365)%30;
		System.out.println("Voce tem " + anos + "anos, " + meses + (" meses e " + dias + " dias."));
		
	}
    }
