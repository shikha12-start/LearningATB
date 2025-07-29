package ATB;

public class Reverse {

    public static  void main(String[] args)
    {
        int[] rev={10,17,18,19,20};

        //System.out.println(rev[2]);

        for(int i=rev.length-1;i>=0;i--)
        {
            System.out.println(rev[i]);
        }
    }
}
