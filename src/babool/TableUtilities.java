package babool;


import java.util.Random;

public class TableUtilities {
    public static void pint(int[] t) {
        for (int value : t) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static int[] createAndFillTable(int size, int lowerBand, int upperBand) {
        int[] table = new int[size];
        Random random = new Random();
        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(upperBand - lowerBand) + lowerBand;

        }return table;
    }

}