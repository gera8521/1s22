import java.util.Scanner;
public class P7_1S22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Float a,b,c;
		System.out.println("Ingresa el primer numero: ");
		a = input.nextFloat();
		System.out.println("Ingresa el segundo numero: ");
		b = input.nextFloat();
		c = (a / b);
		System.out.println("La división de los numeros es: " + c);
		input.close();

	}
}