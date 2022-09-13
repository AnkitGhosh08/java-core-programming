import java.util.Scanner;

public class primeNumber
{
    public static void main(String[] args)
    {
        int n;
        int temp=0;
        Scanner sc= new Scanner(System.in);
        System.out.print(" Enter a number : ");
        n=sc.nextInt();
        for( int i=2; i<=n ; i++ )
        {
            if( n%i==0 )
            {
                temp=temp+1;
            }
            if(temp>0)
            {
                System.out.println("not a prime number");
            }else
            {
                System.out.println("prime number");
            }
        }

    }
}
