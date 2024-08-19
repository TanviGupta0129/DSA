package Arrays;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getValueInDecimal(n , b));
    }

    public static int getValueInDecimal(int n, int b){
        int res = 0;
        int p=1;
        while (n>0){
            int k = n % 10;
            n=n/10;
            res += k * p;
            p*=b;
        }
        return res;
    }
}

// input: 1111010, 2
// output: 122