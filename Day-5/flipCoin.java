import java.util.Scanner;

public class flipCoin
{
    public static void main(String [] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println(" Enter the value : ");
        int no_Of_Flip = sc.nextInt();
        int head = 0;
        int tail = 0;
        for(int i=0; i < no_Of_Flip; i++)
        {
            if(Math.random()<0.5){
                System.out.println(" It is a tail ");
                tail++;
            }
            else
            {
                System.out.println(" it ia s head ");
                head++;
            }
        }
        System.out.println("number of times tail :" + tail);
        System.out.println("number of times head:" + head);

        int tailPercent=(tail*100)/no_Of_Flip;
        int headPercent=(head*100)/no_Of_Flip;
        System.out.println("percentage of tail & head is : tail"+ tailPercent +" % vs head"+headPercent+"%");
    }
}
