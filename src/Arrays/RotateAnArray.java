package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(arr, k);
       display(arr);
    }

    public static void display(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int j : arr) {
            sb.append(j).append(" ");
        }
        System.out.println(sb.toString());
    }

    public static void reverseArray(int[] arr, int i, int j) {
        int li =i;
        int ri = j;
        while (li < ri) {
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            li++;
            ri--;
        }
    }

    public static void rotate(int[] arr, int k) {
        k = k % arr.length;
        if(k < 0){
            k += arr.length;
        }
        reverseArray(arr, 0, arr.length - k - 1);
        reverseArray(arr, arr.length - k, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);
    }
}

// input: 3, 1, 2, 3
// output: 3, 1, 2