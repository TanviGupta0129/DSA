package Arrays;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getValueInBase(n , b));
    }

    public static int getValueInBase(int n, int b){
        int res = 0;
        int p=1;
        while (n>0){
            int k = n % b;
            n=n/b;
            res += k * p;
            p*=10;
        }
        return res;
    }
}

// input: 57, 2
// output: