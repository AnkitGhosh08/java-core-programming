public class Largest
{
    public static void main(String[] args)
    {
        int a = 33;
        int b = 44;
        int c = 22;
        if (a > b && a > c)
        {
            System.out.println(a + " is a largest ");
        }
        else if(b > a && b > c)
        {
            System.out.println(b + " is a largest ");
        }
        else
        {
            System.out.println(c + " is a largest ");
        }
    }
}