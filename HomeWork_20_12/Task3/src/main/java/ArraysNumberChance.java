package main.java;

public class ArraysNumberChance {
    int[] arrayNumber;
    int[] arrayNumberChance;


    public ArraysNumberChance(int[] arrayNumber, int[] arrayNumberChance) {
        this.arrayNumber = arrayNumber;
        this.arrayNumberChance = arrayNumberChance;
    }

    public int getNumberChance() {
        int s = 0;
        for (int i = 0; i < arrayNumberChance.length; i++) {
            s = s + arrayNumberChance[i];
        }
        int t = 0;

        double k = (Math.random() * 10);
        System.out.println("k " + k);
        double l = k * s;
        System.out.println("l  " + l);
        int min = 0;
        int max = 0;
        for (int j = 0; j < arrayNumber.length; j++) {
            max = min + arrayNumberChance[j] * 10 - 1;
            if ((l <= max) && (l >= min)) {
                t = arrayNumber[j];
            }
            min = max + arrayNumberChance[j] - 1;
        }
        return t;

    }
}
