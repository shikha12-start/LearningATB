package ATB;

public class Array_02 {
    public static void main(String[] args)
    {
       int[] arr={10,17,19,18};
       boolean[] boo={true,false};
       String[] str={"shikha","vinod","pinky"};
       int[] exp=new int[6];
       exp[0]=12;
       exp[1]=23;

       String[] emp=new String[6];
       emp[0]="shikha";
       emp[1]="vinod";
       emp[2]="vicky";



        System.out.println(str[2]);
        arr[2]=20;
        System.out.println(arr[2]);
        System.out.println(boo[1]);
        System.out.println(boo.length);
        System.out.println(str.length);
        System.out.println(exp[0]);
        System.out.println(emp.length);
        System.out.println(emp[2]);

    }
}
