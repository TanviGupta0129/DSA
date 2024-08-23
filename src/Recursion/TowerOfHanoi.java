package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int td1= sc.nextInt();
        int td2= sc.nextInt();
        int td3 = sc.nextInt();
        toh(n, td1, td2, td3);
    }

    public static void toh(int n, int td1, int td2, int td3) {
        if(n==0){
            return;
        }
        toh(n - 1 , td1, td3, td2);
        System.out.println(n + "[" + td1 + "->" + td2 + "]");
        toh(n - 1 , td3, td2, td1);
    }
}

//input: 3
//10
//11
//12
//output: 1[10->11]
//        2[10->12]
//        1[11->12]
//        3[10->11]
//1[12->10]
//2[12->11]
//1[10->11]