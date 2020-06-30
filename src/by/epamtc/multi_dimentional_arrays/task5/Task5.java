package by.epamtc.multi_dimentional_arrays.task5;

import java.util.Arrays;

public class Task5 {
    private final int[][] A = {{1,2}, {3,4}};
    private final int[][] B = {{5,6}, {7,8}};

    private boolean isPossible(){
        if (A[0].length==B.length){
            return true;
        }
        return false;
    }

    public int[][] multiplyAbyB() {
        if (!isPossible()){
            return null;
        }

        int[][] c = new int[A.length][B[0].length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = 0;
                for (int s = 0; s < c[i].length; s++) {
                    c[i][j] += A[i][s] * B[s][j];
                }
            }
        }
        return c;
    }

    public void printArray(int[][] array) {
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
