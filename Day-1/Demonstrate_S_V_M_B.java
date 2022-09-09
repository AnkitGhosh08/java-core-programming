public class Demonstrate_S_V_M_B
{
    static int a=150;
    static int b;

    static void vk(int x)
    {
        System.out.println("x = " + x);
        System.out.println("a = " + a );
        System.out.println("b = " + b );
    }
            static
            {
                System.out.println("static block initialized");
                b=a*99;
            }
            public static void main( String[] args)
            {
        vk(50);
            }
}
