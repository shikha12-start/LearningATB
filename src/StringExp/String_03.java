package StringExp;

public class String_03 {

    public static void main(String[] args)
    {
       CharSequence s= "Shikha".subSequence(1,4);
        System.out.println(s);

      String s1=  "Shikha".substring(1);
        System.out.println(s1);

       String s2= "Gupta".substring(1,3);
        System.out.println(s2);

        char[] ch="Shikha".toCharArray();
        System.out.println(ch);

        String s3=" Shikha ".trim();
        System.out.println(s3);

        Boolean s5="  ".isBlank();
        System.out.println(s5);

       boolean b= "Shikha".equalsIgnoreCase("Shikh");
        System.out.println(b);


        String s6="Java";
        char c=s6.charAt(2);
        System.out.println(c);

       int a= "abcd".compareTo("ABCD");
        System.out.println(a);


        int av="shiakha".indexOf('a');
        System.out.println(av);

        int as="shiakha".lastIndexOf('a');
        System.out.println(as);


       boolean bc= "".isEmpty();
        System.out.println(bc);

       String dg= "shikha".replace('k','p');
        System.out.println(dg);

       boolean vg= "shikha".startsWith("kh");
        System.out.println(vg);




    }
}
