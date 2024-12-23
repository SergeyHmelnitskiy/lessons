package org.example;

public class Main {
    public static void main(String[] args) {
        int [] myArray = {1,1,0,0,1,0,1,1,0,0};
        int [] myArray2 = {1,5,3,2,11,4,5,2,4,8,9,1};

        printThreeWorlds();
        checkSumSing();
        printColor();
        compareNumbers();
        System.out.println(isSumInRange(5,16));
        positiveOrNegativeNumber(-2);
        System.out.println(isPositiveOrNegative(-2));
        printLine("Hello world", 4);
        System.out.println(LeapYearDefinition(1600));
        arrayTransformation(myArray);
        for (int e : myArray) {
            System.out.print(e + " ");
        }
        System.out.println();
        for (int e : fillingAnArray()) {
            System.out.print(e + " ");
        }
        System.out.println();
        incrementingValueInArray(myArray2);
        for (int e : myArray2) {
            System.out.print(e + " ");
        }
        System.out.println();
        for (int[] row : twoDimensionalArray(5)) {
            for (int e : row) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
        for (int e : getOneDimensionalArray(5, 10)) {
            System.out.print(e + " ");
        }
    }
    public static void printThreeWorlds() {
        System.out.println("Orange \nBanana \nApple");
    }
    public static void checkSumSing() {
        int a = -2;
        int b = 3;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 200;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = -2;
        int b = -1;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static boolean isSumInRange(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }
    public static void positiveOrNegativeNumber(int a) {
        if (a >= 0) {
            System.out.println(a + " Положительное число");
        } else {
            System.out.println(a + " Отрицательное число");
        }
    }
    public static boolean isPositiveOrNegative(int a) {
        return a < 0;
    }
    public static void printLine(String line, int a) {
        for (int i = 1; i <= a; i++ ) {
            System.out.println(line);
        }
    }
    public static boolean LeapYearDefinition(int a) {
        return (a % 4 == 0 && a % 100 != 0) || a % 400 == 0;
    }
    public static void arrayTransformation(int [] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 0) {
                myArray[i] = 1;
            } else if (myArray[i] == 1 ) {
                myArray[i] = 0;
            } else break;
        }
    }
    public static int[] fillingAnArray() {
        int [] myArray = new int[100];
        int a = 1;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = a;
            a++;
        } return myArray;
    }
    public static void incrementingValueInArray(int [] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 6) {
                myArray[i] = myArray[i] * 2;
            }
        }
    }
    public static int [][] twoDimensionalArray(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) {
                    array[i][j] = 1;
                }
            }
        } return array;
    }
    public static int [] getOneDimensionalArray(int len, int initialValue) {
        int [] array = new int [len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        } return array;
    }
}