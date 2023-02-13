import java.util.Scanner;

public class Notas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int valor, resto, cedulas;
        
        //Lendo o valor inteiro
        System.out.print("Informe o valor: ");
        valor = scanner.nextInt();
        
        System.out.println("NOTAS:");
        
        
        //Calculando as cédulas de 100
        cedulas = valor / 100;
        resto = valor % 100;
        System.out.println(cedulas + " nota(s) de R$ 100,00");
        
        //Calculando as cédulas de 50
        cedulas = resto / 50;
        resto = resto % 50;
        System.out.println(cedulas + " nota(s) de R$ 50,00");
        
        //Calculando as cédulas de 20
        cedulas = resto / 20;
        resto = resto % 20;
        System.out.println(cedulas + " nota(s) de R$ 20,00");
        
        //Calculando as cédulas de 10
        cedulas = resto / 10;
        resto = resto % 10;
        System.out.println(cedulas + " nota(s) de R$ 10,00");
        
        //Calculando as cédulas de 5
        cedulas = resto / 5;
        resto = resto % 5;
        System.out.println(cedulas + " nota(s) de R$ 5,00");
        
        //Calculando as cédulas de 2
        cedulas = resto / 2;
        resto = resto % 2;
        System.out.println(cedulas + " nota(s) de R$ 2,00");
        
        //Calculando as cédulas de 1
        System.out.println(resto + " nota(s) de R$ 1,00");
    }
}

