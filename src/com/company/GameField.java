package com.company;

public class GameField {

    private static final int size = 3;
    private static final char[][] arr = new char[size][size];

    public static void fillField (String str) {
        int count = 0;
        int countChar = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                count++;
                if(count <= 3) {
                    arr[i][k] = str.charAt(countChar);
                    countChar++;
                } else {
                    count = 0;
                    if (countChar == 3) { //Сделать по нормальному!
                        i = 0;
                    } else if (countChar == 6) {
                        i = 1;
                    }
                    break;
                }
            }
        }
    }

    public static void showField () {
        int count = 0;
        System.out.println("---------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("| ");
            for (int k = 0; k < arr.length; k++) {
                count++;
                if(count <= 3) {
                    System.out.print(arr[i][k] + " ");
                } else {
                    System.out.println();
                    count = 0;
                    break;
                }
            }
            System.out.println(" |");
        }
        System.out.println("---------");
    }

    public static boolean checkDiagonal () {
        return false;
    }

    public static boolean checkGorizontal () {
        return false;
    }

    public static boolean checkVertical () {
        return false;
    }

    public static boolean checkFulnessField () {
        return false;
    }







}