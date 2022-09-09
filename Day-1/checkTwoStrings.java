public class checkTwoStrings
{
    public static void main(String[] args)
    {
        String a1=" the universe is 13.7 billion years old ";
        // a1 = "India"
        String a2=" the universe is 13.7 billion years old ";
        // a2 = "India"
        String a3=" the universe is just 13.7 million year old ";
        // a3 = "india"
        {
            System.out.println( a1 == a2 );
        }
        {
            System.out.println( a1 == a3);
        }
    }
}
