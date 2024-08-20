package Arrays;

import java.util.Scanner;

public class ExitPointOfAMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int dir = 0; //0 -e , 1 -s, 2 - w, 3 - n
        int i = 0;
        int j = 0;

        while (true){
            dir = (dir + matrix[i][j]) % 4;
            if (dir == 0){ // east
                j++;
            } else if (dir == 1){ // south
                i++;
            } else if (dir == 2){ // west
                j--;
            } else if (dir == 3){ // north
                i--;
            }

            if(i < 0){
                i++;
                break;
            } else if (j < 0){
                j++;
                break;
            } else if (i == matrix.length) {
                i--;
                break;
            } else if (j == matrix[0].length) {
               j--;
               break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}

//input: 3 , 3
//  {{0, 1, 0},
//  {0, 1, 1},
//  {0, 0, 0}}
//output:  1
//         0