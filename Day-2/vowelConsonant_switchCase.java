import java.util.Scanner;

public class vowelConsonant_switchCase
{
    public static void main(String[] args)
    {
        boolean isVowel=false;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        char vk = sc.next().charAt(0);
        switch (vk)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': isVowel=true;

        }
        if(isVowel==true)
        {
            System.out.println( vk+ " is a vowel " );
        } else if (( vk >'a' && vk<'z') || ( vk>'A' && vk<'Z'))
        {
            System.out.println( vk+" is a consonant " );

        } else
        {
            System.out.println(" invalid character/letter ! ");
        }
    }
}
