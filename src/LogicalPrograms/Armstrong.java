package LogicalPrograms;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int temp=num;
        int last=0,digit=0,sum=0;

        while(num>0)
        {
            num=num/10;
            digit++;

        }
        System.out.println(digit);
        num=temp;

        while(num>0)
        {
           last =num%10;
            sum+=Math.pow(last,digit);
            num=num/10;


        }
        if(temp==num)
            System.out.println("armstrong");
        else
            System.out.println("not armstrong");

        System.out.println(sum);
    }
}
