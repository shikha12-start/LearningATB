package ArrayPrograms;

public class ArrayReverse {
    public static void main(String[] args)
    {
        int[] arr={10,18,19,19,17};

        System.out.println("Original Array");

        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("After Reverse");

        for(int i =arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
