import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1;
        String msj;

        System.out.println(" Por favor ingrese el número a evaluar: ");
        n1 = teclado.nextInt();

        msj = (n1 % 2 == 0) ? "Par" : "Impar";

        System.out.println("El Número " + n1 + " es: " + msj);

    }

}
