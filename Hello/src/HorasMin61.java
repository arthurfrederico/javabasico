import java.util.Scanner;

public class HorasMin61 {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int min, hora, dia, min1, hora1, dia1;
	
	System.out.println("Por favor, insira o dia de inicio do evento: ");
	dia = teclado.nextInt();
	System.out.println("Insira agora a hora: ");
	hora = teclado.nextInt();
	System.out.println("Por ultimo insira os minutos: ");
	min = teclado.nextInt();
	
	System.out.println("A data de inicio foi ---> Dia " + dia + ", as " + hora + ":" + min + " Horas");
	
	System.out.println("Por favor, insira o dia de termino do evento: ");
	dia1 = teclado.nextInt();
	System.out.println("Insira agora a hora: ");
	hora1 = teclado.nextInt();
	System.out.println("Por ultimo insira os minutos: ");
	min1 = teclado.nextInt();
}
}
