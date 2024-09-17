import java.util.Scanner;
import java.util.function.Function;

public class NumeroPositivoOuNegativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro qualquer e eu direi se é positivo ou negativo.");
        int resultado = input.nextInt();

        if (resultado > 0) {
            System.out.println("O número " + resultado + " é positivo");
        } else if (resultado < 0){
            System.out.println("O número " + resultado + " é negativo");
        }
    }
}