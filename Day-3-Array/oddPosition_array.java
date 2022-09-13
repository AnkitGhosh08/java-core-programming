public class oddPosition_array
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i = i + 2)
        {
            System.out.println("element of an array present on an odd position :- " + arr[i]);
        }
    }
}