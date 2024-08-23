package Recursion;

import java.util.Scanner;

public class FindMaximumOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maximum(arr,0));
    }

    private static int maximum(int[] arr, int i) {
        if (i == arr.length -1) {return arr[i];}
        int max = maximum(arr,i+1);
        return Math.max(max, arr[i]);
    }
}
