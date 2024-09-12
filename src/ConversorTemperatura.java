public class ConversorTemperatura {
    public static void main(String[] args) {
        int celsius = 46;
        double fahrenheit = (celsius * 1.8) + 32;
        String resultadoConversao = String.format("""
                A conversão de %dºC para Fahrenheit é de: %.1fºF""", celsius, fahrenheit);

        System.out.println(resultadoConversao);

        int temperaturaFahrenheitInteira = (int) fahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaFahrenheitInteira + "ºF");
    }
}