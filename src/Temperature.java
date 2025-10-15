public class Temperature {
    public static void main(String[] args) {
        /*
           Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit.
           Utilize variáveis para representar os valores das temperaturas e imprima no console o
           valor convertido de Celsius para Fahrenheit.
        */

        int celsius = 25;
        double fahrenheit = (celsius * 1.8) + 32;
        int temperatureCasting = (int) fahrenheit;
        String message = String.format("""
                Conversor de temperatura: Celsius -> Fahrenheit
                Temperatura inicial: %dºc
                Equivale a %dºf;
                """, celsius, temperatureCasting);
        System.out.printf(message);
    }
}
