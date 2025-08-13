package StringExp;

public class FrequencyCharacters {

    public static void main(String[] args)
    {
        String str="picture perfect";

        int[] freq=new int[str.length()];

       char[] string= str.toCharArray();



       for(int i=0;i<string.length;i++)
       {
           freq[i]=1;
           for(int j=0;j<string.length;j++)
           {
               if(string[i]==string[j])
               {
                   freq[i]++;

                   string[j]='0';
               }
           }

       }
       for(int i=0;i<freq.length;i++)
       {
           if(string[i]!=' ' && string[i]!='0')
           {
               System.out.println(freq[i]);
           }
       }
    }
}
