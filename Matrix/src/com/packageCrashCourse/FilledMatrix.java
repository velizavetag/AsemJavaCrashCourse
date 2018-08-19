package com.packageCrashCourse;

import java.util.Scanner;

public class FilledMatrix {

    private int rows;
    private int columns;
    private int[][] matrix;
    Scanner scanner = new Scanner(System.in);

    public FilledMatrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[rows][columns];

        System.out.println("Insert elements ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        printMatrix(this.matrix, this.rows, this.columns);
    }


    public void printMatrix(int [][] mat, int rows, int columns){

        for(int i = 0; i < rows; i++){
            for(int j = 0; j< columns; j++){
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public  int[][] fillTheMatrixWithZeros() {

        int newRows = rows + 2;
        int newColumns = columns + 2;
        int[][] newMatrix = new int[newRows][newColumns];
        for (int i = 0; i < newRows; i++) {
            for (int j = 0; j < newColumns; j++) {
                if (i == 0 || i == newRows - 1 || j == 0 || j == newColumns - 1) {
                    newMatrix[i][j] = 0;
                } else {
                    newMatrix[i][j] = this.matrix[i - 1][j - 1];
                }
            }
        }

        return newMatrix;
    }

    public int[][] calculateTheNewMatrix(){
        int[][] a = fillTheMatrixWithZeros();
        int[][] b = fillTheMatrixWithZeros();

        int rows = this.rows+2;
        int columns = this.columns +2;

        for(int i = 1; i < rows; i++){
            for( int j = 1; j < columns; j++){

                if(j==columns-1 || i==rows-1){
                    break;
                }
                    a[i][j] = b[i-1][j-1] + b[i-1][j] + b[i-1][j+1] + b[i][j+1] + b[i][j-1] + b[i+1][j+1] + b[i+1][j] + b[i+1][j-1];

            }
        }


        return a;

    }

    public void printTheBrandNewMatrix(){
        int [][] a = calculateTheNewMatrix();
        for (int i = 0; i < this.rows; i++){
            for (int j=0; j< this.columns; j++){
                this.matrix[i][j] = a[i+1][j+1];
            }
        }

        printMatrix(this.matrix, this.rows, this.columns);

    }


}
