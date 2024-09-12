public class Main {
    public static void main(String[] args) {
        //1
        double nota1 = 8.6;
        double nota2 = 7.9;
        double mediaNotas = (nota1 + nota2) / 2;

        //2
        System.out.println("A média das notas é de: " + mediaNotas);
        System.out.println("A média inteira é de: " + (int) mediaNotas);
        System.out.println("|==================|");

        //3
        char letra = 'A';
        String palavra = " de Amor";
        System.out.println(letra + palavra);
        System.out.println("|==================|");

        //4
        double precoProduto = 3.49;
        int quantidade = 93;
        double valorTotal = precoProduto * quantidade;
        System.out.println(quantidade + " produtos no valor de R$" + precoProduto + " a unidade totalizam no valor de R$" + valorTotal);
        System.out.println("|==================|");

        //5
        double valorEmDolares = 3500;
        double valorDolarEmReais = 4.94;
        double conversaoDolarParaReal =  valorEmDolares * valorDolarEmReais;
        System.out.println("$" +valorEmDolares + " foram convertidos em R$" + conversaoDolarParaReal);
        System.out.println("|==================|");

        //6
        double precoOriginal = 1000;
        double percentualDesconto = 10;
        double descontoAplicado = precoOriginal - (precoOriginal * (percentualDesconto/100));

        System.out.println("O produto X originalmente no preço de R$" + precoOriginal + " teve um desconto de " + percentualDesconto + "% e passou a ter como valor final: R$" + descontoAplicado);

    }
}
