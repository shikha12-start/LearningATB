package StringExp;

import java.util.Locale;

public class String_01
{

    public static void main(String[] args)
    {
        String a="New point";
        a.toUpperCase();
        System.out.println(a); //New point
        System.out.println(a.toUpperCase());


        //String creation
         String b="Shikha";
         String c=new String("SG");

        System.out.println(b);
        System.out.println(c);


        //Concat

        String ab="Shikha";
        ab=ab.concat(" Gupta");

        System.out.println(ab);

    }
}

