package com.packageCrashCourse;

import java.util.Scanner;

public class Main {
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        System.out.println("Number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Number of columns: ");
        int columns = scanner.nextInt();

        FilledMatrix myMatrix = new FilledMatrix(rows, columns);
        myMatrix.calculateTheNewMatrix();
        myMatrix.printTheBrandNewMatrix();

    }


}
