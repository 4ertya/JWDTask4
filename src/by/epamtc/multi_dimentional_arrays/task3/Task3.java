package by.epamtc.multi_dimentional_arrays.task3;

import java.util.Arrays;

public class Task3 {

    int n = 8;
    int[][] arr = new int[n][n];

    public int[][] getArr() {
        for (int i = 0; i < arr.length; i++) {

            if (i < arr.length / 2) {

                for (int j = i; j < arr[i].length - i; j++) {
                    arr[i][j] = 1;
                }

            } else {

                for (int j = arr[i].length - i - 1; j <= i; j++) {
                    arr[i][j] = 1;
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
