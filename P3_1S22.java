import java.util.Scanner;
class P3_1S22{
  public static void main(String[] args) {
        String nombre;
	    Scanner teclado = new Scanner(System.in);
	    System.out.println("ingresa tu nombre");
        nombre = teclado.nextLine();
        System.out.println("bienvenido "+nombre+" es la clase de programacion");
  }
}