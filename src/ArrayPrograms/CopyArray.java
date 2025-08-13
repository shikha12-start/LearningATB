package ArrayPrograms;

public class CopyArray {

    public static void main(String[] args)
    {
        int[] arr={12,18,19,10,16};
         int[] arrCopy=new int[arr.length];


         for(int i=0;i< arr.length;i++)
         {
             arrCopy[i]=arr[i];
         }
        for(int i=0;i< arrCopy.length;i++)
        {
            System.out.print(arrCopy[i]+ " ");
        }

//         for(int i:arrCopy){
//             System.out.println(arrCopy[i]);
//         }

    }
}
