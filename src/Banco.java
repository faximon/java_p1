import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int escolhaMenu = 0;
        String nomeCliente = "Vitor Rodrigues";
        String tipoContaCliente = "Corrente";
        double saldoCliente = 5000.0;

        String dadosIniciaisCliente = String.format("""
                ****************************************
                Dados iniciais do cliente:
                                
                Nome:             %s
                Tipo Conta:       %s
                Saldo inicial:    R$ %.2f
                ****************************************
                                
                """, nomeCliente, tipoContaCliente, saldoCliente);

        String menu = """
                Operações:
                                
                1. Consultar saldos
                2. Receber valor
                3. Transferir valor
                4. Sair
                """;

        System.out.println(dadosIniciaisCliente);

        while (escolhaMenu != 4) {
            System.out.print(menu);
            escolhaMenu = input.nextInt();

            switch (escolhaMenu) {
                case 1:
                    System.out.printf("O saldo atual é de R$ %.2f %n %n", saldoCliente);
                    break;

                case 2:
                    System.out.print("Informe o valor a receber: ");
                    double valorDepositado = input.nextDouble();
                    if (valorDepositado > 0) {
                        saldoCliente += valorDepositado;
                        System.out.printf("Saldo atualizado R$ %.2f %n %n", saldoCliente);
                    } else {
                        System.out.printf("Ação inválida. Impossível depositar com valor negativo. %n %n");
                    }
                    break;

                case 3:
                    System.out.print("Informe o valor que deseja transferir: ");
                    double valorParaTransferir = input.nextDouble();

                    if (valorParaTransferir < 0){
                        System.out.printf("Ação inválida. Impossível transferir um valor negativo. %n %n");
                    }   else if (saldoCliente < valorParaTransferir){
                        System.out.println("Não há saldo suficiente para fazer essa transferência");
                    } else if (saldoCliente > valorParaTransferir){
                        System.out.printf("O valor de R$ %.2f foi transferido. %n %n",valorParaTransferir);
                        saldoCliente -= valorParaTransferir;
                    }
                    break;

                case 4:
                    System.out.println("Finalizando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}