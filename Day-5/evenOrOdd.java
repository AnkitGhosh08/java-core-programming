import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter a number = ");
        int num=sc.nextInt();
        if( num%2 ==0 ){
            System.out.println(num + " is a prime number " );
        }
        else
        {
            System.out.println(num + " is a odd number ");
        }
    }
}
