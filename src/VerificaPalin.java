public class VerificaPalin
{
    public static boolean isPalindrome(String input)
    {
        String cleanedInput = input.toLowerCase().replaceAll("[\\W_]", ""); 

        Pilha pilha = new Pilha();

        for (int i = 0; i < cleanedInput.length(); i++)
        {
            pilha.push(cleanedInput.charAt(i));
        }

        for (int i = 0; i < cleanedInput.length(); i++)
        {
            if (cleanedInput.charAt(i) != pilha.pop())
            {
                return false;
            }
        }
        return true;
    }
}