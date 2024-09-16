import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 0;
        Scanner scanner = new Scanner(System.in);
        int chuteNumeroDoUsuario = 0;

        String introducao = """
                =------------------------------------------------=
                |      SEJA BEM VINDO AO JOGO DA ADIVINHAÇÃO!    |
                |                                                |
                |   Aqui você será desafiado à descobrir qual    |
                |   número que foi sorteado de forma aleatória!  |
                |                                                |
                |    Já escolhemos o número e agora você terá    |
                |     um total de 5 tentativas para acertar!     |
                =------------------------------------------------=
                """;

        String inicioJogo = """
                =-----------------------------=
                |        HORA DO JOGO!        |
                |   ESCOLHA UM NÚMERO ENTRE   |
                |           0 E 100           |
                =-----------------------------=
                """;

        System.out.println(introducao);
        System.out.println(inicioJogo);

        while (tentativas < 5) {
            chuteNumeroDoUsuario = scanner.nextInt();

            if (chuteNumeroDoUsuario < numeroAleatorio) {
                System.out.println("O número secreto é maior!");
                tentativas++;
                System.out.println("Quantiadde de tentativas: " + tentativas);
            } else if (chuteNumeroDoUsuario > numeroAleatorio) {
                System.out.println("O número secreto é menor!");
                tentativas++;
                System.out.println("Quantiadde de tentativas: " + tentativas);
            } else {
                System.out.println("Parabéns, você acertou o número com " + (tentativas + 1) + " tentativa(s)!");
            }
        }

        if (tentativas == 5 && chuteNumeroDoUsuario != numeroAleatorio) {
            System.out.println("Você não conseguiu acertar! O número aleatório era " + numeroAleatorio);
        }
    }
}