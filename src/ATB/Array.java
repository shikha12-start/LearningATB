package ATB;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] arr = {10, 19, 19, 18, 17};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }

//        for(int i:arr)
//        {
//            System.out.println(i);
//        }
    }


}
