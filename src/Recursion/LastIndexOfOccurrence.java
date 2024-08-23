package Recursion;

import java.util.Scanner;

public class LastIndexOfOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(lastIndex(arr,0,x));
    }
    private static int lastIndex(int[] arr, int idx, int x) {
        if (idx == arr.length) { return -1;}
        int lisa = lastIndex(arr, idx+1, x);
        if(lisa == -1) {
            if (arr[idx] == x) {
                return idx;
            }else {
                return -1;
            }
        }
        return lisa;
    }
}
