public class palindromeNumber
{
    public static void main(String[] args)
    {
        int num=121;
        int temp=num;
        int rev=0;
        int rem=0;
        for (; temp!=0; temp=temp/10)
        {
            rem=temp%10;
            rev=rev*10+rem;
        }
        if(num==rev)
        {
            System.out.println(num + " is a palindrome number.");
        }
        else
        {
            System.out.println(num + " not a palindrome number.");
        }

    }
}
