import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra, frase ou número para verificar se é um palíndromo:");
        String input = scanner.nextLine();

        if(VerificaPalin.isPalindrome(input))
        {
            System.out.println(input + " é um palíndromo.");
        } else
        {
            System.out.println(input + " não é um palíndromo.");
        }

        scanner.close();
    }
}
