package Arrays;

import java.util.Scanner;

public class FindElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int element = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(element == arr[i]){
                System.out.println(i);
            }
        }
    }
}

// input: 6, 15, 30, 40, 4, 11, 9, 40
// output: 2