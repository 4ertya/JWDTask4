package by.epamtc.multi_dimentional_arrays.task1;

import java.util.Arrays;

public class Task1 {

    private int N = 6;
    private int[][] arr = new int[N][N];


    public int[][] getArray() {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i % 2 == 0)) {
                    arr[i][j] = 1 + j;
                } else {
                    arr[i][j] = N - j;
                }
            }
        }
        return arr;
    }

    public void printArray(int[][]array){
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
