public class elementOfAnArray
{
    public static void main(String[] args) {
        int arr[] = new int[5];
        int[] ar= {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=i;
        }
        printarryvalue(arr);

    }

    private static void printarryvalue(int[] arr)
    {
        System.out.println( "[" );
        for (int i=0;i<arr.length;i++)
        {
            if(arr.length-1 ==i)
            {
                System.out.println( arr[i] + "]" );
            }
            else
            {
                System.out.println( arr[i]+ "," );
            }

        }
    }
}
