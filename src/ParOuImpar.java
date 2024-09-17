import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 0;

        System.out.print("Par ou Impar? Insira um número inteiro: ");
        numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.printf ("O numero %d é par.", numero);
        } else System.out.printf("O numero %d é impar.", numero);
    }
}