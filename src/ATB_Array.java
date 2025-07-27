import java.sql.SQLOutput;

public class ATB_Array {

    public static void main(String[] args)
    {
  int[] arr={18,19,17,10,4};
  int maximum=maxNumber(arr);
        System.out.println("Maximum:"+" " +maximum);



    }

    static int maxNumber(int[] arr)
    {
            int max=0;
                 max=   arr[0];

            for(int i =0;i<arr.length;i++)
            {
                if(arr[i]>max)
                {
                    max=arr[i];
                }
            }
        return max;
    }

}
