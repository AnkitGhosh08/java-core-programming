public class largestNumber_array
{
    public static void main(String[] args)
    {
        int[] arr ={3, 2, 1, 5, 4};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {

                max = arr[i];
            }
        }
        System.out.println("largest element of an array :- " + max);
    }

}


