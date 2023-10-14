import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[20];
        System.out.println("Ingresar 20 números enteros, uno por uno: ");

        for (int i = 0; i < 20; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Elemento | Cuadrado | Cubo");
        for (int i = 0; i < 20; i++) {
            System.out.println(numeros[i] + "        | " + (numeros[i] * numeros[i]) + "        | " + (numeros[i] * numeros[i] * numeros[i]));
        }
    }
}
