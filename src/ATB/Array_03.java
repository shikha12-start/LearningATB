package ATB;

public class Array_03 {
    public static void main(String[] args)
    {
        int[] marks={10,16,9,17,67};

        System.out.println(marks[0]);

        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("--------------");
        for(int mark:marks)
        {
            System.out.println(mark);
        }
    }
}
