import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        Double F, C;

        System.out.println("Ingrese la cantidad de Grados Celsius a Convertir: ");
        C = lector.nextDouble();
        F = 9 / 5.0 * C + 32;

        System.out.println(C + " grados Celsius equivalen a " + F + " grados Farenheit.");

    }

}
