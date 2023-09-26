import java.util.Scanner;
public class P5_1S22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,c;
		System.out.println("Ingresa el primer numero: ");
		a = input.nextInt();
		System.out.println("Ingresa el segundo numero: ");
		b = input.nextInt();
		c = (a - b);
		System.out.println("La resta de los numeros es: " + c);
		input.close();

	}
}