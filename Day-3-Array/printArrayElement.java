import javax.swing.text.Element;

public class printArrayElement
{
    public static void main(String[] args)
    {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        // we can also print element of an array with these two way.
        //1. int[] arr = {1,2,3,4,5};
        //2. int [] arr = new int[5];
        //   int [0] = 1;
        //   int [1] = 2;
        //   int [2] = 3;
        //   int [3] = 4;
        //   int [4] = 5;

        for (int i=0;i<arr.length;i++)
        {
            System.out.println("" + arr[i] );
        }
    }
}