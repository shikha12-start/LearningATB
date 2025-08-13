package StringExp;

public class DuplicateWord {

    public static void main(String[] args)
    {
        String str="Big black bug bit a big black dog on his big black nose";

        int count=0;

      String[] string=  str.split(" ");

      for(int i=0;i<string.length;i++)
      {
          count=1;

          for(int j=i+1;j<string.length;j++)
          {
              if(string[i].equals(string[j]))
              {
                  count++;

                  string[j]="0";
              }
          }

          if(count>1 && string[i]!="0")
          {
              System.out.println(string[i]);
          }
      }
    }
}
