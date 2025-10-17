import java.util.Random;
import java.util.Scanner;

public class FinalExercise {
    public static void main(String[] args) {
        /*
         * Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir
         * para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar
         * se o número digitado pelo usuário é maior ou menor do que o número gerado.
         */
        int randomNumber = new Random().nextInt(101);
        int remainingAttempts = 5;
        int attemptsUsed = 0;

        // Messages of interaction with user
        String challengeMessage = """
                🏆 Show do Javão
                Você tem apenas 5 chances para acertar e vencer o desafio!
                Qual o número secreto, entre 0 e 100?
                """;
        String messageToIncreaseGuess = """
                ⬆️ Quente!
                O número misterioso é MAIOR. Você tem apenas %d chances restantes.
                Qual é o seu próximo palpite?
                """;
        String messageToLowerGuess = """
                ⬇️ Gelado!
                O número misterioso é MENOR que o seu palpite. Você tem apenas %d chances restantes.
                Qual é o seu próximo palpite?
                """;
        String winnerMessage = """
                INCRÍVEL! VOCÊ CONSEGUIU! 🏆
                
                Você desvendou o mistério em %d tentativas!
                O número secreto, claro, era %d!
                """;
        String gameOverMessage = """
                Ah, que pena! Suas 5 tentativas se esgotaram e o número secreto permaneceu um mistério! 😔
                O número secreto era... %d !
                """;

        System.out.print(challengeMessage);
        Scanner sc = new Scanner(System.in);
        int userGuess = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            attemptsUsed++;
            remainingAttempts--;

            if (userGuess == randomNumber) {
                System.out.printf(winnerMessage, attemptsUsed, randomNumber);
                break;
            } else if (remainingAttempts != 0) {
                if (userGuess > randomNumber) {
                    System.out.printf(messageToLowerGuess, remainingAttempts);
                    userGuess = sc.nextInt();
                } else {
                    System.out.printf(messageToIncreaseGuess, remainingAttempts);
                    userGuess = sc.nextInt();
                }
            } else {
                System.out.printf(gameOverMessage, randomNumber);
            }
        }
        sc.close();
    }
}

