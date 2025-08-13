package ArrayPrograms;

public class DuplicateElement {
    public static void main(String[] args)
    {
            int[] arr={10,18,19,17,10,18};

            for(int i=0;i< arr.length;i++)
            {
                for(int j=i+1;j< arr.length;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        System.out.println("Duplicate element :"+arr[i]);


                    }
                }
            }
    }
}
