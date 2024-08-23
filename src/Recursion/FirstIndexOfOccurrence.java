package Recursion;

import java.util.Scanner;

public class FirstIndexOfOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(firstOccurrence(arr, 0, x));
    }
    private static int firstOccurrence(int[] arr, int idx , int x) {
        if (idx == arr.length) { return -1; }

        if (arr[idx] == x) { return idx; }else {
            return firstOccurrence(arr, idx+1, x); }
    }
}
