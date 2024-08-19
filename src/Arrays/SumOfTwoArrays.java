package Arrays;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2= sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] sum = new int[Math.max(n1, n2)];
        int c= 0;
       int i = arr1.length-1;
       int j = arr2.length-1;
       int k = sum.length-1;

       while (k >= 0){
           int d = c;
           if(i>=0){
               d += arr1[i];
           }
           if(j>=0){
               d += arr2[j];
           }

           c = d / 10;
           d = d % 10;

           sum[k] = d;

           i--;
           j--;
           k--;
       }
       if(c != 0){
           System.out.println(c);
       }
       for(int val : sum){
           System.out.println(val);
       }
    }
}


// input: 5, 3, 1, 0, 7, 5; 6, 1, 1, 1, 1, 1, 1
// output: 1, 4, 2, 1, 8, 6