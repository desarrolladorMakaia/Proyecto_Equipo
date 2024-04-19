import java.util.Scanner;

public class Punto3 {
    public static void main(String[] args) {
        float numero;
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println("Por favor ingrese un número:");
        numero = input.nextFloat();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par");
        } else if (numero == 0) {
            System.out.println("El número " + numero + " es neutro");
        } else {
            System.out.println("El número " + numero + " es impar");
        }

    }
}
