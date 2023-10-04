import java.util.Scanner;
import java.lang.Math;

public class p2_1s22 {
    public static void main(String[] args) {
        java.util.Scanner teclado = new Scanner(System.in);
        double a;
        double resultado;
        System.out.println("calcular el angulo en radianes");

        System.out.println("introduccir un angulo: ");
        a = teclado.nextInt();
        resultado = Math.PI*a/180;
        //radianes es = a*PI/180
        System.out.println("el resultado en radianes es: "+ resultado);

        
    
    }
}