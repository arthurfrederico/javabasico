import java.util.Scanner;

public class Impar {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int x = 0, y = 0;
	
		while (x < 100) {
			x++;
			if (x%2 != 0 )
				y++;
					System.out.println(x);
			
			
		}
		System.out.println(y + " numeros impares.");
}
}
