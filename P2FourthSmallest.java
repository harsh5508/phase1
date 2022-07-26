package phase1programs_3;

import java.util.Arrays;

class P2FourthSmallest {
    public static int kthSmallest(Integer[] arr, int k)
    {
        Arrays.sort(arr);
        return arr[k - 1];
    }
 
    public static void main(String[] args)
    {
        int k = 4;
        Integer arr[] = { 11, 45, 26, 4, 9, 65 };
        System.out.print("4'th smallest element is " + kthSmallest(arr, k));
    }
}