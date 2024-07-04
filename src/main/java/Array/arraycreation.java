package Array;

import java.util.Arrays;

public class arraycreation {
    public static void main(String[] args) {
        int arr []={1,2,5,6,7,5} ;
        int arr2 [] = new int[20];
        System.out.println(arr.length);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println(Arrays.toString(arr));
    }

}
