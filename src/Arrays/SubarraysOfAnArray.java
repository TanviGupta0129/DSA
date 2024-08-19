package Arrays;

import java.util.Scanner;

public class SubarraysOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i ; j < arr.length; j++) {
                for(int k = i ; k <= j ; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}

//input : 3, 1, 2, 3
//output:
//        1
//        1	2
//        1	2	3
//        2
//        2	3
//        3