package Recursion;

import java.util.Scanner;

public class DisplayArrayInReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        display(arr,0);
    }
    private static void display(int[] arr, int i) {
        if(i == arr.length) return;
        display(arr,i+1);
        System.out.println(arr[i]);
    }
}
