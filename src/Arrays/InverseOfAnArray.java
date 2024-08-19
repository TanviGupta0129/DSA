package Arrays;

import java.util.Scanner;

public class InverseOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res= inverse(arr);
        display(res);
    }

    public static void display(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int j : arr) {
            sb.append(j).append(" ");
        }
        System.out.println(sb.toString());
    }

    public static int[] inverse(int[] arr) {
        int[] inv = new int[arr.length];
        for(int i=0 ;i < arr.length; i++){
            int v = arr[i];
            inv[v] = i;
        }
        return inv;
    }
}

//input: 5, 3, 4, 1, 2, 0
//output: 4, 2, 3, 0, 1