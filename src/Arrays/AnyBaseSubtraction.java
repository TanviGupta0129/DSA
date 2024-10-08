package Arrays;

import java.util.Scanner;

public interface AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(getDiff(b , n1, n2));
    }

    public static int getDiff(int b, int n1, int n2) {
        int rv=0;
        int p=1;
        int c=0;

        while(n2 > 0) {
            int d1= n1 % 10;
            int d2= n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

           int d = 0;
           d2 = d2 + c;

           if(d2 >= d1){
               c = 0;
               d = d2 - d1;
           }else{
               c = -1;
               d = d2 + b - d1;
           }

            rv += d * p;
            p *=10;
        }
        return rv;
    }
}

// input: 8, 1212 , 256
// output: 44