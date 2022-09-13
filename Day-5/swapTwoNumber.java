public class swapTwoNumber
{
    public static void main(String[] args)
    {
        int a=4;
        int b=5;
        int temp=0;
        System.out.println(" Before swap ");
        System.out.println("first number = " + a );
        System.out.println("second number = " + b );
        {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println(" after swap ");
        System.out.println("first number = " + a );
        System.out.println("second number = " + b );

    }
}
