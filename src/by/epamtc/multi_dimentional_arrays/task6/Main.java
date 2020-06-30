package by.epamtc.multi_dimentional_arrays.task6;

public class Main {
    public static void main(String[] args) {
        MagicSquare magicSquare= new MagicSquare();
        int[][] result = magicSquare.getMagicSquare();
        magicSquare.printArray(result);
    }
}
