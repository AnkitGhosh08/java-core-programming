public class QuotientReminder
{
    public static void main(String[] args)
    {
        int dividend = 55;
        int divisor = 8;
        int quotient = dividend / divisor;
        {
            System.out.println("quotient = " + quotient);
        }
        int remainder= dividend%divisor;
        {
            System.out.println("remainder = " + remainder);
        }
    }
}