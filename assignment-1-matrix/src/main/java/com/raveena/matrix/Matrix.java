package com.raveena.matrix;


import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        addTwoMatrices();
        subTwoMatrices();
        transposeMatrix();
        multiplicationOfTwoMatrices();
        scalarMatrix();
    }

    public static void addTwoMatrices() {
        System.out.println("to add two matrices");
        System.out.println("Enter total rows and columns: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colums = sc.nextInt();
        int firstMatrix[][] = new int[rows][colums];
        int secondMatrix[][] = new int[rows][colums];
        int[][] sumOfTwoMatrix = new int[rows][colums];
        System.out.println("Enter first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                firstMatrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                secondMatrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("After two matrices addition the resulted matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                sumOfTwoMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                System.out.print(sumOfTwoMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void  subTwoMatrices() {
        System.out.println("to substracting two matrices");
        System.out.println("Enter total rows and columns: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colums = sc.nextInt();
        int firstMatrix[][] = new int[rows][colums];
        int secondMatrix[][] = new int[rows][colums];
        int[][] subOfTwoMatrix = new int[rows][colums];
        System.out.println("Enter first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                firstMatrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                secondMatrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                subOfTwoMatrix[i][j] = firstMatrix[i][j] - secondMatrix[i][j];
            }
        }
        System.out.println("After two matrices substraction the resulted matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                System.out.print(subOfTwoMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transposeMatrix() {
        int i, j;
        System.out.println("to transpose Matrix");
        System.out.println("Enter total rows and columns: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int matrix[][] = new int[row][column];
        System.out.println("Enter matrix:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
                System.out.print(" ");
            }
        }
        System.out.println("The above matrix before Transpose is ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("The above matrix after Transpose is ");
        for (i = 0; i < column; i++) {
            for (j = 0; j < row; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void multiplicationOfTwoMatrices() {
        int i, j, k, rowOfA, rowOfB, columnOfA, columnOfB;
        int firstMatrix[][] = new int[20][20];
        int secondMatrix[][] = new int[20][20];
        int multiplicationOfTwoMatrices[][] = new int[20][20];
        System.out.println("to multiple two matrices");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Rows and Cols of A Matrix");
        rowOfA = scanner.nextInt();
        columnOfA = scanner.nextInt();
        System.out.println("Enter Elements of A Matrix");
        for (i = 0; i < rowOfA; i++) {
            for (j = 0; j < columnOfA; j++) {
                firstMatrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter Rows and Cols of B Matrix");
        rowOfB = scanner.nextInt();
        columnOfB = scanner.nextInt();
        System.out.println("Enter Elements of B Matrix");
        for (i = 0; i < rowOfB; i++) {
            for (j = 0; j < columnOfB; j++) {
                secondMatrix[i][j] = scanner.nextInt();
            }
        }
        for (i = 0; i <=rowOfA; i++) {
            for (j = 0; j <=columnOfA; j++) {
                for (k = 0; k <=columnOfB; k++) {
                    multiplicationOfTwoMatrices[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        System.out.println("After multiplying the two Matrices the resulted matrix is");
        for (i = 0; i < rowOfA; i++) {
            for (j = 0; j < columnOfB; j++) {
                System.out.print(multiplicationOfTwoMatrices[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void scalarMatrix() {
        System.out.println("to perform scalar matrix");
        System.out.println("Enter total rows and columns of A matrix: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colums = sc.nextInt();
        int firstMatrix[][] = new int[rows][colums];
        System.out.println("Enter k");
        int k = sc.nextInt();
        int[][] ScalarMatrixK = new int[rows][colums];
        System.out.println("Enter A matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                firstMatrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                ScalarMatrixK[i][j] = firstMatrix[i][j] * k;
            }
        }
        System.out.println("scalar matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                System.out.print(ScalarMatrixK[i][j] + " ");
            }
            System.out.println();
        }
    }
}


