package com.company;

public class Main {

    public static void main(String[] args) {

//        Töltsd fel a következő int tömböt értékekkel három módon!
//                Minden kitöltés után írd ki a tömböt soronként, az elemeket szóközzel elválasztva!
//                Erre a kiiratásra használhatsz külön metódust, hogy elkerüld a kód ismétlést!
//
//        1. feladat - Töltsétek fel 1-30-ig sorban a mezőket!
//                1 2 3 4 5 6
//        7 8 9 10 11 12
//        13 14 15 16 17 18
//        19 20 21 22 23 24
//        25 26 27 28 29 30
        int[][] tryItOut = new int[5][6];
        int counter = 1;
        for (int i = 0; i < tryItOut.length; i++) {
            for (int j = 0; j < tryItOut[i].length; j++) {
                tryItOut[i][j] = counter++;

            }

        }
        ArrayPrint(tryItOut);

//        2. feladat - A sor és oszlopszámok összefűzésével.
//        11 12 13 14 15 16
//        21 22 23 24 25 26
//        31 32 33 34 35 36
//        41 42 43 44 45 46
//        51 52 53 54 55 56
        for (int i = 0; i < tryItOut.length; i++) {
            for (int j = 0; j < tryItOut[i].length; j++) {
                tryItOut[i][j] = (10 * (i + 1)) + (j + 1);
            }
        }
        ArrayPrint(tryItOut);

//        3. feladat - A sor első eleme mindig 1-es legyen!
//                A többi elemét úgy számolod ki, hogy a sor előző elemét megszorzod az adott sor sorszámával. (Nem indexével!)
//        1 1 1 1 1 1
//        1 2 4 8 16 32
//        1 3 9 27 81 243
//        1 4 16 64 256 1024
//        1 5 25 125 625 3125
        for (int i = 0; i < tryItOut.length; i++) {
            for (int j = 0; j < tryItOut[i].length; j++) {
                if (i == 0) {
                    tryItOut[i][j] = 1;
                } else {
                    tryItOut[i][j] = (j == 0) ? 1 : tryItOut[i][j - 1] * (i + 1);
                }
            }
        }
        ArrayPrint(tryItOut);
    }

    public static void ArrayPrint(int[][] tryItOut) {
        for (int[] ints : tryItOut) {
            for (int anInt : ints) {
                System.out.print(" " + anInt);
            }
            System.out.println();
        }
        System.out.println("----------------");
    }
}
