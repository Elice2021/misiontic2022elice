import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        int numero;
        int numero_doble;
        int numero_triple;

        System.out.println("Escribe un número entero ");

        Scanner scan = new Scanner(System.in);
        numero = scan.nextInt();

        numero_doble = numero * 2;
        numero_triple = numero * 3;

        System.out.println("El Doble de " + numero + " = " + numero_doble);
        System.out.println("El Triple de " + numero + " = " + numero_triple);

    }

}
