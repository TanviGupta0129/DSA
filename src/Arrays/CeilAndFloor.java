package Arrays;

import java.util.Scanner;

public class CeilAndFloor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int data = sc.nextInt();

        int lo = 0;
        int hi = arr.length - 1;
        int ceil =0;
        int floor = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (data < arr[mid]) {
                hi = mid - 1;
                ceil = arr[mid];
            }else if (data > arr[mid]) {
                lo = mid + 1;
                floor = arr[mid];
            }else {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}

// input: 5, 10, 20, 30, 40, 50, 33
// output: 40, 30