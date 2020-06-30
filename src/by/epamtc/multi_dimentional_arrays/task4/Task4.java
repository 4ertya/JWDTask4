package by.epamtc.multi_dimentional_arrays.task4;

public class Task4 {

    private final double[] sourceArray = {-1, -2, -3, 1, 2, 3};

    public double[][] getResultArray() {
        double[][] resultArray = new double[sourceArray.length][sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            for (int j = 0; j < sourceArray.length; j++) {
                resultArray[i][j] = Math.pow(sourceArray[j], i + 1);
            }
        }
        return resultArray;
    }

    public void printArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("% 8.2f  ", array[i][j]);
            }
            System.out.println();
        }
    }
    }

