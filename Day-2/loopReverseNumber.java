public class loopReverseNumber
{
    public static void main(String[] args)
    {
        int num =321;
        int rev=0;
        int rem=0;

        for (; num!=0;num/=10)
        {
            rem=num%10;
            rev=rev*10+rem;
        }
        {
            System.out.println(" the reverse number using loop :" + rev);
        }
    }
}
