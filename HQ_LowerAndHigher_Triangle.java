package JavaExercises;

import java.util.Arrays;

public class HQ_LowerAndHigher_Triangle {
    public static void main(String[] args) {
        int[][] hq1 = new int[8][8]; int[][] hq2 = new int[8][8]; int x = 1;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <= i; j++) {
                hq1[i][j] = 1;
            }
        }
        System.out.println("Lower: ");
        for (int[] i : hq1)
            System.out.println(Arrays.toString(i));
        System.out.println();

        for (int i = 0; i < 8; i++) {
            for (int j = (i+1); j < 8; j++) {
                hq2[i][j] = 1;
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
               if(i==j){
                   hq2[i][j] = 1;
               }
            }
        }
        System.out.println("Higher: ");
        for (int[] i : hq2)
            System.out.println(Arrays.toString(i));

    }
}
/*  1   0   0   0   0   0   0   0
    1   1   0   0   0   0   0   0
    1   1   1   0   0   0   0   0
    1   1   1   1   0   0   0   0
    1   1   1   1   1   0   0   0
    1   1   1   1   1   1   0   0
    1   1   1   1   1   1   1   0
    1   1   1   1   1   1   1   1
 */