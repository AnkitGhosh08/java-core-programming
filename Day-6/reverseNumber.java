import java.util.Scanner;

public class reverseNumber
{
    public static void main(String[] args)
    {
        int n;
        int rev=0;
        int rem=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        n= sc.nextInt();
        for(;n!=0 ;  n=n/10)
        {
            rem=n%10;
            rev=rev*10+rem;
        }
        System.out.println( " reverse number is :" + rev );
    }
}
