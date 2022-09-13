public class smallestNumber_array
{
    public static void main(String[] args)
    {
        int[] arr = {3,4,2,1,5};
        int min = arr[0];

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
             System.out.println("smallest element of an array :- " + min);
    }

}
