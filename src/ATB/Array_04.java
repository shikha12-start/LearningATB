package ATB;

import com.sun.source.doctree.EscapeTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Array_04 {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        String[] names=new String[size];

        for(int i=0;i< size;i++)
        {
            System.out.println("Enter the elements:" +i);
            names[i]=sc.next();
        }

        for(int i=0;i< names.length;i++)
        {
            System.out.println(names[i]);
        }
        sc.close();
    }
}
