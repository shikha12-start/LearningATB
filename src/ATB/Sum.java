package ATB;

public class Sum {

    public static void main(String[] args)
    {
        int[] sumArray= {12,19,11,10,17};
        int sum=0;

        for(int i=0;i<sumArray.length;i++)
        {
            sum=sum+sumArray[i];
            //sum+=sumArray[i];


        }
        System.out.println(sum);
    }
}
