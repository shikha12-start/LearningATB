package LogicalPrograms;

import java.sql.SQLOutput;

public class Fibonacci {

    public static void main(String[] args)
    {
        int n1=0;
        int n2=1;
        int temp,sum,n3;
        int num=15;
        System.out.print(n1+" "+n2);
        for(int i=2;i<num;i++)
        {
            n3=n1+n2;
            System.out.print(" "+ n3+" ");
            n1=n2;
            n2=n3;



        }
    }
}
