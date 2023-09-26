import java.util.Scanner;
class P11_1S22{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int Edad;
		System.out.println("Ingresa tu edad: ");
		Edad = teclado.nextInt();
        if (Edad >= 18){
        System.out.println("Eres mayor de edad");
        }else{
        System.out.println("Eres menor de edad");
        System.out.println("Raiz cuadrada de 10 " + Math.sqrt(10));
        System.out.println("Potencia " + Math.pow(5,3));
        System.out.println("Residuo de 10/2: " + (10 % 2));
        System.out.println("Residuo de 11/2: " + (11 % 2));
        }
	}
}