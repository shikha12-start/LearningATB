package LogicalPrograms;

public class Palindrome {
    public static void main(String[] args)
    {
        int num=454;
        int temp,sum=0,rev;
        temp=num;

        while(num>0)
        {
            rev=num%10;
            sum=sum*10 +rev;
            num=num/10;
        }
        System.out.println(sum);

        if(temp==sum) {

            System.out.println("palindrome");
        }
            else {

            System.out.println("not a palindrome");
        }


        }
    }

