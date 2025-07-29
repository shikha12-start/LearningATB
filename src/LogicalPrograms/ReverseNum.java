package LogicalPrograms;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int rev,sum=0,temp;

        temp=num;
        while(num>0)
        {
            rev=num%10;
            sum=sum*10+rev;
            num=num/10;

        }
        System.out.println(sum);
    }
}
