package ATB;

import java.sql.SQLOutput;

public class Array_2 {
    public static void main(String[] args)
    {
        int[] array={10,18,19,17,15,22};

        int min=array[0];
        int max=array[0];

        for(int i=0;i< array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];

            }
        }
        System.out.println("maximum"+" "+max);

        for(int i=0;i< array.length;i++)
        {
            if(array[i]<min)
            {
                min=array[i];

            }
        }
        System.out.println("minimim"+" "+min);

    }
}
