package ArrayPrograms;

public class EvenNum {
    public static void main(String[] args)
    {
        int[] arr={10,6,4,8,11,5};

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
