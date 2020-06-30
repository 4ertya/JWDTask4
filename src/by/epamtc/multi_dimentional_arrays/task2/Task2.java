package by.epamtc.multi_dimentional_arrays.task2;

import java.util.Arrays;

public class Task2 {
    private final int N = 6;
    private int[][] arr = new int[N][N];


    public int[][] getArray() {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = (i + 1) * (2 + j);
                }
            }
        }
        return arr;
    }

    public void printArray(int[][] array) {
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
