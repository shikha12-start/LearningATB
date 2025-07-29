package StringExp;

public class String_02 {

    public static void main(String[] args)
    {
        String a="Shikha";
        System.out.println(a.length());
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.contains("ik"));
        System.out.println(a.charAt(2));
        System.out.println(a.concat("S"));


        String str="Hello";
        String st1=new String("Hello");

        System.out.println(str==st1);
        System.out.println(str.equals(st1));
    }
}
